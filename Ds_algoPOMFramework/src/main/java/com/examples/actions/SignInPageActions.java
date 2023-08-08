package com.examples.actions;

import org.openqa.selenium.support.PageFactory;

import com.examples.locators.SignInPageLocators;
import com.examples.utils.HelperClass;

public class SignInPageActions {

	SignInPageLocators signInPageLocators = null;
	 
    public SignInPageActions() {
 
        this.signInPageLocators = new SignInPageLocators();
        PageFactory.initElements(HelperClass.getDriver(),signInPageLocators);
    }
	
	
}
