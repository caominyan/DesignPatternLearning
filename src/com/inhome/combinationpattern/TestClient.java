package com.inhome.combinationpattern;

import javax.naming.OperationNotSupportedException;

public class TestClient {
	
	
	
	public static void main(String[] args) throws OperationNotSupportedException {
		MenuComp menuB = new Menu("Breakfast");
		
		for(int index = 0 ; index < 10 ;index ++){
			MenuComp item = new MenuItem("b_"+ index ,index ^ 2, index % 2 == 0);
			menuB.add(item);
		}
		
		
		MenuComp menuL = new Menu("Launch");
		for(int index = 0 ; index < 20 ;index ++){
			MenuComp item = new MenuItem("L_"+ index ,index ^ 2, index % 2 == 0);
			menuL.add(item);
		}
		
		
		MenuComp menuD = new Menu("Dinner");
		
		for(int index = 0 ; index < 15 ;index ++){
			MenuComp item = new MenuItem("D_"+ index ,index ^ 2, index % 2 == 0);
			menuD.add(item);
		}
		
		MenuComp allMenu = new Menu("all menu");
		allMenu.add(menuB);
		allMenu.add(menuL);
		allMenu.add(menuD);
		
		Waitress waitress = new Waitress(allMenu);
		waitress.print();
		
	}
}
