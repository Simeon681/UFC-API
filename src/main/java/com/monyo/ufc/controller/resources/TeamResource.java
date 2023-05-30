package com.monyo.ufc.controller.resources;

import lombok.Data;

import java.util.List;

@Data
public class TeamResource {
    private Long id;
    private String name;
    private String coach;
    private List<FighterResource> fighters;
}
