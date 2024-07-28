package com.rolf.sports_fun.dto;

public class CreateTeamRequest {
    private String name;
    private Long sport_id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getSport_id() {
        return sport_id;
    }

    public void setSport_id(Long sport_id) {
        this.sport_id = sport_id;
    }
}
