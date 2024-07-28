package com.rolf.sports_fun.services;

import com.rolf.sports_fun.dto.CreateTeamRequest;
import com.rolf.sports_fun.entities.SportEntity;
import com.rolf.sports_fun.entities.TeamEntity;
import com.rolf.sports_fun.repositories.TeamRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeamService {
    private final TeamRepository teamRepository;

    public TeamService(TeamRepository teamRepository) {
        this.teamRepository = teamRepository;
    }

    public List<TeamEntity> getAllTeams() {
        return teamRepository.findAll();
    }

    public TeamEntity createTeam(CreateTeamRequest team) {
        SportEntity sport = new SportEntity(team.getSport_id());

        TeamEntity new_team = new TeamEntity();
        new_team.setName(team.getName());
        new_team.setSport(sport);

        return teamRepository.save(new_team);
    }
}
