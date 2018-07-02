package com.inhome.factorypattern.simple;

public class ShanghaiPizzaStore extends PizzaStore {

	@Override
	protected Pizza creatAPizza(PizzaType type) {
		// TODO Auto-generated method stub
		if(type == PizzaType.CHOCOLATE_TYPE){
			return new SweetChocolatePizza();
		}else if(type == PizzaType.SPICY){
			return new SpicyPizza();
		}
		return null;
	}
	
	
	

}
