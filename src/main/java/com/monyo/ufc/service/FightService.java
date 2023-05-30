package com.monyo.ufc.service;

import com.monyo.ufc.controller.resources.FightResource;
import com.monyo.ufc.entity.Fight;

import java.util.List;
import java.util.Optional;

public interface FightService {
    List<FightResource> findAll();

    FightResource getById(long id);

    FightResource save(FightResource fight);

    FightResource update(FightResource fightResource, long id);

    void delete(long id);
}
