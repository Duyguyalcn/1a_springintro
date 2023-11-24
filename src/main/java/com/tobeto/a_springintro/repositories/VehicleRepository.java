package com.tobeto.a_springintro.repositories;

import com.tobeto.a_springintro.entities.vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleRepository extends JpaRepository<vehicle,Integer> {
}
