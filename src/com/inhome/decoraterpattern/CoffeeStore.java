package com.inhome.decoraterpattern;

public class CoffeeStore {

	public static Coffee makeDoubleMilkCoffee(){
		Coffee coffee = new BaseCoffee();
		Coffee sugerCoffee = new SugerCoffee(coffee);
		Coffee doubleMilkCoffee = new DoubleMilkCoffee(sugerCoffee);
		return doubleMilkCoffee;
	}
	
	public static void main(String[] args) {
		Coffee coffee = makeDoubleMilkCoffee();
		System.out.println(coffee.getDescription());
		System.out.println(coffee.getPrice());
		
	}
	
	
}
