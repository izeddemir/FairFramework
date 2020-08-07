package com.herokuapp.main;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import com.herokuapp.BaseTest;
import com.herokuapp.pages.MainPage;

import junit.framework.Assert;

public class mainPageTest extends BaseTest {
	
	private static final String HEADER = "Listing Line Of Credits";
	
	
	@BeforeAll
	public void beforeAll() {
		mainPage.openApp();
	}
	
	@Test
	public void listingLineHeaderTest() {
		Assert.assertTrue(mainPage.isListingLineDisplayed());
		Assert.assertEquals(HEADER, mainPage.getListingLineHeader());
	}
	
	
	@AfterAll
	public void AfterAll() {
		mainPage.closeApp();
	}


}
