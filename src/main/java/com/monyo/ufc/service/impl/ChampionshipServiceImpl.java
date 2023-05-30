package com.monyo.ufc.service.impl;

import com.monyo.ufc.controller.resources.ChampionshipResource;
import com.monyo.ufc.repository.ChampionshipRepository;
import com.monyo.ufc.service.ChampionshipService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.monyo.ufc.mapper.ChampionshipMapper.CHAMPIONSHIP_MAPPER;

@Service
@RequiredArgsConstructor
public class ChampionshipServiceImpl implements ChampionshipService {
    private final ChampionshipRepository championshipRepository;

    @Override
    public List<ChampionshipResource> findAll() {
        return CHAMPIONSHIP_MAPPER.toChampionshipResources(championshipRepository.findAll());
    }

    @Override
    public ChampionshipResource getById(long id) {
        return CHAMPIONSHIP_MAPPER.toChampionshipResource(championshipRepository.getReferenceById(id));
    }

    @Override
    public ChampionshipResource save(ChampionshipResource championship) {
        return null;
    }

    @Override
    public ChampionshipResource update(ChampionshipResource championshipResource, long id) {
        return null;
    }

    @Override
    public void delete(long id) {

    }
}
