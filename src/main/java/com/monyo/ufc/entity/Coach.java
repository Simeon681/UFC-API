package com.monyo.ufc.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Coach {
    @Id
    @GeneratedValue
    private Long id;

    private String firstName;

    private String lastName;

    @ManyToOne
    private Team team;
}
