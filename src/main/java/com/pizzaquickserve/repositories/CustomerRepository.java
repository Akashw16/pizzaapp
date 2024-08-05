package com.pizzaquickserve.repositories;

import com.pizzaquickserve.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
    // Custom query methods (if needed) can be added here
}
