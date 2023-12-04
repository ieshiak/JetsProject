package com.skilldistillery.jets;

import java.text.DecimalFormat;

public abstract class Jet {
	private String model;
	private int speed;
	private int range;
	private double price;
	private final DecimalFormat decimalFormat;
	
	public Jet(String model, int speed, int range, double price) {
		super();
		this.model = model;
		this.speed = speed;
		this.range = range;
		this.price = price;
		this.decimalFormat = new DecimalFormat("#.##");
	}
	public void fly() {
    System.out.println("Model: " + model);
    System.out.println("Speed: " + speed + " MPH");
    System.out.println("Range: " + range + " miles");
    System.out.println("Price: $" + decimalFormat.format(price));
 

    // Calculate time until the jet runs out of fuel
    double timeToEmpty = (double) range / speed;
    String formattedTimeToEmpty = String.format("%.2f", timeToEmpty);
    System.out.println("Time until empty: " + formattedTimeToEmpty + " hours");
    System.out.println();
	}

	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public int getRange() {
		return range;
	}
	public void setRange(int range) {
		this.range = range;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public void add(Jet jets) {
		// TODO Auto-generated method stub	
	}
	@Override
	public String toString() {
		String formattedPrice = decimalFormat.format(getPrice());
	    return "Model: " + getModel() +
	           "\nSpeed: " + getSpeed() + " MPH" +
	           "\nRange: " + getRange() + " miles" +
	           "\nPrice: $" + formattedPrice;
	}  
}