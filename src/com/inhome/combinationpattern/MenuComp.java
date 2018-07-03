package com.inhome.combinationpattern;

import javax.naming.OperationNotSupportedException;

public abstract class MenuComp implements MenuIterable<MenuComp>{
	
	abstract void print();
	
	abstract String getName();
	
	abstract int getPrice();
	
	public boolean isRecommand(){
		return false;
	}
	
	public MenuComp getChild(int index) throws OperationNotSupportedException{
		throw new OperationNotSupportedException();
	}
	
	public void add(MenuComp comp) throws OperationNotSupportedException{
		throw new OperationNotSupportedException();
	}
	
	public void remove(MenuComp comp) throws OperationNotSupportedException{
		throw new OperationNotSupportedException();
	}
	
}
