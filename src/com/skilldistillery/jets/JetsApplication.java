package com.skilldistillery.jets;
import java.util.ArrayList;
import java.util.Scanner;
import com.skilldistillery.jets.Blackbird.CargoCarrier;
import com.skilldistillery.jets.Quinjet.SuperheroTransport;
import com.skilldistillery.jets.Warbird.HeroicStriker;
import com.skilldistillery.jets.Voyager.MultiverseTraveler;
import com.skilldistillery.jets.AirField;

public class JetsApplication {
	private AirField airField;
	private Scanner scanner;
	
	public static void main(String[] args) {
		JetsApplication app = new JetsApplication();
		app.airField = new AirField();
	       AirField airField = new AirField();

	        // Create instances of each type of jet
	        Jet superheroTrans1 = new SuperheroTransport("Nightshade", 1500, 5000, 750000000.0);
	        Jet superheroTrans2 = new SuperheroTransport("Thunderstrike", 2000, 4000, 100000000.0);
	        Jet cargoCarrier1 = new CargoCarrier("Shadowhawk", 1800, 4500, 800000000.0);
	        Jet cargoCarrier2 = new CargoCarrier("Chronos", 1600, 5500, 900000000.0);
	        Jet heroStrike1 = new HeroicStriker("Photon Fury", 2200, 3500, 950000000.0);
	        Jet heroStrike2 = new HeroicStriker("Spectra Shadow", 1900, 4000, 100000000.0);
	        Jet multiTraveler1 = new MultiverseTraveler("Timestrider", 600, 80000, 950000000.0);
	        Jet multiTraveler2 = new MultiverseTraveler("Infinity Seeker", 600, 80000, 1200000000.0);

	        // Add jets to the AirField
	        airField.addJet(superheroTrans1);
	        airField.addJet(superheroTrans2);
	        airField.addJet(cargoCarrier1);
	        airField.addJet(cargoCarrier2);
	        airField.addJet(heroStrike1);
	        airField.addJet(heroStrike2);
	        airField.addJet(multiTraveler1);
	        airField.addJet(multiTraveler2);
	        
	        //list the fleet
	        airField.assembleFleet();
	        //fly all jets
	        airField.soarTheSkies();
	        //fastest Jet
	        airField.speedster();
	        //longest Range Jet
	        airField.supremeRange();
	        //load Cargo Jets
	        airField.loadCargoCarriers();

	        // Display jet details
	        for (Jet jet : airField.getJets()) {
	            jet.fly();
	            
	            if (jet instanceof CargoCarrier) {
	                ((CargoCarrier) jet).loadCargo();
	            }

	            if (jet instanceof Warbird) {
	                ((Warbird) jet).fight();
	            }

	            if (jet instanceof Quinjet) {
	                ((Quinjet) jet).stealth();
	                ((Quinjet) jet).rescue();
	            }

	            if (jet instanceof Blackbird) {
	                ((Blackbird) jet).loadCargo();
	                ((Blackbird) jet).surveillance();
	            }

	            if (jet instanceof Voyager) {
	                ((Voyager) jet).dimensionTravel();
	                ((Voyager) jet).navigationHologram();
	            }

	            System.out.println(); // Add a newline for better readability
	        }
	}
	    public void run() {
		while (true) {

			System.out.println("                                                                        88        "); 
			System.out.println("                                                                        88        ");
			System.out.println("                                                                        88        ");
			System.out.println("        88,dPYba,,adPYba,  ,adPPYYba, 8b,dPPYba, 8b       d8  ,adPPYba, 88        ");
			System.out.println("        88P     88      8a        Y8 88P    Y8   8b     d8  a8P_____88  88        ");
			System.out.println("        88      88      88 ,adPPPPP88 88          `8b   d8'  8PP        88        ");
			System.out.println("        88      88      88 88,    ,88 88           `8b,d8'    8b     aa 88        ");
			System.out.println("        88      88      88   8bbdP Y8 88              8         Ybbd8   88        ");
			System.out.println("                                                                                  ");
			System.out.println("================================= The Superhero Arsenal===========================");
    		System.out.println("|                                                                                |");
			System.out.println("|               1. Assemble Fleet                                                |");
            System.out.println("|               2. Soar into the Skies                                           |");
            System.out.println("|               3. Discover the Speedster                                        |");
            System.out.println("|               4. Expose the Jet with Supreme Range                             |");
            System.out.println("|               5. Load Cargo Carriers                                           |");
            System.out.println("|               6. Epic Showdown                                                 |");
            System.out.println("|               7. Recruit a Marvelous Jet                                       |");
            System.out.println("|               8. Exile a Jet from the Ranks                                    |");
            System.out.println("|               9. End Mission                                                   |");                                 
    		System.out.println("|                                                                                |");
    		System.out.println("==================================================================================");
    		
    		Scanner scanner = new Scanner(System.in);
    		int choice = scanner.nextInt();
    		
    		switch (choice) {
            case 1:
            	airField.assembleFleet();
                break;
            case 2:
            	airField.soarTheSkies();
                break;
            case 3:
            	airField.speedster();
                break;
            case 4:
            	airField.supremeRange();
                break;
            case 5:
            	airField.loadCargoCarriers();
                break;
            case 6:
            	fight();
                break;
            case 7:
            	addJetSubMenu();
                break;
            case 8:
            	removeJetSubMenu();
                break;
            case 9:
                System.out.println("Until the next riveting chapter, Farewell!");
                System.exit(0);
                break;
            default:
                System.out.println("Your selection doesn't align with the cosmic forces at play. Opt for a valid option, true believer!");
    		}
		}
		}	
		private void fight() {
			// TODO Auto-generated method stub
			System.out.println("Engaging in a showdown with " + getModel()); 
		}
		private void addJetSubMenu(AirField airField, Scanner scanner) {
	        System.out.println("Select the type of Jet:");
	        System.out.println("1. Superhero Transport");
	        System.out.println("2. Cargo Carrier");
	        System.out.println("3. Heroic Striker");
	        System.out.println("4. Multiverse Traveler");

	        int jetTypeChoice = scanner.nextInt();
	        scanner.nextLine(); // Consume the newline character

	        System.out.print("Enter the model: ");
	        String model = scanner.nextLine();

	        System.out.print("Enter the speed (in MPH): ");
	        int speed = scanner.nextInt();

	        System.out.print("Enter the range: ");
	        int range = scanner.nextInt();

	        System.out.print("Enter the price: ");
	        double price = scanner.nextDouble();

	        switch (jetTypeChoice) {
	            case 1:
	                Jet superheroTrans = new SuperheroTransport(model, speed, range, price);
	                airField.addJet(superheroTrans);
	                System.out.println("Superhero Transport added to the fleet.");
	                break;
	            case 2:
	                Jet cargoCarrier = new CargoCarrier(model, speed, range, price);
	                airField.addJet(cargoCarrier);
	                System.out.println("Cargo Carrier added to the fleet.");
	                break;
	            case 3:
	                Jet heroStrike = new HeroicStriker(model, speed, range, price);
	                airField.addJet(heroStrike);
	                System.out.println("Heroic Striker added to the fleet.");
	                break;
	            case 4:
	                Jet multiTraveler = new MultiverseTraveler(model, speed, range, price);
	                airField.addJet(multiTraveler);
	                System.out.println("Multiverse Traveler added to the fleet.");
	                break;   
	                
	            default:
	                System.out.println("Your selection doesn't align with the cosmic forces at play.");
	        }
	}
		 private void removeJetSubMenu() {
		        System.out.println("Select the Jet to remove by its number:");

		        ArrayList<Jet> jets = airField.getJets();
		        for (int i = 0; i < jets.size(); i++) {
		            Jet jet = jets.get(i);
		            System.out.println((i + 1) + ". " + jet.getModel());
		        }

		        int jetNumber = scanner.nextInt();
		        scanner.nextLine(); // Consume the newline character

		        if (jetNumber >= 1 && jetNumber <= jets.size()) {
		            Jet removedJet = jets.remove(jetNumber - 1);
		            System.out.println("Removed Jet: " + removedJet.getModel());
		        } else {
		            System.out.println("Invalid Jet number. No Jet removed.");
		        }
		    }          
                
}