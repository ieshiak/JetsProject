package com.skilldistillery.jets;

interface Warbird {
	public void fight();
	public void sheild();
	
public class HeroicStriker extends Jet implements Warbird {

	public HeroicStriker(String model, int speed, int range, double price) {
		super(model, speed, range, price);
		// TODO Auto-generated constructor stub
	}
	@Override
    public void fly() {
        System.out.println("Heroric Striker Details: " + getModel() + ", Speed: " + getSpeed() +
                " MPH, Range: " + getRange() + " miles, Price: $" + getPrice());
	}
	@Override
	public void fight() {
		// TODO Auto-generated method stub
		System.out.println("Engaging in a showdown with " + getModel());
	}

	@Override
	public void sheild() {
		// TODO Auto-generated method stub
		System.out.println("Deploying sheild for " + getModel());
	}

}
}
