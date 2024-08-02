package com.pizzaquickserve.repositories;

import com.pizzaquickserve.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
