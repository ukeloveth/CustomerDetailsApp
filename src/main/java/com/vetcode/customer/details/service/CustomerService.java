package com.vetcode.customer.details.service;

import com.vetcode.customer.details.dto.CustomerRequestDto;
import com.vetcode.customer.details.dto.CustomerResponseDto;

import java.util.List;

public interface CustomerService {
    List<CustomerResponseDto> getAllCustomers();

    CustomerResponseDto getCustomerById(String id);

    CustomerResponseDto createCustomer(CustomerRequestDto customerRequestDto);

    CustomerResponseDto updateCustomer(String id, CustomerRequestDto updatedCustomerRequestDto); // Change the id type to String

    void deleteCustomer(String id);
}
