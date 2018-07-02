package com.inhome.factorypattern.singletonpattern;

public class SingleInstanceTestClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singleton instance = Singleton.getInstance();
		
		SingletonTwo iSingletonTwo = SingletonTwo.getInstace();
		
		SingletonThree singletonThree = SingletonThree.INSTANCE;
		
	}

}
