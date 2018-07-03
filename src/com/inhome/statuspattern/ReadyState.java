package com.inhome.statuspattern;

public class ReadyState implements State {

	private Food mFood;
	
	public ReadyState(Food mFood) {
		super();
		this.mFood = mFood;
	}
	
	@Override
	public void prepareFood() {
		System.out.println("i can not prepareFood ,food has prepared");
	}

	@Override
	public void doSomeCooking() {
		System.out.println("i can not doSomeCooking ,food has cooked");
	}

	@Override
	public void trayFood() {
		System.out.println("i can not trayFood ,food has trayed");
	}

	@Override
	public void giveToCustomer() {
		System.out.println("i give food to customer");
		mFood.setCurrent(mFood.prepareState);
	}

}
