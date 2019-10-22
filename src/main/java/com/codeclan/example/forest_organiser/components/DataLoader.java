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

        Prey rabbit = new Prey("Lucy", "rabbit");
        preyRepository.save(rabbit);

        Prey mouse = new Prey("Rupert", "mouse");
        preyRepository.save(mouse);

        Prey earthworm = new Prey("George", "earthworm");
        preyRepository.save(earthworm);

        Predator fox = new Predator("Freddy", "Fox");
        predatorRepository.save(fox);
        
        Predator bear = new Predator("Johnny", "Bear");
        predatorRepository.save(bear);

        Predator eagle = new Predator("Margaret", "Eagle");
        predatorRepository.save(eagle);


    }



}
