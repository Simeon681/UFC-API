package com.monyo.ufc.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

@Entity
@Data
public class Team {
    @Id
    @GeneratedValue
    private Long id;

    private String teamName;

    @OneToMany(mappedBy = "team")
    private Set<Coach> coaches;

    @OneToMany(mappedBy = "team")
    private Set<Fighter> fighters;

    @ManyToOne
    private Championship championships;
}
