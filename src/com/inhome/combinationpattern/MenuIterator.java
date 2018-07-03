package com.inhome.combinationpattern;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

public class MenuIterator implements Iterator<MenuComp> {

	private Deque<Iterator<MenuComp>> stack = new LinkedList<Iterator<MenuComp>>();
	

	public MenuIterator(Iterator<MenuComp> iterator) {
		super();
		stack.push(iterator);
	}

	@Override
	public boolean hasNext() {
		if(stack.isEmpty()){
			return false;
		}else{
			Iterator<MenuComp> iterator = stack.peek();
			if(!iterator.hasNext()){
				stack.pop();
				return hasNext();
			}else{
				return true;
			}
		}
	}

	@Override
	public MenuComp next() {
		MenuComp obj = null;
		Iterator<MenuComp> iterator = stack.peek();
		obj = iterator.next();
		if(obj instanceof Menu){
			stack.push(obj.createIterator());
		}
		return obj;
	}

}
