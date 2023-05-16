package com.monyo.ufc.repository;

import com.monyo.ufc.entity.Fight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FightRepository extends JpaRepository<Fight, Long> {
}
