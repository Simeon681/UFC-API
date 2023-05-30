package com.monyo.ufc.controller.resources;

import lombok.Data;

@Data
public class FighterResource {
    private Long id;
    private String name;
    private int age;
    private double height;
    private double weight;
    private int wins;
    private int losses;
    private int draws;
    private String category;
    private String team;
}
