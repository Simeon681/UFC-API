package com.monyo.ufc.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

@Entity
@Data
public class Fight {
    @Id
    @GeneratedValue
    private Long id;

    @OneToMany(mappedBy = "fight")
    private Set<Fighter> fighter2;

    @ManyToOne
    private Championship championship;
}
