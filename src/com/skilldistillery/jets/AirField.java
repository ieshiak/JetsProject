package com.skilldistillery.jets;

import java.util.ArrayList;

import com.skilldistillery.jets.Blackbird.CargoCarrier;
public class AirField {
    private ArrayList<Jet> jets;

    public AirField() {
        this.jets = new ArrayList<>();
    }

    public void addJet(Jet jet) {
        jets.add(jet);
    }

    public ArrayList<Jet> getJets() {
        return jets;
    }
    public void assembleFleet() {
        System.out.println("Assemble Fleet:");
        for (Jet jet : jets) {
            System.out.println("Model: " + jet.getModel() +
                    ", Speed: " + jet.getSpeed() + " MPH" +
                    ", Range: " + jet.getRange() + " miles" +
                    ", Price: $" + jet.getPrice());
        }
        System.out.println(); // Add a newline for better readability
    }
        public void soarTheSkies() {
            System.out.println("Flying all Jets:");
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
		
	

