package com.inhome.factorypattern.simple;

public enum PizzaType {
	
	CHOCOLATE_TYPE(20),
	SPICY(100);
	

	int price;
	
	PizzaType(int price){
		this.price = price;
	}
	
}
