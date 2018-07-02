package com.inhome.observerpattern;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Observer one = new Observer() {
			
			@Override
			public void update(int value) {
				// TODO Auto-generated method stub
				System.out.println("one has msg:"+value+" changed");
			}
		};
		
		Observer two = new Observer() {
			
			@Override
			public void update(int value) {
				// TODO Auto-generated method stub
				System.out.println("two has msg:"+value+" changed");
			}
		};
		
		ValueObserable valueObserable = new ValueObserable();
		valueObserable.register(one);
		valueObserable.register(two);
		
		valueObserable.pushInData();
		valueObserable.pushInData();
		valueObserable.pushInData();
		
		
		
	}

}
