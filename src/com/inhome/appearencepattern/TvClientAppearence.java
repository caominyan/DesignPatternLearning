package com.inhome.appearencepattern;

public class TvClientAppearence {
	
	private TvClient tvClient;

	public TvClientAppearence(TvClient tvClient) {
		super();
		this.tvClient = tvClient;
	}
	
	public void watchTv(){
		tvClient.openTv();
		tvClient.changeChannel();
		tvClient.changeVolumn();
	}
	
	
}
