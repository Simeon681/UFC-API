package com.monyo.ufc.service.impl;

import com.monyo.ufc.controller.resources.TeamResource;
import com.monyo.ufc.repository.TeamRepository;
import com.monyo.ufc.service.TeamService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.monyo.ufc.mapper.TeamMapper.TEAM_MAPPER;

@Service
@RequiredArgsConstructor
public class TeamServiceImpl implements TeamService {
    private final TeamRepository teamRepository;

    @Override
    public List<TeamResource> findAll() {
        return TEAM_MAPPER.toTeamResources(teamRepository.findAll());
    }

    @Override
    public TeamResource getById(long id) {
        return TEAM_MAPPER.toTeamResource(teamRepository.getReferenceById(id));
    }

    @Override
    public TeamResource save(TeamResource team) {
        return null;
    }

    @Override
    public TeamResource update(TeamResource teamResource, long id) {
        return null;
    }

    @Override
    public void delete(long id) {

    }
}
