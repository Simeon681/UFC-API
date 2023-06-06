package com.monyo.ufc.service;

import com.monyo.ufc.controller.resources.FightResource;
import com.monyo.ufc.controller.resources.FighterResource;

import java.util.List;

public interface FightService {
    List<FightResource> findAll();

    FightResource getById(long id);

    FightResource save(FightResource fight);

    FightResource update(FightResource fightResource, long id);

    void delete(long id);
}
