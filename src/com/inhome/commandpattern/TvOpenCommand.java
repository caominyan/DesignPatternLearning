package com.inhome.commandpattern;

public class TvOpenCommand implements Command {

	public TvClient mTvClient;
	
	public TvOpenCommand(TvClient tvClient){
		this.mTvClient = tvClient;
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		mTvClient.openTv();
	}

}
