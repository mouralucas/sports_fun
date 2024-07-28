package com.rolf.sports_fun.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "team")
public class TeamEntity extends BaseEntity{
    @ManyToOne(cascade = CascadeType.REFRESH, fetch = FetchType.EAGER)
    @JoinColumn(name = "sport_id")
    private SportEntity sport;

    @Column(name = "name")
    private String name;

    @ManyToMany(cascade = CascadeType.REFRESH)
    @JoinTable(name = "league_team",
            joinColumns = @JoinColumn(name = "id"),
            inverseJoinColumns = @JoinColumn(name = "team_id"))
    private List<LeagueTeamEntity> teamLeague;

    /* -------- Setters and Getters -------- */
    public SportEntity getSport() {
        return sport;
    }

    public void setSport(SportEntity sport) {
        this.sport = sport;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<LeagueTeamEntity> getTeamLeague() {
        return teamLeague;
    }

    public void setTeamLeague(List<LeagueTeamEntity> teamLeague) {
        this.teamLeague = teamLeague;
    }
}
