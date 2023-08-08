package com.examples.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPageLocators {
	
	
	//a[contains(text(),'Register!')]
	
		@FindBy(xpath="//a[contains(text(),'Register!')]")
		WebElement noAccountRegister;
		
		//input[@type='text']
		@FindBy(xpath="//input[@type='text']")
		WebElement signInUsername;
		
		
		//input[@type='password']
		@FindBy(xpath="//input[@type='password']")
		WebElement signInPassword;
		
		
		//input[@value='Login']
		@FindBy(xpath="//input[@value='Login']")
		WebElement signInLogin;
		
		

}
