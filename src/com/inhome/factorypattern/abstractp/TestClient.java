package com.inhome.factorypattern.abstractp;

public class TestClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SourceFactory shanghai = new ShanghaiSourceFactory();
		PizzaStore pizzaStore = new PizzaStore(shanghai);
		pizzaStore.soldPizza();
		
	}

}
