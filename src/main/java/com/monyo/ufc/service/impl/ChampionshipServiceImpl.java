package com.monyo.ufc.service.impl;

import com.monyo.ufc.controller.resources.ChampionshipResource;
import com.monyo.ufc.entity.Championship;
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
        Championship championship1 = CHAMPIONSHIP_MAPPER.fromChampionshipResource(championship);
        championship1.setFights(null);
        championship1.setTeams(null);

        return CHAMPIONSHIP_MAPPER.toChampionshipResource(championshipRepository.save(championship1));
    }

    @Override
    public ChampionshipResource update(ChampionshipResource championshipResource, long id) {
        Championship toUpdate = championshipRepository.getReferenceById(id);
        toUpdate.setName(championshipResource.getName());
        toUpdate.setDescription(championshipResource.getDescription());

        return CHAMPIONSHIP_MAPPER.toChampionshipResource(championshipRepository.save(toUpdate));
    }

    @Override
    public void delete(long id) {
        championshipRepository.deleteById(id);
    }
}
