package com.examples.actions;

import org.openqa.selenium.support.PageFactory;

import com.examples.locators.DataStructurePageLocators;
import com.examples.utils.HelperClass;

public class DataStructurePageActions {

	

	DataStructurePageLocators dataStructurePageLocators = null;
	 
    public DataStructurePageActions() {
 
        this.dataStructurePageLocators = new DataStructurePageLocators();
        PageFactory.initElements(HelperClass.getDriver(),dataStructurePageLocators);
    }
	
	
}
