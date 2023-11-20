package com.utilities;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.internal.EclipseInterface;

import com.pomRepo.LoginClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	public static Logger logger=(Logger) LogManager.getLogger(BaseClass.class);
	
	@BeforeClass
	public void bmConfig() throws IOException {
		FileUtility fUtils= new FileUtility();
		String url= fUtils.fetchTheDataFromPropertiesFile("url");
//		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
		WebDriverManager.chromedriver().setup();
		logger.info("Stepup of CromeDriver is done");
		driver= new ChromeDriver();
		logger.info("Browser has been launched");
		driver.manage().window().maximize();
		logger.info("Browser is maximized");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(url);
		logger.info("Driver control is Navigate to the url");
		
	}
	@AfterClass
	public void amConfig() {
//		driver.quit();
		Mail m= new Mail();
		m.Demoemail();
		logger.info("Browser is closed successfully and server connection is also disconnected");
	}

}
