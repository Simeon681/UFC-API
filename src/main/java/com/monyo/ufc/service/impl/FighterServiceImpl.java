package com.monyo.ufc.service.impl;

import com.monyo.ufc.controller.resources.FighterResource;
import com.monyo.ufc.entity.Fighter;
import com.monyo.ufc.repository.FighterRepository;
import com.monyo.ufc.service.CategoryService;
import com.monyo.ufc.service.FighterService;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.monyo.ufc.mapper.FighterMapper.FIGHTER_MAPPER;

@Service
@RequiredArgsConstructor
public class FighterServiceImpl implements FighterService {
    private final FighterRepository fighterRepository;
    private final CategoryService categoryService;

    @Override
    public List<FighterResource> findAll() {
        return FIGHTER_MAPPER.toFighterResources(fighterRepository.findAll());
    }

    @Override
    public FighterResource getById(long id) {
        return FIGHTER_MAPPER.toFighterResource(fighterRepository.getReferenceById(id));
    }

    @Override
    public FighterResource update(FighterResource fighter) {
        Fighter fighter1 = FIGHTER_MAPPER.fromFighterResource(fighter);
        categoryService.getCategoryByName(fighter1.getCategory().getName())
                .ifPresentOrElse(
                        fighter1::setCategory,
                        () -> {
                            throw new EntityNotFoundException("");
                        }
                );

        return FIGHTER_MAPPER.toFighterResource(fighterRepository.save(fighter1));
    }

    @Override
    public void delete(long id) {
        fighterRepository.deleteById(id);
    }
}
