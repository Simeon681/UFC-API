package com.monyo.ufc.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Team {
    @Id
    @GeneratedValue
    private Long id;

    private String teamName;

    @OneToOne
    private Coach coach;

    @OneToMany
    private List<Fighter> fighters;
}
