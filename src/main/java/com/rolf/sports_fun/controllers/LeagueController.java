package com.rolf.sports_fun.controllers;


import com.rolf.sports_fun.dto.CreateLeagueRequest;
import com.rolf.sports_fun.entities.LeagueEntity;
import com.rolf.sports_fun.entities.TeamEntity;
import com.rolf.sports_fun.services.LeagueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sport")
public class LeagueController {
    private final LeagueService leagueService;

    @Autowired
    public LeagueController(LeagueService leagueService) {
        this.leagueService = leagueService;
    }

    @GetMapping("/league")
    public List<LeagueEntity> getAllLeagues() {
        return leagueService.getAllLeagues();
    }

    @PostMapping("/league")
    public LeagueEntity createLeague(@RequestBody CreateLeagueRequest createLeagueRequest) {
        return leagueService.createLeague(createLeagueRequest);
    }

    @GetMapping("/league/team")
    public List<TeamEntity> getLeagueTeams(@RequestParam Long leagueId) {
        return leagueService.getLeagueTeams(leagueId);
    }

    @PostMapping("/league/team")
    public List<TeamEntity> addLeagueTeams(@RequestParam int leagueId) {
        return null;
    }
}
