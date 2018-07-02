package com.inhome.factorypattern.simple;

public class TestClient {
	
	public static void main(String[] args) {
		PizzaStore pizzaStore = new ShanghaiPizzaStore();
		pizzaStore.soldPizza(PizzaType.CHOCOLATE_TYPE);
		pizzaStore.soldPizza(PizzaType.SPICY);
	}
	
}
