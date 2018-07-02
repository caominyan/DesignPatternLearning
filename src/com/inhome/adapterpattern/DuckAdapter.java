package com.inhome.adapterpattern;

public class DuckAdapter implements Duck {

	private Bird bird;
	
	
	public DuckAdapter(Bird bird) {
		super();
		this.bird = bird;
	}

	@Override
	public void gaga() {
		// TODO Auto-generated method stub
		bird.zhizhi();
	}

	@Override
	public void swim() {
		// TODO Auto-generated method stub
		bird.fly();

	}

}
