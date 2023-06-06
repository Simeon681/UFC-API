package com.monyo.ufc.service.impl;

import com.monyo.ufc.controller.resources.CoachResource;
import com.monyo.ufc.entity.Coach;
import com.monyo.ufc.repository.CoachRepository;
import com.monyo.ufc.service.CoachService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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
    public CoachResource save(CoachResource resource) {
        Coach coach = COACH_MAPPER.fromCoachResource(resource);
        coach.setTeam(null);

        return COACH_MAPPER.toCoachResource(coachRepository.save(coach));
    }

    @Override
    public CoachResource update(CoachResource coachResource, long id) {
        Coach toUpdate = coachRepository.getReferenceById(id);
        toUpdate.setName(coachResource.getName());

        return COACH_MAPPER.toCoachResource(coachRepository.save(toUpdate));
    }

    @Override
    public void delete(long id) {
        coachRepository.deleteById(id);
    }
}
