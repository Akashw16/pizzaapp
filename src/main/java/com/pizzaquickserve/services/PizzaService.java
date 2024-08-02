package com.pizzaquickserve.services;

import com.pizzaquickserve.entities.Pizza;
import com.pizzaquickserve.repositories.PizzaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PizzaService {
    @Autowired
    private PizzaRepository pizzaRepository;

    public Pizza createPizza(Pizza pizza) {
        return pizzaRepository.save(pizza);
    }

    public Optional<Pizza> findById(Long id) {
        return pizzaRepository.findById(id);
    }

    public List<Pizza> findAll() {
        return pizzaRepository.findAll();
    }

    public Pizza updatePizza(Pizza pizza) {
        return pizzaRepository.save(pizza);
    }

    public void deletePizza(Long id) {
        pizzaRepository.deleteById(id);
    }
}
