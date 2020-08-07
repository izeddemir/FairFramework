package com.herokuapp.pages;

public class ShowPage extends AbstractPage {

	private static final String URL = "";
	
	public void openPage() {
		driver.navigateToPage(URL);
	}
	
}


