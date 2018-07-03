package com.inhome.statuspattern;

public class TestClient {

	public static void main(String[] args) {
		Food food = new Food();
		
		//test 1
		food.prepareFood();
		food.doSomeCooking();
		food.trayFood();
		food.giveToCustomer();
		
		//test2
		food.prepareFood();
		food.trayFood();
		food.giveToCustomer();
	}

}
