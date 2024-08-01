package com.rolf.sports_fun.repositories;

import com.rolf.sports_fun.entities.LeagueEntity;
import com.rolf.sports_fun.entities.TeamEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface LeagueRepository extends JpaRepository<LeagueEntity, Long> {
    @Query("SELECT l.teams FROM LeagueEntity l WHERE l.id = :leagueId")
    List<TeamEntity> findAllTeamsByLeagueId(@Param("leagueId") Long leagueId);
}
