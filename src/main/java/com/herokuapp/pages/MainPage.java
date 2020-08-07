package com.herokuapp.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MainPage extends AbstractPage {
	
	private static final String URL = "herokuApp.url";
	private static final String LISTING_LINE_CSS = "body h1";
	private static final String SOME_XPATH2 = "";
	private static final String SOME_XPATH3 = "";
	
	public void openPage() {
		driver.navigateToPage(URL);
	}
	
	private WebElement getListingLine() {
		return driver.getElement(By.cssSelector(LISTING_LINE_CSS));
	}
	
	public boolean isListingLineDisplayed() {
		return getListingLine().isDisplayed();
	}
	
	public String getListingLineHeader() {
		return getListingLine().getText();
	}

}
