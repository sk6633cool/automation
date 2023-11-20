package com.utilities;

import org.openqa.selenium.WebDriver;

import com.pomRepo.LoginClass;

public class ObjectClass extends BaseClass {
//	WebDriver driver;
	public FileUtility fUtils= new FileUtility();
	public LoginClass login = new LoginClass(driver);
	

}
