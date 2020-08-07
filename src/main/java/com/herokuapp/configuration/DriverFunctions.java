package com.herokuapp.configuration;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DriverFunctions extends Driver {
	
	private static final String URL_PROPERTY = "herokuApp.url"; 
	
	PropertyReader property = new PropertyReader();

	public void openHerokuApp() {
		setChromeDriver();
		driver.get(property.getProperty(URL_PROPERTY));
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
	}
	
	public void navigateToPage(String page_url) {
		driver.get(property.getProperty(page_url));
	}
	
	public String getPageUrl(String page_url) {
		return property.getProperty(page_url);
	}
	
	public void quitSession() {
		getChromeDriver().quit();
	}
	
	public WebElement getElement(By by) {
		wait((Function) -> driver.findElement(by).isDisplayed());
		return driver.findElement(by);
	}
	
	public List<WebElement> getElements(By by) {
		wait((Function) -> driver.findElement(by).isDisplayed());
		return driver.findElements(by);
	}
	
	public void wait(Function function) {
		WebDriverWait wait = new WebDriverWait(Driver.getChromeDriver(), 5);
		wait.pollingEvery(500, TimeUnit.MILLISECONDS).until(function);
	}
	
	public void waitForElementToBeClickable(By elementLocator) {
		WebDriverWait wait = new WebDriverWait(Driver.getChromeDriver(), 5);
		wait.until(ExpectedConditions.elementToBeClickable(elementLocator));
	}
	
	public void waitForElementToBeVisible(By elementLocator) {
		WebDriverWait wait = new WebDriverWait(Driver.getChromeDriver(), 5);
		wait.until(ExpectedConditions.visibilityOfElementLocated(elementLocator));
	}
	
	public void waitForElementToBeInvisible(By elementLocator) {
		WebDriverWait wait = new WebDriverWait(Driver.getChromeDriver(), 5);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(elementLocator));
	}

	public void waitForElementToBeSelected(By elementLocator) {
		WebDriverWait wait = new WebDriverWait(Driver.getChromeDriver(), 5);
		wait.until(ExpectedConditions.elementToBeSelected(elementLocator));
	}

}
