package com.inhome.factorypattern.singletonpattern;

public class SingletonTwo {

	private SingletonTwo(){
		
	}
	
	private static class SingletonTwoHolder{
		static final SingletonTwo instance = new SingletonTwo();
	}
	
	public static SingletonTwo getInstace(){
		return SingletonTwoHolder.instance;
	}
	
}
