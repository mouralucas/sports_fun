package com.rolf.sports_fun.entities;


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "league")
public class LeagueEntity extends BaseEntity {
    @ManyToOne(cascade = CascadeType.REFRESH, fetch = FetchType.EAGER)
    @JoinColumn(name = "sport_id")
    private SportEntity sport;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "player_score")
    private boolean playerScore = false; // Indicate if the player score with the team

    @ManyToMany(cascade = CascadeType.REFRESH, fetch = FetchType.EAGER)
    @JoinTable(name = "league_team",
            joinColumns = @JoinColumn(name = "league_id"),
            inverseJoinColumns = @JoinColumn(name = "team_id"))
    @JsonManagedReference
    private List<TeamEntity> teams;

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isPlayerScore() {
        return playerScore;
    }

    public void setPlayerScore(boolean playerScore) {
        this.playerScore = playerScore;
    }

    public List<TeamEntity> getTeams() {
        return teams;
    }

    public void setTeams(List<TeamEntity> teams) {
        this.teams = teams;
    }
}
