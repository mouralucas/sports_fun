package com.rolf.sports_fun.repositories;

import com.rolf.sports_fun.entities.LeagueEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LeagueRepository extends JpaRepository<LeagueEntity, String> {
}
