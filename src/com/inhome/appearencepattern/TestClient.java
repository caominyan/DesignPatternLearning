package com.inhome.appearencepattern;

public class TestClient {
	
	
	public static void main(String[] args) {
		TvClient tvClient = new TvClient();
		TvClientAppearence tvClientAppearence = new TvClientAppearence(tvClient);
		tvClientAppearence.watchTv();
		
		tvClient.closeTv();
		
	}
	
}
