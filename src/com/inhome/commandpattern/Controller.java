package com.inhome.commandpattern;

public class Controller {
	
	private Command command1;
	
	private Command command2;
	
	
	
	public Controller(Command command1, Command command2) {
		super();
		this.command1 = command1;
		this.command2 = command2;
	}

	public void doCommand1(){
		command1.execute();
	}
	
	public void doCommand2(){
		command2.execute();
	}
}
