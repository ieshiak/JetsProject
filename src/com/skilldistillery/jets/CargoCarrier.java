package com.skilldistillery.jets;

interface Blackbird {
	public void loadCargo();
	public void surveillance();

public class CargoCarrier extends Jet implements Blackbird {


	public CargoCarrier(String model, int speed, int range, double price) {
		super(model, speed, range, price);
		// TODO Auto-generated constructor stub
	}
	
	
	public void loadCargo() {
	
	}


	@Override
	public void surveillance() {
		// TODO Auto-generated method stub
		
	}
}
}


