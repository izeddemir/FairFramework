package com.herokuapp.pages;

import com.herokuapp.configuration.DriverFunctions;

public abstract class AbstractPage {

	static DriverFunctions driver = new DriverFunctions();
	
	public void openApp() {
		driver.openHerokuApp();
	}
	
	public void closeApp() {
		driver.quitSession();
	}
	
	
}
