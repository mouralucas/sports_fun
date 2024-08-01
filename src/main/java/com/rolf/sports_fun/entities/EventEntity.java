package com.rolf.sports_fun.entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "event")
public class EventEntity extends BaseEntity{
    @ManyToOne(cascade = CascadeType.REFRESH, fetch = FetchType.EAGER)
    @JoinColumn(name = "league_id")
    private LeagueEntity league;

    @Column(name = "date")
    private LocalDateTime date;

}
