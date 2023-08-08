package com.examples.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPageLocators {

	//id   id_username
	@FindBy(id="id_username")
	WebElement UserName;
	
	
	//id  id_password1
	@FindBy(id="id_password1")
	WebElement passWord;
	
	//id   id_password2
	@FindBy(id="id_password2")
	WebElement confirmPassword;
	
	//input[@type='submit']
	@FindBy(xpath="//input[@type='submit']")
	WebElement sUbmit;
	
	
}	
