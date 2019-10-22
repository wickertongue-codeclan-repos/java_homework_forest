package com.codeclan.example.forest_organiser.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "predators")
public class Predator {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "species")
    private String species;

    // One Forest to many Predators
    @JsonIgnoreProperties("predators")
    @ManyToOne
    @JoinColumn(name = "forest_id", nullable = false)
    private Forest forest;

    // One Predator to many Prey
    @JsonIgnoreProperties("predators")
    @OneToMany(mappedBy = "predator")
    private List<Prey> prey;


    public Predator(String name, String species, Forest forest) {
        this.name = name;
        this.species = species;
        this.forest = forest;
        this.prey = new ArrayList<>();
    }

    public Predator() {
    }

    public List<Prey> getPrey() {
        return prey;
    }

    public void setPrey(List<Prey> prey) {
        this.prey = prey;
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
