package com.examples.actions;

import org.openqa.selenium.support.PageFactory;

import com.examples.locators.HomePageLocators;
import com.examples.utils.HelperClass;

public class HomePageActions {

	HomePageLocators homePageLocators = null;
	 
    public HomePageActions() {
 
        this.homePageLocators = new HomePageLocators();
        PageFactory.initElements(HelperClass.getDriver(),homePageLocators);
    }
	
	
}
