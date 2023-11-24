package com.tobeto.a_springintro.controllers;

import com.tobeto.a_springintro.entities.address;
import com.tobeto.a_springintro.entities.customer;
import com.tobeto.a_springintro.repositories.CustomerRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/customers")
public class CustomersController {

private final CustomerRepository customerRepository;

    public CustomersController(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @GetMapping
    public List<customer> getAll() {
        List<customer>customers=customerRepository.findAll();
return customers;

    }
    @GetMapping("{id}")
    public customer getById(@PathVariable int id){
        return customerRepository.findById(id).orElseThrow();
    }

    @PostMapping
    public void add(@RequestBody customer customer){
        customerRepository.save(customer);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable int id){

        customer customerToDelete= customerRepository.findById(id).orElseThrow();
        customerRepository.delete(customerToDelete);




















}}
