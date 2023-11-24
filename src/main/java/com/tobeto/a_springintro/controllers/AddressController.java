package com.tobeto.a_springintro.controllers;

import com.tobeto.a_springintro.services.abstracts.AddressService;
import com.tobeto.a_springintro.services.dtos.address.requests.AddAddressRequest;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("api/address")



public class AddressController {
    private AddressService addressService;

    public AddressController(AddressService addressService) {
        this.addressService = addressService;
    }

    @PostMapping
    public void add(@RequestBody AddAddressRequest request){
addressService.add(request);

    }













}






