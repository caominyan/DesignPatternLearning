package com.inhome.adapterpattern;

public class TestClient {
	public static void main(String[] args) {
		
		//组合的方式实现
		DuckAdapter duck = new DuckAdapter(new Bird());
		PlayWithDuck play = new PlayWithDuck(duck);
		play.play();
		
		//继承的方式
		DuckAdapter2 duck2 = new DuckAdapter2();
		PlayWithDuck play2 = new PlayWithDuck(duck2);
		play2.play();
		
		
	}
}
