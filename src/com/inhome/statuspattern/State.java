package com.inhome.statuspattern;

public interface State {
	
	void prepareFood();
	
	void doSomeCooking();
	
	void trayFood();
	
	void giveToCustomer();
	
	
}
