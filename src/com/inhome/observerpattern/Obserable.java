package com.inhome.observerpattern;

public interface Obserable {
	
	void register(Observer observer);
	
	void unRegister(Observer observer);
	
	void notifyAllChanged();
	
	
}
