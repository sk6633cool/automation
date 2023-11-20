package com.demoTest;

import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginToWebPage {
	private static final Logger logger = LogManager.getLogger(LoginToWebPage.class);
	public static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.name("user-name")).sendKeys("standard_user");
		driver.findElement(By.name("user-name")).sendKeys(Keys.chord(Keys.CONTROL,"a"),"standard_user");
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		
		driver.findElement(By.name("login-button")).click();
		logger.info("this is information that logger is working"); 
		
	}

}
