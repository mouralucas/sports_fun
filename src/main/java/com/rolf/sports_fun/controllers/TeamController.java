package com.rolf.sports_fun.controllers;

import com.rolf.sports_fun.dto.CreateTeamRequest;
import com.rolf.sports_fun.entities.TeamEntity;
import com.rolf.sports_fun.services.TeamService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sport")
public class TeamController {
    private final TeamService teamService;

    public TeamController(TeamService teamService) {
        this.teamService = teamService;
    }

    @GetMapping("/team")
    public List<TeamEntity> getAllTeams() {
        return teamService.getAllTeams();
    }

    @PostMapping("/team")
    public TeamEntity createTeam(@RequestBody CreateTeamRequest team) {
        return teamService.createTeam(team);
    }
}
