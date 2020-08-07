package com.herokuapp.main;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import com.herokuapp.BaseTest;
import com.herokuapp.pages.MainPage;

import junit.framework.Assert;

//Call methods from editpage.class 

public class editPageTest extends BaseTest {
	
	private static final String HEADER = "Editing Line Of Credit";
	
	@BeforeAll
	public void beforeAll() {
		editPage.openApp();
	}
	
	@Test
	public void someTest() {
		//assertions
	}
	
	
	@AfterAll
	public void AfterAll() {
		editPage.closeApp();
	}


}
