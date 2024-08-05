package com.pizzaquickserve.services;

import com.pizzaquickserve.entities.Customer;
import com.pizzaquickserve.repositories.CustomerRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.security.crypto.password.PasswordEncoder;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class CustomerServiceTest {

    @Mock
    private CustomerRepository customerRepository;

    @Mock
    private PasswordEncoder passwordEncoder;

    @InjectMocks
    private CustomerService customerService;

    @Test
    public void testRegisterCustomer() {
        Customer customer = new Customer();
        customer.setEmail("test@test.com");
        customer.setPassword("password");

        when(passwordEncoder.encode(any())).thenReturn("encodedPassword");
        when(customerRepository.save(any(Customer.class))).thenReturn(customer);

        Customer savedCustomer = customerService.register(customer);

        assertNotNull(savedCustomer);
        assertEquals("test@test.com", savedCustomer.getEmail());
        assertEquals("encodedPassword", savedCustomer.getPassword());
    }
}
