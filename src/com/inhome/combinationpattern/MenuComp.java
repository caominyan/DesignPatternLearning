package com.inhome.combinationpattern;

import javax.naming.OperationNotSupportedException;

public abstract class MenuComp implements MenuIterable<MenuComp>{
	
	abstract void print();
	
	abstract String getName();
	
	abstract int getPrice();
	
	public boolean isRecommand() throws OperationNotSupportedException{
		throw new OperationNotSupportedException();
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
