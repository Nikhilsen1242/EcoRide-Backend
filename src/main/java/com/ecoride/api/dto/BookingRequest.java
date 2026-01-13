package com.ecoride.api.dto;

import lombok.Data;

@Data
public class BookingRequest {
    private Long rideId;
    private int seats;
}