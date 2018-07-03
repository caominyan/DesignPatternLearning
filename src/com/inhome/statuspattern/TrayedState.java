package com.inhome.statuspattern;

public class TrayedState implements State {

	private Food mFood;
	
	public TrayedState(Food mFood) {
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
		System.out.println("i trayed food");
		mFood.setCurrent(mFood.readyState);
	}

	@Override
	public void giveToCustomer() {
		System.out.println("i can not giveToCustomer ,i am cooking food");
	}

}
