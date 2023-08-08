package com.examples.actions;

import org.openqa.selenium.support.PageFactory;

import com.examples.locators.FrontPageLocators;
import com.examples.utils.HelperClass;

public class FrontPageActions {

	
	
	FrontPageLocators frontPageLocators = null;
	 
    public FrontPageActions() {
 
        this.frontPageLocators = new FrontPageLocators();
        PageFactory.initElements(HelperClass.getDriver(),frontPageLocators);
    }
	
}
