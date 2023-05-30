package com.monyo.ufc.service.impl;

import com.monyo.ufc.controller.resources.CoachResource;
import com.monyo.ufc.entity.Coach;
import com.monyo.ufc.repository.CoachRepository;
import com.monyo.ufc.service.CoachService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.monyo.ufc.mapper.CoachMapper.COACH_MAPPER;

@Service
@RequiredArgsConstructor
public class CoachServiceImpl implements CoachService {
    private final CoachRepository coachRepository;

    @Override
    public List<CoachResource> findAll() {
        return COACH_MAPPER.toCoachResources(coachRepository.findAll());
    }

    @Override
    public CoachResource getById(long id) {
        return COACH_MAPPER.toCoachResource(coachRepository.getReferenceById(id));
    }

    @Override
    public CoachResource save(CoachResource coach) {
        Coach coach1 = COACH_MAPPER.fromCoachResource(coach);
        return null;
    }

    @Override
    public CoachResource update(CoachResource coachResource, long id) {
        return null;
    }

    @Override
    public void delete(long id) {

    }
}
