package com.inhome.combinationpattern;

import java.util.Iterator;

import javax.naming.OperationNotSupportedException;

public class Waitress {
	
	private MenuComp allMenus;

	public Waitress(MenuComp allMenus) {
		super();
		this.allMenus = allMenus;
	}
	
	public void print(){
		allMenus.print();
	}
	
	public void getRecommandMeal(){
		Iterator<MenuComp> it = allMenus.createIterator();
		while(it.hasNext()){
			MenuComp menuComp = it.next();
			try{
				if(menuComp.isRecommand()){
					menuComp.print();
				}
			}catch(OperationNotSupportedException ex){
				
			}
		}
		
		
	}
	
}
