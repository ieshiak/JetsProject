package com.skilldistillery.jets;
import java.util.ArrayList;
import java.util.Scanner;
import com.skilldistillery.jets.Blackbird.CargoCarrier;
import com.skilldistillery.jets.Quinjet.SuperheroTransport;
import com.skilldistillery.jets.Voyager.MultiverseTraveler;


public class JetsApplication {
	private AirField airField;
	private Scanner scanner;
	public JetsApplication() {
        this.scanner = new Scanner(System.in);
	}
	public static void main(String[] args) {
		JetsApplication app = new JetsApplication();
		app.airField = new AirField();
	   
	    

	app.run();
	       
	       
	     
	}
	  
	    public void run() {
	    	 int choice = 0;  
	    	do {
	               displayMenu();
	               choice = scanner.nextInt();
	               handleUserChoice(choice);
	           } while (choice != 9);
	    	  if (scanner != null) {
	              scanner.close();
	          }
	    	
	    }

	    	   
	    private void displayMenu() {
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
	    	   }
	    

    		
		private void handleUserChoice(int choice) {
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
            	HeroicStriker striker = new HeroicStriker("Photon Fury", 2200, 3500, 950000000.0);
				striker.showdown(); 
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
		

		
		private void addJetSubMenu() {
			
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