package com.rolf.sports_fun.repositories;

import com.rolf.sports_fun.entities.TeamEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamRepository extends JpaRepository<TeamEntity, Long> {
}
