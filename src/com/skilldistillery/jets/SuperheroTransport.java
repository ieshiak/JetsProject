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
		System.out.println("going invisible "+ getModel());;
	}
	@Override
	public void rescue() {
		// TODO Auto-generated method stub
		System.out.println("resucing... "+ getModel());
	}
	@Override
    public void fly() {
        System.out.println("Superhero Transport Details: " + getModel() + ", Speed: " + getSpeed() +
                " MPH, Range: " + getRange() + " miles, Price: $" + getPrice());
    }
}
		


}