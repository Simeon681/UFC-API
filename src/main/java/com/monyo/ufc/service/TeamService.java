package com.monyo.ufc.service;

import com.monyo.ufc.controller.resources.TeamResource;
import com.monyo.ufc.entity.Team;

import java.util.List;
import java.util.Optional;

public interface TeamService {
    List<TeamResource> findAll();

    TeamResource getById(long id);

    TeamResource save(TeamResource team);

    TeamResource update(TeamResource teamResource, long id);

    void delete(long id);
}
