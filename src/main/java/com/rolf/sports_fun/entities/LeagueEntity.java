package com.rolf.sports_fun.entities;


import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "league")
public class LeagueEntity extends BaseEntity {
    @ManyToOne(cascade = CascadeType.REFRESH, fetch = FetchType.LAZY)
    @JoinColumn(name = "sport_id")
    private SportEntity sport;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "player_score")
    private boolean playerScore = false; // Indicate if the player score with the team

    @ManyToMany(cascade = CascadeType.REFRESH, fetch = FetchType.LAZY)
    @JoinTable(name = "league_team",
            joinColumns = @JoinColumn(name = "id"),
            inverseJoinColumns = @JoinColumn(name = "league_id"))
    private List<LeagueTeamEntity> teamLeague;

    /* -------- Setters and Getters -------- */

}
