package com.monyo.ufc.repository;

import com.monyo.ufc.entity.FighterStats;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FighterStatsRepository extends JpaRepository<FighterStats, Long> {
}
