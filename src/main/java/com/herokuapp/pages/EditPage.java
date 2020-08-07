package com.herokuapp.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class EditPage extends AbstractPage {
	
	private static final String URL = "edit.page.url";
	private static final String EDIT_LINE_CSS = "body h1";

	public void openPage(int edit_number) {
		String url = driver.getPageUrl(URL);
		driver.navigateToPage(url + "/" + edit_number + "/edit");
	}
	
	private WebElement getEditLine() {
		return driver.getElement(By.cssSelector(EDIT_LINE_CSS));
	}
	
	public boolean isEditLineDisplayed() {
		return getEditLine().isDisplayed();
	}
	
	public String getEditLineHeader() {
		return getEditLine().getText();
	}
	



}
