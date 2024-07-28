package com.rolf.sports_fun.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

import java.util.List;

@Entity
@Table(name = "league_team")
public class LeagueTeamEntity extends BaseEntity {
    @ManyToMany(mappedBy = "teamLeague")
    private List<LeagueEntity> league;

    @ManyToMany(mappedBy = "teamLeague")
    private List<TeamEntity> team;
}
