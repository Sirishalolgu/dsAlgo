package com.examples.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageLocators {

	//a[contains(text(),'Get Started')]/..//h5[contains(text(),'Data Structures-Introduction')]
	@FindBy(xpath="//a[contains(text(),'Get Started')]/..//h5[contains(text(),'Data Structures-Introduction')]")
	WebElement getStartedDataStructure;
	
	//a[contains(text(),'Sign in')]
	@FindBy(xpath="//a[contains(text(),'Sign in')]")
	WebElement SignIn;
	
	//a[contains(text(),'Register')]
	@FindBy(xpath="//a[contains(text(),'Register')]")
	WebElement Register;
	
	@FindBy(xpath="//a[@class='nav-link dropdown-toggle']")
	WebElement dataStructureDropdown;
}
