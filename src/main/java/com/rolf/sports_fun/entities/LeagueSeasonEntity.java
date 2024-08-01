package com.rolf.sports_fun.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "league_season")
public class LeagueSeasonEntity extends BaseEntity {
    @Column(name = "name", nullable = false)
    private String name; // Normally the year (2024 or 2024/2025)

    @ManyToOne(cascade = CascadeType.REFRESH, fetch = FetchType.EAGER)
    @JoinColumn(name = "league_id", nullable = false)
    private LeagueEntity league;

    @Column(name = "is_group", nullable = false)
    private boolean isGrouped; // Indicates if the league are divided by groups

    @Column(name = "is_playoff", nullable = false)
    private boolean isPlayoff;
}
// Maybe create a table season_group_team, then in season table a field isGroup league/season?