package com.inhome.observerpattern;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ValueObserable implements Obserable {

	int value;
	
	List<Observer> observers = new ArrayList<Observer>();
	
	public void pushInData(){
		value ++;
		notifyAllChanged();
	}
	
	@Override
	public void register(Observer observer) {
		// TODO Auto-generated method stub
		observers.add(observer);
	}

	@Override
	public void unRegister(Observer observer) {
		// TODO Auto-generated method stub
		observers.remove(observer);
	}

	@Override
	public void notifyAllChanged() {
		// TODO Auto-generated method stub
		Iterator<Observer> it = observers.iterator();
		while(it.hasNext()){
			it.next().update(value);
		}
	}

}
