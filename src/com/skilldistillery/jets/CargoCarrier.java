package com.skilldistillery.jets;

interface Blackbird {
	public void loadCargo();
	public void surveillance();

public class CargoCarrier extends Jet implements Blackbird {

	public CargoCarrier(String model, int speed, int range, double price) {
		super(model, speed, range, price);
		// TODO Auto-generated constructor stub
	}
	@Override
	    public void fly() {
	        System.out.println("Cargo Carrier Details: " + getModel() + ", Speed: " + getSpeed() +
	                " MPH, Range: " + getRange() + " miles, Price: $" + getPrice());
	    }
	
	@Override
	public void loadCargo() {
		System.out.println("Loading cargo for " + getModel());
	}

	@Override
	public void surveillance() {
		// TODO Auto-generated method stub
	}
}
}


