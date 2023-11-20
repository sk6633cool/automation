package com.pomRepo;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utilities.BaseClass;


public class LoginClass extends BaseClass {
//	WebDriver driver;
	public LoginClass(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(id="user-name")
	private WebElement usernameTextField;
	
	@FindBy(id="password")
	private WebElement passwordTextField;
	
	@FindBy(id="login-button")
	private WebElement loginButton;
	
	@FindBy(xpath="//h3[@data-test='error']")
	private WebElement errorMessage;
	
	
	public WebElement getUsernameTextField() {
		return usernameTextField;
	}
	public WebElement getPasswordTextField() {
		return passwordTextField;
	}
	public WebElement getLoginButton() {
		return loginButton;
	}
	public WebElement getErrorMessage() {
		return errorMessage;
	}
	public void clearUsernameField() {
		usernameTextField.clear();
	}
	public void clearPasswordField() {
		passwordTextField.sendKeys(Keys.chord(Keys.CONTROL,"a"),Keys.DELETE);
	
	}
	public void usernameField(String username) {
		usernameTextField.sendKeys(Keys.chord(Keys.CONTROL,"a"),username);
		
	}
	public void passwordField(String password) {
		passwordTextField.sendKeys(Keys.chord(Keys.CONTROL,"a"),password);
	}
	public void clickLoginButton() {
		loginButton.click();
	}
	public void errorMessageDisplay() {
//		System.out.println(errorMessage.getText());
		logger.info(errorMessage.getText());
	}
	
	

}
