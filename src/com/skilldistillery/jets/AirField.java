package com.skilldistillery.jets;

import java.util.ArrayList;
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
}
	
		
	

