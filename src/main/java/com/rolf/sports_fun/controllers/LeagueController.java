package com.rolf.sports_fun.controllers;


import com.rolf.sports_fun.entities.LeagueEntity;
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
    public LeagueEntity createLeague(@RequestBody LeagueEntity league) {
        System.out.println("Opa");
        return null;
    }
}
