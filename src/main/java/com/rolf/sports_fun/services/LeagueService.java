package com.rolf.sports_fun.services;

import com.rolf.sports_fun.entities.LeagueEntity;
import com.rolf.sports_fun.repositories.LeagueRepository;
import com.rolf.sports_fun.repositories.SportRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LeagueService {
    private final LeagueRepository leagueRepository;

    // Constructor injection
    public LeagueService(LeagueRepository leagueRepository) {
        this.leagueRepository = leagueRepository;
    }

    public List<LeagueEntity> getAllLeagues(){
        List<LeagueEntity> leagues = leagueRepository.findAll();
        System.out.println(leagues);
        return leagues;
    }
}
