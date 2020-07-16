package com.vishnu.beerbrewery.services;

import com.vishnu.beerbrewery.web.model.CustomerDTO;

import java.util.UUID;

public interface CustomerService {
    CustomerDTO getCustomerById(UUID customerId);
}
