package com.pizzaquickserve.controllers;

import com.pizzaquickserve.entities.Pizza;
import com.pizzaquickserve.services.PizzaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pizza")
public class PizzaController {
    @Autowired
    private PizzaService pizzaService;

    @PostMapping("/create")
    public ResponseEntity<Pizza> createPizza(@RequestBody Pizza pizza) {
        return ResponseEntity.ok(pizzaService.createPizza(pizza));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Pizza> getPizzaById(@PathVariable Long id) {
        return pizzaService.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/all")
    public ResponseEntity<List<Pizza>> getAllPizzas() {
        return ResponseEntity.ok(pizzaService.findAll());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Pizza> updatePizza(@PathVariable Long id, @RequestBody Pizza pizza) {
        return ResponseEntity.ok(pizzaService.updatePizza(pizza));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePizza(@PathVariable Long id) {
        pizzaService.deletePizza(id);
        return ResponseEntity.ok().build();
    }
}
