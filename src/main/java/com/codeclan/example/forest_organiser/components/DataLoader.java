package com.codeclan.example.forest_organiser.components;

import com.codeclan.example.forest_organiser.models.Forest;
import com.codeclan.example.forest_organiser.models.Predator;
import com.codeclan.example.forest_organiser.models.Prey;
import com.codeclan.example.forest_organiser.repositories.ForestRepository;
import com.codeclan.example.forest_organiser.repositories.PredatorRepository;
import com.codeclan.example.forest_organiser.repositories.PreyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    ForestRepository forestRepository;

    @Autowired
    PredatorRepository predatorRepository;

    @Autowired
    PreyRepository preyRepository;

    public void run(ApplicationArguments args) {

        Forest borneo = new Forest("Borneo", "Rainforest");
        forestRepository.save(borneo);

        Forest amazon = new Forest("Amazon", "Rainforest");
        forestRepository.save(amazon);

        Forest black_forest = new Forest("Black Forest", "Forest");
        forestRepository.save(black_forest);

        Predator fox = new Predator("Freddy", "Fox", borneo);
        predatorRepository.save(fox);

        Predator bear = new Predator("Johnny", "Bear", amazon);
        predatorRepository.save(bear);

        Predator eagle = new Predator("Margaret", "Eagle", borneo);
        predatorRepository.save(eagle);

        Prey rabbit = new Prey("Lucy", "rabbit", bear);
        preyRepository.save(rabbit);

        Prey mouse = new Prey("Rupert", "mouse", fox);
        preyRepository.save(mouse);

        Prey earthworm = new Prey("George", "earthworm", eagle);
        preyRepository.save(earthworm);

    }



}
