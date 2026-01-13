package com.ecoride.api.service;

import com.ecoride.api.dto.RideRequest;
import com.ecoride.api.entity.*;
import java.util.List;

public interface RideService {
    Ride postRide(RideRequest rideRequest, String driverEmail);
    List<Ride> searchRides(String source, String destination, int seats);
    Booking bookRide(Long rideId, int seats, String passengerEmail);
}