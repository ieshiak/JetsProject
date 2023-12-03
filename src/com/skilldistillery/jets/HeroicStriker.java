package com.skilldistillery.jets;

import java.util.Scanner;

interface Warbird {
    void fight();
    void shield();
    void stealth();
	void rescue();
	void surveillance();
}

public class HeroicStriker extends Jet implements Warbird {
    private Scanner scanner;
    

    public HeroicStriker(String model, int speed, int range, double price) {
        super(model, speed, range, price);
        scanner = new Scanner(System.in);
    }

    @Override
    public void fight() {
        System.out.println("Launching repulsor blasts in a fierce battle against the forces of darkness!");
 
    }

    @Override
    public void shield() {
        System.out.println("Activating Vibranium shield for maximum defense.");
      
    }

    public void showdown() {
        System.out.println("Preparing for Showdown!");

        System.out.println("Choose an action:");
        System.out.println("1. Stealth");
        System.out.println("2. Activate Shield");
        System.out.println("3. Rescue");
        System.out.println("4. Surveillance");
        System.out.println("5. Fight");
        System.out.print("Enter your choice: ");
        
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
            	stealth();
                break;
            case 2:
                shield();
                break;
            case 3:
            	rescue();
                break;
            case 4:
            	surveillance();
                break;
            case 5:
                fight();
                break;
            default:
                System.out.println("Your selection doesn't align with the cosmic "
                		+ "forces at play. Opt for a valid option, true believer!");
        }
    
}

	@Override
	public void stealth() {
		System.out.println("Cloaking systems engaged. Moving undetected through the shadows.");
		
	}

	@Override
	public void rescue() {
		System.out.println("Soaring through the skies like Falcon, rescuing "
				+ "those in need with speed and precision!");
		
	}

	@Override
	public void surveillance() {
		System.out.println("Deploying advanced surveillance tech to monitor "
				+ "supervillain activity. Keeping the city safe!");
		
	}
}
