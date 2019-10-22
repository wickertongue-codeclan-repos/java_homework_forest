package com.codeclan.example.forest_organiser.components;

import com.codeclan.example.forest_organiser.models.Forest;
import com.codeclan.example.forest_organiser.models.Predator;
import com.codeclan.example.forest_organiser.models.Prey;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;

public class DataLoader implements ApplicationRunner {

    public void run(ApplicationArguments args) {

        Forest borneo = new Forest("Borneo", "Rainforest");
        Forest amazon = new Forest("Amazon", "Rainforest");
        Forest black_forest = new Forest("Black Forest", "Forest");

        Prey rabbit = new Prey("Lucy", "rabbit");
        Prey mouse = new Prey("Rupert", "mouse");
        Prey earthworm = new Prey("George", "earthworm");

        Predator fox = new Predator("Freddy", "Fox");
        Predator bear = new Predator("Johnny", "Bear");
        Predator eagle = new Predator("Margaret", "Eagle");

    }



}
