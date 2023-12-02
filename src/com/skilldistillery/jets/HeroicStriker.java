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
	public void fight() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sheild() {
		// TODO Auto-generated method stub
		
	}

}
}
