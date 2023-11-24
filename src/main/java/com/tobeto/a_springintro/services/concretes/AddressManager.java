package com.tobeto.a_springintro.services.concretes;

import com.tobeto.a_springintro.services.abstracts.AddressService;
import com.tobeto.a_springintro.services.dtos.address.requests.AddAddressRequest;
import org.springframework.stereotype.Service;

@Service
public class AddressManager implements AddressService {


    @Override
    public void add(AddAddressRequest request) {

    }
}
