package com.skilldistillery.jets;

import java.util.Random;

interface Blackbird {
    void loadCargo();
    
}

public class CargoCarrier extends Jet implements Blackbird {

    private Random random;

    public CargoCarrier(String model, int speed, int range, double price) {
        super(model, speed, range, price);
        random = new Random();
    }

    // Default constructor
    public CargoCarrier() {
        super("DefaultModel", 0, 0, 0.0); 
        random = new Random();
    }

    @Override
    public void loadCargo() {
        System.out.println(generateRandomMarvelPhrase());
 
    }

    private String generateRandomMarvelPhrase() {
        String[] marvelPhrases = {
                "Assemble the cargo, Avengers!",
                "Loading Stark Industries technology for transport.",
                "Shielding the cargo with Vibranium for extra protection.",
                "Web-slinging cargo into the carrier with Spider-Man agility.",
                "Hulk smash-proof packaging for delicate cargo items."
                
        };

        return marvelPhrases[random.nextInt(marvelPhrases.length)];
    }

	
}
