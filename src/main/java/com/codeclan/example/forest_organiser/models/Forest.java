package com.codeclan.example.forest_organiser.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "forests")
public class Forest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "type")
    private String type;

    @JsonIgnoreProperties("forest")
    @OneToMany(mappedBy = "forest")
    private List<Predator> predators;

    public Forest(String name, String type) {
        this.name = name;
        this.type = type;
        this.predators = new ArrayList<>();
    }

    public Forest() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Predator> getPredators() {
        return predators;
    }

    public void setPredators(List<Predator> predators) {
        this.predators = predators;
    }
}
