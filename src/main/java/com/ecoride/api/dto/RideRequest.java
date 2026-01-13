package com.ecoride.api.dto;

import lombok.Data;
import java.time.LocalDateTime;

@Data
public class RideRequest {
    private String source;
    private String destination;
    private LocalDateTime departureTime;
    private int availableSeats;
    private double price;
}