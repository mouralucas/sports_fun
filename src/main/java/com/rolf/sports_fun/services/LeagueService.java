package com.rolf.sports_fun.services;

import com.rolf.sports_fun.dto.CreateLeagueRequest;
import com.rolf.sports_fun.entities.LeagueEntity;
import com.rolf.sports_fun.entities.TeamEntity;
import com.rolf.sports_fun.repositories.LeagueRepository;
import com.rolf.sports_fun.repositories.TeamRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LeagueService {
    private final LeagueRepository leagueRepository;
    private final TeamRepository teamRepository;

    // Constructor injection
    public LeagueService(LeagueRepository leagueRepository, TeamRepository teamRepository) {
        this.leagueRepository = leagueRepository;
        this.teamRepository = teamRepository;
    }

    public List<LeagueEntity> getAllLeagues(){
        return leagueRepository.findAll();
    }

    public List<TeamEntity> getLeagueTeams(Long leagueId){
        return leagueRepository.findAllTeamsByLeagueId(leagueId);
    }

    @Transactional
    public LeagueEntity createLeague(CreateLeagueRequest createLeagueRequest) {
        LeagueEntity league = new LeagueEntity();
        league.setName(createLeagueRequest.getName());
        league.setDescription(createLeagueRequest.getDescription());
        league.setPlayerScore(createLeagueRequest.isPlayerScore());

        List<TeamEntity> teams = teamRepository.findAllById(createLeagueRequest.getTeamsId());
        league.setTeams(teams);

        return leagueRepository.save(league);
    }
}
