package com.poo.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.poo.dsmovie.entities.Score;
import com.poo.dsmovie.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {

	
}
