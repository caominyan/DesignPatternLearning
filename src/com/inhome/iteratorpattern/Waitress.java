package com.inhome.iteratorpattern;

import java.util.Iterator;

public class Waitress {

	private Iterable<MenuItem> mDinnerMenu;
	
	private Iterable<MenuItem> mLaunchMenu;
	
	public Waitress(Iterable<MenuItem> mDinnerMenu, Iterable<MenuItem> mLaunchMenu) {
		super();
		this.mDinnerMenu = mDinnerMenu;
		this.mLaunchMenu = mLaunchMenu;
	}

	public void printMenu(){
		Iterator<MenuItem> dinnerIt = mDinnerMenu.iterator();
		printMenu(dinnerIt);
		Iterator<MenuItem> launchIt = mLaunchMenu.iterator();
		printMenu(launchIt);
		
	}
	
	private void printMenu(Iterator<MenuItem> iterator){
		while(iterator.hasNext()){
			MenuItem item = iterator.next();
			System.out.println(item);
		}
	}
	
}
