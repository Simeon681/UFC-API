package com.monyo.ufc.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Fight {
    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    private Championship championship;

    @ManyToOne
    private Fighter fighter1;

    @ManyToOne
    private Fighter fighter2;

    @ManyToOne
    private Fighter winner;

    private String method;
}
