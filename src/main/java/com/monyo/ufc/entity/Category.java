package com.monyo.ufc.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Category {
    @Id
    @GeneratedValue
    private Long id;

    private String name;
}
