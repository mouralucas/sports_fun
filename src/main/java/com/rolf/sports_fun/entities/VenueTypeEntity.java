package com.rolf.sports_fun.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "venue_type")
public class VenueTypeEntity extends BaseEntity {
    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;
}
