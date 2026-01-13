package com.ecoride.api.service.impl;

import com.ecoride.api.dto.RideRequest;
import com.ecoride.api.entity.*;
import com.ecoride.api.repository.*;
import com.ecoride.api.service.RideService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class RideServiceImpl implements RideService {

    @Autowired private RideRepository rideRepository;
    @Autowired private UserRepository userRepository;
    @Autowired private BookingRepository bookingRepository;

    @Override
    public Ride postRide(RideRequest request, String driverEmail) {
        User driver = userRepository.findByEmail(driverEmail)
                .orElseThrow(() -> new RuntimeException("Driver not found"));
        
        Ride ride = new Ride();
        ride.setSource(request.getSource());
        ride.setDestination(request.getDestination());
        ride.setDepartureTime(request.getDepartureTime());
        ride.setAvailableSeats(request.getAvailableSeats());
        ride.setPrice(request.getPrice());
        ride.setDriver(driver);
        
        return rideRepository.save(ride);
    }

    @Override
    public List<Ride> searchRides(String source, String destination, int seats) {
        return rideRepository.findBySourceAndDestinationAndAvailableSeatsGreaterThanEqual(source, destination, seats);
    }

    @Override
    @Transactional // Isse data consistency bani rahegi
    public Booking bookRide(Long rideId, int seats, String passengerEmail) {
        Ride ride = rideRepository.findById(rideId)
                .orElseThrow(() -> new RuntimeException("Ride not found"));

        if (ride.getAvailableSeats() < seats) {
            throw new RuntimeException("Not enough seats available!");
        }

        User passenger = userRepository.findByEmail(passengerEmail)
                .orElseThrow(() -> new RuntimeException("Passenger not found"));

        // Seats update karna
        ride.setAvailableSeats(ride.getAvailableSeats() - seats);
        rideRepository.save(ride);

        // Booking record
        Booking booking = new Booking();
        booking.setRide(ride);
        booking.setPassenger(passenger);
        booking.setSeatsBooked(seats);
        booking.setBookingTime(LocalDateTime.now());
        booking.setStatus("CONFIRMED");

        return bookingRepository.save(booking);
    }
}