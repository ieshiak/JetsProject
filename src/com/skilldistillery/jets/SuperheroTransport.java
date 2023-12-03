package com.skilldistillery.jets;

interface Quinjet {
	public void stealth();
	public void rescue();
	
public class SuperheroTransport extends Jet implements Quinjet {

	public SuperheroTransport(String model, int speed, int range, double price) {
		super(model, speed, range, price);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void stealth() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void rescue() {
		// TODO Auto-generated method stub
		
	}
	
}
		


}