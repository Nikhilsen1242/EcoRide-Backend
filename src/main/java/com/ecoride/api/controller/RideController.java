package com.ecoride.api.controller;

import com.ecoride.api.dto.BookingRequest;
import com.ecoride.api.dto.RideRequest;
import com.ecoride.api.entity.Booking;
import com.ecoride.api.entity.Ride;
import com.ecoride.api.service.RideService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/rides")
public class RideController {

    @Autowired
    private RideService rideService;

    // Driver apni ride post karega
    @PostMapping("/post")
    public ResponseEntity<Ride> postRide(@RequestBody RideRequest rideRequest, Authentication authentication) {
        return ResponseEntity.ok(rideService.postRide(rideRequest, authentication.getName()));
    }

    // Passenger ride search karega
    @GetMapping("/search")
    public ResponseEntity<List<Ride>> searchRides(
            @RequestParam String from, 
            @RequestParam String to, 
            @RequestParam int seats) {
        return ResponseEntity.ok(rideService.searchRides(from, to, seats));
    }

    // Passenger ride book karega
    @PostMapping("/book")
    public ResponseEntity<Booking> bookRide(@RequestBody BookingRequest bookingRequest, Authentication authentication) {
        return ResponseEntity.ok(rideService.bookRide(
                bookingRequest.getRideId(), 
                bookingRequest.getSeats(), 
                authentication.getName()));
    }
}