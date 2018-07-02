package com.inhome.factorypattern.simple;

public abstract class PizzaStore {
	
	protected abstract Pizza creatAPizza(PizzaType type);
	
	protected void prepareSource(){
		System.out.println("prepareSource for pizza");
	}
	
	protected void cutToPiece(){
		System.out.println("cutToPiece for pizza");
	}
	
	protected void makePackage(){
		System.out.println("makePackage for pizza");
	}
	
	public void soldPizza(PizzaType type){
		prepareSource();
		Pizza pizza = creatAPizza(type);
		System.out.println(pizza);
		cutToPiece();
		makePackage();
		
	}
	
	
}
