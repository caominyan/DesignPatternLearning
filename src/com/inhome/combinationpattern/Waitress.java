package com.inhome.combinationpattern;

public class Waitress {
	
	private MenuComp allMenus;

	public Waitress(MenuComp allMenus) {
		super();
		this.allMenus = allMenus;
	}
	
	public void print(){
		allMenus.print();
	}
	
}
