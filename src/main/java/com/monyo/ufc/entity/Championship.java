package com.monyo.ufc.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.Set;

@Entity
@Data
public class Championship {
    @Id
    @GeneratedValue
    private Long id;

    private String championshipName;

    @OneToMany
    private Set<Team> teams;

    @OneToMany(mappedBy = "championship")
    private Set<Fight> fights;

    @ManyToOne
    private FighterStats fighterStats;

    private Date date;
}
