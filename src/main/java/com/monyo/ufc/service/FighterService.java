package com.monyo.ufc.service;

import com.monyo.ufc.controller.resources.FighterResource;
import com.monyo.ufc.entity.Fighter;

import java.util.List;
import java.util.Optional;

public interface FighterService {
    List<FighterResource> findAll();

    FighterResource getById(long id);

    FighterResource update(FighterResource fighter);

    void delete(long id);
}
