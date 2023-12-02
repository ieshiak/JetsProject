package com.skilldistillery.jets;

interface Voyager {
	public void dimensionTravel();
	public void navigationHologram();
	
public class MultiverseTraveler extends Jet implements Voyager {

	public MultiverseTraveler(String model, int speed, int range, double price) {
		super(model, speed, range, price);
		// TODO Auto-generated constructor stub
	}
	@Override
	    public void fly() {
	        System.out.println("Multiverse Traveler Details: " + getModel() + ", Speed: " + getSpeed() +
	                " MPH, Range: " + getRange() + " miles, Price: $" + getPrice());
	}
	@Override
	public void dimensionTravel() {
		// TODO Auto-generated method stub
		System.out.println("Going to another Multiverse " + getModel());
	}

	@Override
	public void navigationHologram() {
		// TODO Auto-generated method stub
		System.out.println("Searching for the best route " + getModel());
	}
}
}
