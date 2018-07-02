package com.inhome.adapterpattern;

public class PlayWithDuck {
	
	Duck duck;

	public PlayWithDuck(Duck duck) {
		super();
		this.duck = duck;
	}
	
	public void play(){
		duck.gaga();
		duck.swim();
	}
	
	
}
