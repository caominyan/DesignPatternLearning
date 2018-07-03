package com.inhome.statuspattern;

public class Food {
	
	State prepareState = new PrepareState(this);
	State preparedState = new PreparedState(this);
	State trayedState = new TrayedState(this);
	State readyState = new ReadyState(this);
	
	State current = prepareState;
	
	
	public State getCurrent() {
		return current;
	}

	public void setCurrent(State current) {
		this.current = current;
	}

	void prepareFood(){
		current.prepareFood();
	}
	
	public void doSomeCooking(){
		current.doSomeCooking();
	}
	
	void trayFood(){
		current.trayFood();
	}
	
	void giveToCustomer(){
		current.giveToCustomer();
	}
	
	
}
