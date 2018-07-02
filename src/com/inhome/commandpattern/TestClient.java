package com.inhome.commandpattern;

public class TestClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TvClient tvClient = new TvClient();
		Controller controller = 
				new Controller(
						new TvCloseCommand(tvClient), 
						new TvOpenCommand(tvClient));
		
		controller.doCommand1();
		controller.doCommand2();
	}

}
