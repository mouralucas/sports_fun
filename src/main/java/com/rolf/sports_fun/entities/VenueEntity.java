package com.rolf.sports_fun.entities;

import jakarta.persistence.*;


@Entity
@Table(name = "venue")
public class VenueEntity extends BaseEntity {
    @Column(name = "name")
    private String name;

    @ManyToOne(cascade = CascadeType.REFRESH, fetch = FetchType.LAZY)
    @JoinColumn(name = "type_id")
    private VenueTypeEntity type;

    @Column(name = "city")
    private String city;

}
