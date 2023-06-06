package com.monyo.ufc.service.impl;

import com.monyo.ufc.controller.resources.TeamResource;
import com.monyo.ufc.entity.Team;
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
        Team team1 = TEAM_MAPPER.fromTeamResource(team);
        team1.setFighters(null);
        team1.setCoach(null);

        return TEAM_MAPPER.toTeamResource(teamRepository.save(team1));
    }

    @Override
    public TeamResource update(TeamResource teamResource, long id) {
        Team toUpdate = teamRepository.getReferenceById(id);
        toUpdate.setName(teamResource.getName());

        return TEAM_MAPPER.toTeamResource(teamRepository.save(toUpdate));
    }

    @Override
    public void delete(long id) {
        teamRepository.deleteById(id);
    }
}
