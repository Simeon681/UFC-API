package com.monyo.ufc.repository;

import com.monyo.ufc.entity.Fighter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FighterRepository extends JpaRepository<Fighter, Long> {
}
