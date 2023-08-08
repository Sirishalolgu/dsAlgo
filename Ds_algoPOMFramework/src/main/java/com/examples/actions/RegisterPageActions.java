package com.examples.actions;

import org.openqa.selenium.support.PageFactory;

import com.examples.locators.RegisterPageLocators;
import com.examples.utils.HelperClass;

public class RegisterPageActions {

	
	RegisterPageLocators registerPageLocators = null;
	 
    public RegisterPageActions() {
 
        this.registerPageLocators = new RegisterPageLocators();
        PageFactory.initElements(HelperClass.getDriver(),registerPageLocators);
    }
}
