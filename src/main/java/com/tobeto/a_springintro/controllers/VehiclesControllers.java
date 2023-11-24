package com.tobeto.a_springintro.controllers;

import com.tobeto.a_springintro.entities.address;
import com.tobeto.a_springintro.entities.staff;
import com.tobeto.a_springintro.entities.vehicle;
import com.tobeto.a_springintro.repositories.VehicleRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/vehicles")
public class VehiclesControllers {


    private final VehicleRepository vehicleRepository;

    public VehiclesControllers(VehicleRepository vehicleRepository) {
        this.vehicleRepository = vehicleRepository;
    }


    @GetMapping
    public List<vehicle> getAll() {

      List<vehicle>vehicles  = vehicleRepository.findAll();
return vehicles;

    }
    @GetMapping("{id}")
    public vehicle getById(@PathVariable int id){
        return vehicleRepository.findById(id).orElseThrow();
    }

    @PostMapping
    public void add(@RequestBody vehicle vehicle){
        vehicleRepository.save(vehicle);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable int id) {

        vehicle vehicleToDelete = vehicleRepository.findById(id).orElseThrow();
        vehicleRepository.delete(vehicleToDelete);


    }

    }











