package com.herokuapp;

import org.junit.jupiter.api.TestInstance;

import com.herokuapp.configuration.PropertyReader;
import com.herokuapp.pages.EditPage;
import com.herokuapp.pages.MainPage;
import com.herokuapp.pages.ShowPage;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public abstract class BaseTest {

	protected MainPage mainPage = new MainPage();
	
	protected EditPage editPage = new EditPage();
	
	protected ShowPage showPage = new ShowPage();
	
	PropertyReader properties = new PropertyReader();
}
