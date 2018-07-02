package com.inhome.strategypattern;

public class Client {
	
	
	public void doCalculate(Strategy strategy){
		System.out.println("I do some pre");
		strategy.doSomethingStrategy();
		
	}
	

	public static void main(String[] args) {
		Client client = new Client();
		client.doCalculate(new OneStrategy());
		client.doCalculate(new TwoStrategy());
		
	}
	
}
