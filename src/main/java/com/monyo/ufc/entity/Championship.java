package com.monyo.ufc.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Championship {
    @Id
    @GeneratedValue
    private Long id;

    private String championshipName;

    private String description;

    @ManyToMany
    private List<Team> teams;

    @OneToMany(mappedBy = "championship")
    private List<Fight> fights;
}
