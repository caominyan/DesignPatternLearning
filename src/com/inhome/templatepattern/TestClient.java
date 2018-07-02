package com.inhome.templatepattern;

public class TestClient {
	
	public static void main(String[] args) {
		ActivityLoad activity = new ConcretActivity();
		activity.loadActivity();
	}
}
