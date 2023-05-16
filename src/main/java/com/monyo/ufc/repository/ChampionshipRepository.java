package com.monyo.ufc.repository;

import com.monyo.ufc.entity.Championship;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChampionshipRepository extends JpaRepository<Championship, Long> {
}