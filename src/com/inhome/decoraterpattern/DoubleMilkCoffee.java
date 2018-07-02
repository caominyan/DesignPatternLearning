package com.inhome.decoraterpattern;

public class DoubleMilkCoffee implements Coffee {

	private Coffee coffee;
	
	public DoubleMilkCoffee(Coffee coffee){
		this.coffee = coffee;
	}
	
	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		return coffee.getPrice() + 2;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return coffee.getDescription() + ",double milk";
	}

}
