package com.inhome.combinationpattern;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.naming.OperationNotSupportedException;

public class Menu extends MenuComp {

	private String name;
	
	private List<MenuComp> lists = new ArrayList<MenuComp>();
	
	
	public Menu(String name) {
		super();
		this.name = name;
	}

	@Override
	void print() {
		System.out.println("menu_"+name);
		Iterator<MenuComp> it = createIterator();
		while(it.hasNext()){
			MenuComp menuComp = it.next();
			menuComp.print();
		}
	}

	@Override
	String getName() {
		return "Menu_" + name;
	}

	@Override
	int getPrice() {
		return 0;
	}

	@Override
	public void add(MenuComp comp) throws OperationNotSupportedException {
		lists.add(comp);
	}

	@Override
	public void remove(MenuComp comp) throws OperationNotSupportedException {
		lists.remove(comp);
	}
	
	@Override
	public MenuComp getChild(int index) throws OperationNotSupportedException {
		// TODO Auto-generated method stub
		return lists.get(index);
	}

	@Override
	public Iterator<MenuComp> createIterator() {
		// TODO Auto-generated method stub
		return lists.iterator();
	}
	
	
	
}
