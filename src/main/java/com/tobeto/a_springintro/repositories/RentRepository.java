package com.tobeto.a_springintro.repositories;

import com.tobeto.a_springintro.entities.rent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RentRepository extends JpaRepository< rent,Integer> {
}
