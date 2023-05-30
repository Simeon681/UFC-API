package com.monyo.ufc.mapper;

import com.monyo.ufc.controller.resources.ChampionshipResource;
import com.monyo.ufc.entity.Championship;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(uses = {FightMapper.class, TeamMapper.class})
public interface ChampionshipMapper {
    ChampionshipMapper CHAMPIONSHIP_MAPPER = Mappers.getMapper(ChampionshipMapper.class);

    Championship fromChampionshipResource(ChampionshipResource championshipResource);

    ChampionshipResource toChampionshipResource(Championship championship);

    List<ChampionshipResource> toChampionshipResources(List<Championship> championships);
}
