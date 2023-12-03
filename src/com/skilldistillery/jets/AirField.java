package com.skilldistillery.jets;

import java.util.ArrayList;

import com.skilldistillery.jets.Blackbird.CargoCarrier;
import com.skilldistillery.jets.Quinjet.SuperheroTransport;
import com.skilldistillery.jets.Voyager.MultiverseTraveler;
public class AirField {
    private ArrayList<Jet> jets;
    
    public AirField() {
        this.jets = new ArrayList<>();
        initializeJets();
    }

    public void addJet(Jet jet) {
        jets.add(jet);
    }

    public ArrayList<Jet> getJets() {
        return jets;
    }
    private void initializeJets() {
    Jet superheroTrans1 = new SuperheroTransport("Nightshade", 1500, 5000, 750000000.0);
    Jet superheroTrans2 = new SuperheroTransport("Thunderstrike", 2000, 4000, 100000000.0);
    Jet cargoCarrier1 = new CargoCarrier("Shadowhawk", 1800, 4500, 800000000.0);
    Jet cargoCarrier2 = new CargoCarrier("Chronos", 1600, 5500, 900000000.0);
    Jet heroStrike1 = new HeroicStriker("Photon Fury", 2200, 3500, 950000000.0);
    Jet heroStrike2 = new HeroicStriker("Spectra Shadow", 1900, 4000, 100000000.0);
    Jet multiTraveler1 = new MultiverseTraveler("Timestrider", 600, 80000, 950000000.0);
    Jet multiTraveler2 = new MultiverseTraveler("Infinity Seeker", 600, 80000, 1200000000.0);

    jets.add(superheroTrans1);
    jets.add(superheroTrans2);
    jets.add(cargoCarrier1);
    jets.add(cargoCarrier2);
    jets.add(heroStrike1);
    jets.add(heroStrike2);
    jets.add(multiTraveler1);
    jets.add(multiTraveler2);
    }

    
    public void assembleFleet() {
        System.out.println("Assemble Fleet:");
        if (jets.isEmpty()) {
            System.out.println("No jets in the fleet.");
        } else {
            for (Jet jet : jets) {
                System.out.println(jet);
       
            System.out.println("Model: " + jet.getModel());
            System.out.println("Speed: " + jet.getSpeed() + "MPH");
            System.out.println("Range: " + jet.getRange() + " miles");
            System.out.println("Price: $" + jet.getPrice());
            System.out.println(); // Add a newline for better readability
            }
        }
        System.out.println(); // Add a newline for better readability
    }
        public void soarTheSkies() {
            System.out.println("Soar The Skies");
            for (Jet jet : jets) {
                jet.fly();
            }
            System.out.println(); // Add a newline for better readability
    }
        public void speedster() {
            Jet fastestJet = null;
            int maxSpeed = Integer.MIN_VALUE;

            for (Jet jet : jets) {
                if (jet.getSpeed() > maxSpeed) {
                    maxSpeed = jet.getSpeed();
                    fastestJet = jet;
                }
            }

            if (fastestJet != null) {
                System.out.println("Fastest Jet:");
                System.out.println("Model: " + fastestJet.getModel() +
                        ", Speed: " + fastestJet.getSpeed() + " MPH" +
                        ", Range: " + fastestJet.getRange() + " miles" +
                        ", Price: $" + fastestJet.getPrice());
                System.out.println();
            } else {
                System.out.println("No jets available to display.");
            }
        }
        
        public void supremeRange() {
            Jet longestRangeJet = null;
            int maxRange = Integer.MIN_VALUE;

            for (Jet jet : jets) {
                if (jet.getRange() > maxRange) {
                    maxRange = jet.getRange();
                    longestRangeJet = jet;
                }
            }

            if (longestRangeJet != null) {
                System.out.println("Jet with Longest Range:");
                System.out.println("Model: " + longestRangeJet.getModel() +
                        ", Speed: " + longestRangeJet.getSpeed() + " MPH" +
                        ", Range: " + longestRangeJet.getRange() + " miles" +
                        ", Price: $" + longestRangeJet.getPrice());
                System.out.println();
            } else {
                System.out.println("No jets available to display.");
            }    
        }
        public void loadCargoCarriers() {
             System.out.println("Loading all Cargo Jets:");
                for (Jet jet : jets) {
                    if (jet instanceof CargoCarrier) {
                        ((CargoCarrier) jet).loadCargo();
                    }
                }
              System.out.println(); // Add a newline for better readability    
        

		}
}
		
	
