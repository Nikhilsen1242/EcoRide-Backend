package com.ecoride.api.repository;

import com.ecoride.api.entity.Ride;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface RideRepository extends JpaRepository<Ride, Long> {
    // Ye query un rides ko dhundegi jahan source, destination match ho aur seats khali hon
    List<Ride> findBySourceAndDestinationAndAvailableSeatsGreaterThanEqual(String source, String destination, int seats);
}