package com.test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.pomRepo.LoginClass;
import com.utilities.BaseClass;
import com.utilities.FileUtility;
import com.utilities.ObjectClass;

public class LoginTest extends BaseClass {
	
	@Test(priority = 1)
	public void emptyValue() throws IOException, InterruptedException {
		ObjectClass oClass= new ObjectClass(); 
		logger.info("This method is used to validate the login page with empty username and empty password");
		oClass.login.clickLoginButton();
		logger.info("Login button is clicked without entering username and password");
		oClass.login.errorMessageDisplay();
		logger.info(driver.getTitle());
		logger.info("==============================================");
//		Thread.sleep(2000);
	}
	@Test (priority = 2)
	public void emptyUsernameValue() throws IOException, InterruptedException {
		logger.info("This method is used to validate the login page with empty username and valid password");
		ObjectClass oClass= new ObjectClass();
		String password= oClass.fUtils.fetchTheDataFromPropertiesFile("password");
		oClass.login.passwordField(password);
		logger.info("Valid password is entered");
		oClass.login.clickLoginButton();
		logger.info("Login Button is clicked with valid password and empty username");
		oClass.login.errorMessageDisplay();
		logger.info(driver.getTitle());
		logger.info("==============================================");
//		Thread.sleep(2000);
	}
	@Test (priority = 3)
	public void emptyPasswordValue() throws IOException, InterruptedException {
		logger.info("This method is used to validate the login page with valid username and empty password");
		ObjectClass oClass= new ObjectClass();
		String username= oClass.fUtils.fetchTheDataFromPropertiesFile("username");
		oClass.login.usernameField(username);
		logger.info("Valid username is entered");
		Thread.sleep(5000);
		oClass.login.clearPasswordField();
		oClass.login.clickLoginButton();
		logger.info("Login Button is clicked with valid username and empty password");
		oClass.login.errorMessageDisplay();
		logger.info(driver.getTitle());
		logger.info("==============================================");
//		Thread.sleep(2000);
	}
	@Test (priority = 4)
	public void wrongUsernameValue() throws IOException, InterruptedException {
		logger.info("This method is used to validate the login page with wrong username and valid password");
		ObjectClass oClass= new ObjectClass();
		FileUtility fUtils= new FileUtility();
		String username= fUtils.fetchTheDataFromPropertiesFile("wusername");
		String password= fUtils.fetchTheDataFromPropertiesFile("password");
		oClass.login.usernameField(username);
		logger.info("Invalid username is entered");
		oClass.login.passwordField(password);
		logger.info("Valid password is entered");
		oClass.login.clickLoginButton();
		logger.info("Login Button is clicked with Invalid username and valid password");
		oClass.login.errorMessageDisplay();
		logger.info(driver.getTitle());
		logger.info("==============================================");
//		Thread.sleep(2000);
	}
	@Test (priority = 5)
	public void wrongPasswordValue() throws IOException, InterruptedException {
		logger.info("This method is used to validate the login page with valid username and wrong password");
		ObjectClass oClass= new ObjectClass();
		FileUtility fUtils= new FileUtility();
		String username= fUtils.fetchTheDataFromPropertiesFile("username");
		String password= fUtils.fetchTheDataFromPropertiesFile("wpassword");
		oClass.login.usernameField(username);
		logger.info("Valid username is entered");
		oClass.login.passwordField(password);
		logger.info("Invalid password is entered");
		oClass.login.clickLoginButton();
		logger.info("Login Button is clicked with valid username and Invalid password");
		oClass.login.errorMessageDisplay();
		logger.info(driver.getTitle());
		logger.info("==============================================");
//		Thread.sleep(2000);
	}
	
	
	@Test  (priority = 6)
	public void loginAction() throws IOException, InterruptedException{
		LoginClass login= new LoginClass(driver); 
		ObjectClass  oClass = new ObjectClass();
		String username=oClass.fUtils.fetchTheDataFromPropertiesFile("username");
		String password=oClass.fUtils.fetchTheDataFromPropertiesFile("password");
		oClass.login.usernameField(username);
		logger.info("Valid username is entered");
		oClass.login.passwordField(password);
		logger.info("Valid password is entered");
		oClass.login.clickLoginButton();
		logger.info("Login button is clicked with valid credentials");
		logger.info(driver.getTitle());
		logger.info("==============================================");
//		Thread.sleep(2000);
	}
	

}
