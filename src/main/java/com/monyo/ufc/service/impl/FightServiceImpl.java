package com.monyo.ufc.service.impl;

import com.monyo.ufc.controller.resources.FightResource;
import com.monyo.ufc.repository.FightRepository;
import com.monyo.ufc.service.FightService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.monyo.ufc.mapper.FightMapper.FIGHT_MAPPER;

@Service
@RequiredArgsConstructor
public class FightServiceImpl implements FightService {
    private final FightRepository fightRepository;

    @Override
    public List<FightResource> findAll() {
        return FIGHT_MAPPER.toFightResources(fightRepository.findAll());
    }

    @Override
    public FightResource getById(long id) {
        return FIGHT_MAPPER.toFightResource(fightRepository.getReferenceById(id));
    }

    @Override
    public FightResource save(FightResource fight) {
        return null;
    }

    @Override
    public FightResource update(FightResource fightResource, long id) {
        return null;
    }

    @Override
    public void delete(long id) {

    }
}
