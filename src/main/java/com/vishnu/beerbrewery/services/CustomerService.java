package com.vishnu.beerbrewery.services;

import com.vishnu.beerbrewery.web.model.CustomerDTO;

import java.util.UUID;

public interface CustomerService {
    CustomerDTO getCustomerById(UUID customerId);

    void deleteById(UUID customerId);

    void updateCustomer(UUID customerId, CustomerDTO customerDto);

    CustomerDTO saveNewCustomer(CustomerDTO customerDto);
}
