package com.monyo.ufc.service.impl;

import com.monyo.ufc.controller.resources.FightResource;
import com.monyo.ufc.entity.Fight;
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
        Fight fight1 = FIGHT_MAPPER.fromFightResource(fight);
        fight1.setChampionship(null);
        fight1.setWinner(null);
        fight1.setFighter1(null);
        fight1.setFighter2(null);

        return FIGHT_MAPPER.toFightResource(fightRepository.save(fight1));
    }

    @Override
    public FightResource update(FightResource fightResource, long id) {
        Fight toUpdate = fightRepository.getReferenceById(id);
        toUpdate.setMethod(fightResource.getMethod());

        return FIGHT_MAPPER.toFightResource(fightRepository.save(toUpdate));
    }

    @Override
    public void delete(long id) {
        fightRepository.deleteById(id);
    }
}
