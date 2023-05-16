package com.monyo.ufc.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

@Entity
@Data
public class FighterStats {
    @Id
    @GeneratedValue
    private Long id;

    @OneToOne
    private Fighter fighter;

    @OneToMany(mappedBy = "fighterStats")
    private Set<Championship> championships;
}