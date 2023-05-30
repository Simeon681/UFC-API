package com.monyo.ufc.mapper;

import com.monyo.ufc.controller.resources.FightResource;
import com.monyo.ufc.entity.Fight;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface FightMapper {
    FightMapper FIGHT_MAPPER = Mappers.getMapper(FightMapper.class);

    @Mapping(target = "championship.name", source = "fightResource.championship")
    @Mapping(target = "fighter1.name", source = "fightResource.fighter1")
    @Mapping(target = "fighter2.name", source = "fightResource.fighter2")
    @Mapping(target = "winner.name", source = "fightResource.winner")
    Fight fromFightResource(FightResource fightResource);

    @Mapping(target = "championship", source = "fight.championship.name")
    @Mapping(target = "fighter1", source = "fight.fighter1.name")
    @Mapping(target = "fighter2", source = "fight.fighter2.name")
    @Mapping(target = "winner", source = "fight.winner.name")
    FightResource toFightResource(Fight fight);

    List<FightResource> toFightResources(List<Fight> fights);
}
