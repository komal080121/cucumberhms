package com.hms.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {

	Properties properties;
	
	String dir = System.getProperty("user.dir");
	String path = dir+"\\src\\main\\resources\\config.properties";

	public ReadConfig() {
		try {
			properties = new Properties();
			FileInputStream fis = new FileInputStream(path);
			properties.load(fis);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public String getBaseUrl() {
		String value = properties.getProperty("baseUrl");
		if (value != null)
			return value;
		else
			throw new RuntimeException("url is not specified in cofigued file");
	}

	public String getBrowser() {
		String value = properties.getProperty("browser");
		if (value != null)
			return value;
		else
			throw new RuntimeException("url is not specified in cofigued file");
	}

}
