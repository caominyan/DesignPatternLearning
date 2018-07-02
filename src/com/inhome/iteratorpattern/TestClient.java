package com.inhome.iteratorpattern;

public class TestClient {

	public static void main(String[] args) {
		DinnerMenu menu = new DinnerMenu();
		menu.initMenu();
		LaunchMenu menu2 = new LaunchMenu();
		menu2.initMenu();
		Waitress waitress = new Waitress(menu, menu2);
		waitress.printMenu();
	}

}
