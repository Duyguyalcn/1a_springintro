package com.tobeto.a_springintro.controllers;

import com.tobeto.a_springintro.entities.address;
import com.tobeto.a_springintro.entities.cost;
import com.tobeto.a_springintro.entities.rent;
import com.tobeto.a_springintro.repositories.RentRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/rents")
public class RentsController {

    private final RentRepository rentRepository;

    public RentsController(RentRepository rentRepository) {
        this.rentRepository = rentRepository;
    }

    @GetMapping
    public List<rent> getAll(){

        List<rent>rents= rentRepository.findAll();
return rents;

}
    @GetMapping("{id}")
    public rent getById(@PathVariable int id){
        return rentRepository.findById(id).orElseThrow();
    }

    @PostMapping
    public void add(@RequestBody rent rent){
        rentRepository.save(rent);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable int id) {

        rent rentToDelete = rentRepository.findById(id).orElseThrow();
        rentRepository.delete(rentToDelete);


    }


    }
