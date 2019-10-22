package com.codeclan.example.forest_organiser.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

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

    @JsonIgnoreProperties("forests")
    @ManyToOne
    @JoinColumn(name = "forest_id", nullable = false)
    private Forest forest;

    public Predator(String name, String species) {
        this.name = name;
        this.species = species;
        this.forest = forest;
    }

    public Predator() {
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public Forest getForest() {
        return forest;
    }

    public void setForest(Forest forest) {
        this.forest = forest;
    }
}
