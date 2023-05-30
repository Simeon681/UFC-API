package com.monyo.ufc.service;

import com.monyo.ufc.controller.resources.ChampionshipResource;
import com.monyo.ufc.entity.Championship;

import java.util.List;
import java.util.Optional;

public interface ChampionshipService {
    List<ChampionshipResource> findAll();

    ChampionshipResource getById(long id);

    ChampionshipResource save(ChampionshipResource championship);

    ChampionshipResource update(ChampionshipResource championshipResource, long id);

    Optional<Championship> getChampionshipByName(String name);

    void delete(long id);
}
