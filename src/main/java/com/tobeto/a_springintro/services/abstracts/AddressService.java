package com.tobeto.a_springintro.services.abstracts;

import com.tobeto.a_springintro.services.dtos.address.requests.AddAddressRequest;
import org.springframework.web.bind.annotation.RequestBody;

public interface AddressService {

    void add(AddAddressRequest request);







}
