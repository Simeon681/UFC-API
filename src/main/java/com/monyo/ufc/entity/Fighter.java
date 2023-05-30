package com.monyo.ufc.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Fighter {
    @Id
    @GeneratedValue
    private Long id;

    private String firstName;

    private String lastName;

    private int age;

    private double height;

    private double weight;

    private int wins;

    private int losses;

    private int draws;

    @ManyToOne
    private Category category;

    @ManyToOne
    private Team team;
}
