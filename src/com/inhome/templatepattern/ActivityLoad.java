package com.inhome.templatepattern;

public abstract class ActivityLoad {

	public void loadActivity(){
		onCreate();
		onStart();
		onResume();
		onPause();
		onStop();
		onDestroy();
	}
	
	protected abstract void onCreate();
	
	protected abstract void onStart();
	
	protected abstract void onResume();
	
	protected abstract void onPause();
	
	protected abstract void onStop();
	
	protected abstract void onDestroy();
	
	
}
