package com.monyo.ufc.mapper;

import com.monyo.ufc.controller.resources.TeamResource;
import com.monyo.ufc.entity.Team;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(uses = FighterMapper.class)
public interface TeamMapper {
    TeamMapper TEAM_MAPPER = Mappers.getMapper(TeamMapper.class);

    @Mapping(target = "coach.name", source = "teamResource.coach")
    Team fromTeamResource(TeamResource teamResource);

    @Mapping(target = "coach", source = "team.coach.name")
    TeamResource toTeamResource(Team team);

    List<TeamResource> toTeamResources(List<Team> teams);
}
