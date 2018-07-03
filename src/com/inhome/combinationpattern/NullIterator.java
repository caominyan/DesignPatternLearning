package com.inhome.combinationpattern;

import java.util.Iterator;

public class NullIterator implements Iterator<MenuComp> {

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public MenuComp next() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
