package com.rolf.sports_fun.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
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

    @ManyToMany(mappedBy = "teams")
    @JsonBackReference
    private List<LeagueEntity> leagues;

    public TeamEntity(Long id) {
        super(id);
    }

    public TeamEntity() {
    }

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

    public List<LeagueEntity> getLeagues() {
        return leagues;
    }

    public void setLeagues(List<LeagueEntity> leagues) {
        this.leagues = leagues;
    }
}
