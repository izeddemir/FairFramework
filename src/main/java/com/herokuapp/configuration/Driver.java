package com.herokuapp.configuration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.stereotype.Component;

import io.github.bonigarcia.wdm.WebDriverManager;

@Component
public class Driver {
	
	public static WebDriver driver;

    public static WebDriver getChromeDriver()
    {
        return driver;
    }
    
    public static WebDriver setChromeDriver()
    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        return driver;
    }
	
}
