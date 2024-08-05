package com.pizzaquickserve.services;

import com.pizzaquickserve.entities.Customer;
import com.pizzaquickserve.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public Customer register(Customer customer) {
        customer.setPassword(passwordEncoder.encode(customer.getPassword()));
        return customerRepository.save(customer);
    }

    public Optional<Customer> findById(Long id) {
        return customerRepository.findById(id);
    }

    public Customer updateCustomer(Long id, Customer customer) {
        Optional<Customer> existingCustomer = customerRepository.findById(id);
        if (existingCustomer.isPresent()) {
            Customer updatedCustomer = existingCustomer.get();
            updatedCustomer.setEmail(customer.getEmail());
            updatedCustomer.setPassword(passwordEncoder.encode(customer.getPassword()));
            return customerRepository.save(updatedCustomer);
        } else {
            throw new IllegalArgumentException("Customer with ID " + id + " not found");
        }
    }
}
