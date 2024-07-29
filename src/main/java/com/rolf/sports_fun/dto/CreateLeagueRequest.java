package com.rolf.sports_fun.dto;

import java.util.List;


public class CreateLeagueRequest {
    private String name;
    private String description;
    private List<Long> teamsId;
    private boolean playerScore;

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

    public List<Long> getTeamsId() {
        return teamsId;
    }

    public void setTeamsId(List<Long> teamsId) {
        this.teamsId = teamsId;
    }

    public boolean isPlayerScore() {
        return playerScore;
    }

    public void setPlayerScore(boolean playerScore) {
        this.playerScore = playerScore;
    }
}