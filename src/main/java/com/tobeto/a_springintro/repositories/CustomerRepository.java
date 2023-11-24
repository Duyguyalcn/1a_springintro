package com.tobeto.a_springintro.repositories;

import com.tobeto.a_springintro.entities.customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<customer,Integer>


{
}
