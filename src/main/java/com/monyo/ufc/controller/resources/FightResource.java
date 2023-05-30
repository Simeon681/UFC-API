package com.monyo.ufc.controller.resources;

import lombok.Data;

@Data
public class FightResource {
    private Long id;
    private String championship;
    private String fighter1;
    private String fighter2;
    private String winner;
    private String method;
}
