package com.pizzaquickserve.repositories;

import com.pizzaquickserve.entities.Pizza;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PizzaRepository extends JpaRepository<Pizza, Long> {
}
