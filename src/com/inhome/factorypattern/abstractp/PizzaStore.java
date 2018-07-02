package com.inhome.factorypattern.abstractp;

public class PizzaStore {

	private SourceFactory mSourceFactory;
	
	public PizzaStore(SourceFactory factory){
		mSourceFactory = factory;
	}
	
	private void preapareSource(){
		Flour flour = mSourceFactory.getFlour();
		System.out.println(flour.getLocation() + " is ready");
		Tomato tomato = mSourceFactory.getStomato();
		System.out.println(tomato.getLocation() + " is ready");
		Salt salt = mSourceFactory.getSalt();
		System.out.println(salt.getLocation() + " is ready");
	}
	
	public void soldPizza(){
		preapareSource();
		System.out.println("make pizza");
	}
	
	
}
