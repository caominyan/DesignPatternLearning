package com.inhome.decoraterpattern;

public class SugerCoffee implements Coffee {

	private Coffee coffee;
	
	public SugerCoffee(Coffee coffee){
		this.coffee = coffee;
	}
	
	
	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		return coffee.getPrice();
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return coffee.getDescription() + ",suger";
	}

}
