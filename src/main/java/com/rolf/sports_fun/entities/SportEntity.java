package com.rolf.sports_fun.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "sport")
public class SportEntity extends BaseEntity {

    @Column(name = "name")
    private String name;

    @Column(name = "description", nullable = true)
    private String description;

    public SportEntity() {
    }

    public SportEntity(Long id){
        super(id);
    }

    /* -------- Setters and Getters -------- */
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
