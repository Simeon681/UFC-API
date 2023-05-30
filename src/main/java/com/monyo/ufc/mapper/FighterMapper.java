package com.monyo.ufc.mapper;

import com.monyo.ufc.controller.resources.FighterResource;
import com.monyo.ufc.entity.Fighter;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface FighterMapper {
    FighterMapper FIGHTER_MAPPER = Mappers.getMapper(FighterMapper.class);

    @Mapping(target = "category.name", source = "fighterResource.category")
    @Mapping(target = "team.name", source = "fighterResource.team")
    Fighter fromFighterResource(FighterResource fighterResource);

    @Mapping(target = "category", source = "fighter.category.name")
    @Mapping(target = "team", source = "fighter.team.name")
    FighterResource toFighterResource(Fighter fighter);

    List<FighterResource> toFighterResources(List<Fighter> fighters);
}
