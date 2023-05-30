package com.monyo.ufc.service;

import com.monyo.ufc.controller.resources.CoachResource;
import com.monyo.ufc.entity.Coach;

import java.util.List;
import java.util.Optional;

public interface CoachService {
    List<CoachResource> findAll();

    CoachResource getById(long id);

    CoachResource save(CoachResource coach);

    CoachResource update(CoachResource coachResource, long id);

    Optional<Coach> getCoachByName(String name);

    void delete(long id);
}
