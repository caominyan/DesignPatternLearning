package com.inhome.statuspattern;

public class PrepareState implements State{

	private Food mFood;
	
	
	public PrepareState(Food mFood) {
		super();
		this.mFood = mFood;
	}

	@Override
	public void prepareFood() {
		System.out.println("i am working prepare foof");
		mFood.setCurrent(mFood.preparedState);
	}

	@Override
	public void doSomeCooking() {
		System.out.println("i can not doSomeCooking ,food need to be prepared");
		
	}

	@Override
	public void trayFood() {
		System.out.println("i can not trayFood ,food need to be prepared");
	}

	@Override
	public void giveToCustomer() {
		System.out.println("i can not giveToCustomer ,food need to be prepared");
	}
	
}
