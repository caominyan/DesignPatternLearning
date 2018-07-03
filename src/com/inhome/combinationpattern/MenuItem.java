package com.inhome.combinationpattern;

import java.util.Iterator;

public class MenuItem extends MenuComp {
	
	private String name;
	private int price;
	private boolean isRecommand;
	
	public MenuItem(String name, int price, boolean isRecommand) {
		super();
		this.name = name;
		this.price = price;
		this.isRecommand = isRecommand;
	}

	@Override
	void print() {
		System.out.println("name:" + name + " price:"+price + " isRecommand:" + isRecommand);
	}

	@Override
	String getName() {
		return "MenuItem_"+name;
	}

	@Override
	int getPrice() {
		return price;
	}

	@Override
	public boolean isRecommand() {
		return isRecommand;
	}

	@Override
	public Iterator<MenuComp> createIterator() {
		// TODO Auto-generated method stub
		return new NullIterator();
	}
	
	
	
}
