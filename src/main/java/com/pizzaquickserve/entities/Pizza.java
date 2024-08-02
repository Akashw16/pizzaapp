package com.pizzaquickserve.entities;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Pizza {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String size;
    private double price;
}
