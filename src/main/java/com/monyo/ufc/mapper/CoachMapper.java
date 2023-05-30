package com.monyo.ufc.mapper;

import com.monyo.ufc.controller.resources.CoachResource;
import com.monyo.ufc.entity.Coach;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(uses = TeamMapper.class)
public interface CoachMapper {
    CoachMapper COACH_MAPPER = Mappers.getMapper(CoachMapper.class);

    @Mapping(target = "team.name", source = "coachResource.team")
    Coach fromCoachResource(CoachResource coachResource);

    @Mapping(target = "team", source = "coach.team.name")
    CoachResource toCoachResource(Coach coach);

    List<CoachResource> toCoachResources(List<Coach> coaches);
}
