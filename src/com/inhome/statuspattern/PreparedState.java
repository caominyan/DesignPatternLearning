package com.inhome.statuspattern;

public class PreparedState implements State {

	private Food mFood;
	
	public PreparedState(Food mFood) {
		super();
		this.mFood = mFood;
	}
	
	@Override
	public void prepareFood() {
		System.out.println("i can not prepareFood ,food has prepared");
	}

	@Override
	public void doSomeCooking() {
		System.out.println("i am doing cooking food");
		mFood.setCurrent(mFood.trayedState);
	}

	@Override
	public void trayFood() {
		System.out.println("i can not trayFood ,i am cooking food");
	}

	@Override
	public void giveToCustomer() {
		System.out.println("i can not giveToCustomer ,i am cooking food");
	}

}
