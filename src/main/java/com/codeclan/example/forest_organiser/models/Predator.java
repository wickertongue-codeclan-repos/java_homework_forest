package com.codeclan.example.forest_organiser.models;

import javax.persistence.*;

@Entity
@Table(name = "forests")
public class Predator {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "species")
    private String species;

    private Forest forest

    public Predator(String name, String species) {
        this.name = name;
        this.species = species;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return species;
    }

    public void setType(String species) {
        this.species = species;
    }
}
