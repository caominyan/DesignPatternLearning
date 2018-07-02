package com.inhome.factorypattern.abstractp;

public class ShanghaiSourceFactory implements SourceFactory {

	@Override
	public Salt getSalt() {
		// TODO Auto-generated method stub
		return new ShanghaiSalt();
	}

	@Override
	public Tomato getStomato() {
		// TODO Auto-generated method stub
		return new ShanghaiTomato();
	}

	@Override
	public Flour getFlour() {
		// TODO Auto-generated method stub
		return new ShanghaiFlour();
	}

}
