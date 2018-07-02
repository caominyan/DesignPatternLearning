package com.inhome.adapterpattern;

public class DuckAdapter2 extends Bird implements Duck{

	@Override
	public void gaga() {
		// TODO Auto-generated method stub
		this.zhizhi();
	}

	@Override
	public void swim() {
		// TODO Auto-generated method stub
		this.fly();
	}

	
	
}
