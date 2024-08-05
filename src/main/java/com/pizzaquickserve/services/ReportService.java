package com.pizzaquickserve.services;

import com.pizzaquickserve.entities.Customer;
import com.pizzaquickserve.entities.Order;
import com.pizzaquickserve.repositories.CustomerRepository;
import com.pizzaquickserve.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReportService {
    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private CustomerRepository customerRepository;

    public List<Order> getSalesReport() {
        return orderRepository.findAll();
    }

    public List<Customer> getActiveUsersReport() {
        return customerRepository.findAll();
    }
}
