package com.inhome.commandpattern;

public class TvCloseCommand implements Command {

	public TvClient mTvClient;
	
	public TvCloseCommand(TvClient tvClient){
		this.mTvClient = tvClient;
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		mTvClient.closeTv();
	}

}
