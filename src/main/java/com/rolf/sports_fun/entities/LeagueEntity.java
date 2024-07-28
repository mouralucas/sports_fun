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

    @ManyToMany(cascade = CascadeType.REFRESH, fetch = FetchType.LAZY)
    @JoinTable(name = "league_team",
            joinColumns = @JoinColumn(name = "id"),
            inverseJoinColumns = @JoinColumn(name = "league_id"))
    private List<LeagueTeamEntity> teamLeague;

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
}
