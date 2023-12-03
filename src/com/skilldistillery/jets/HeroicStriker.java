package com.skilldistillery.jets;

import java.util.Scanner;

interface Warbird {
    void fight();

    void shield();
}

public class HeroicStriker extends Jet implements Warbird {
    private Scanner scanner;
    

    public HeroicStriker(String model, int speed, int range, double price) {
        super(model, speed, range, price);
        scanner = new Scanner(System.in);
    }

    @Override
    public void fight() {
        System.out.println("Engaging in a fight!");
        // Implement the fight logic here
    }

    @Override
    public void shield() {
        System.out.println("Activating shield!");
        // Implement the shield logic here
    }

    public void showdown() {
        System.out.println("Preparing for Showdown!");

        System.out.println("Choose an action:");
        System.out.println("1. Fight");
        System.out.println("2. Activate Shield");
        System.out.print("Enter your choice: ");
        
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                fight();
                break;
            case 2:
                shield();
                break;
            default:
                System.out.println("Invalid choice. No action taken.");
        }
    
}
}
