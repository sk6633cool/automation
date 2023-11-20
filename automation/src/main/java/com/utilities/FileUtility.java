package com.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


public class FileUtility {
	public String fetchTheDataFromPropertiesFile(String Key) throws IOException {
		FileInputStream fis= new FileInputStream("./src/main/resources/testData.properties");
		Properties property= new Properties();
		property.load(fis);
		return property.getProperty(Key);
	}
	

}
