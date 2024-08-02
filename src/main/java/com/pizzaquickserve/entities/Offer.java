package com.pizzaquickserve.entities;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Offer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;
    private double discountPercentage;
    private boolean isActive;
}
