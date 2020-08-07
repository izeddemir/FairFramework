package com.herokuapp.configuration;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyReader {

	Properties p = new Properties();

	public PropertyReader() {
		try {
			InputStream stream = this.getClass().getResourceAsStream("/application.properties");
			p.load(stream);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}  

	public String getProperty(String key) {
		return p.get(key).toString();
	}

}
