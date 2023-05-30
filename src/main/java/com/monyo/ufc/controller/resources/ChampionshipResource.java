package com.monyo.ufc.controller.resources;

import lombok.Data;

import java.util.List;

@Data
public class ChampionshipResource {
    private Long id;
    private String name;
    private String description;
    private List<TeamResource> teams;
    private List<FightResource> fights;
}
