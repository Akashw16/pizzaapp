package com.pizzaquickserve.entities;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private Order order;
    private String paymentMethod;
    private String paymentStatus;
    private double amount;
}
