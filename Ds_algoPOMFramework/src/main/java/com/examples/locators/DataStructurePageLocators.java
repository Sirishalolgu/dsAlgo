package com.examples.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DataStructurePageLocators {

	
	//a[contains(text(),'Get Started')]/..//h5[contains(text(),'Data Structures-Introduction')]
		@FindBy(xpath="//a[contains(text(),'Get Started')]/..//h5[contains(text(),'Data Structures-Introduction')]")
		WebElement getStartedDataStructure;
		
		//a[contains(text(),'Time Complexity')]
		@FindBy(xpath="//a[contains(text(),'Time Complexity')]")
		WebElement timeComplexicity;
		
		//Try here>>>
		@FindBy(partialLinkText = "Try here>>>")
		WebElement tryHere;
		
		
		//div[@class='CodeMirror-code']//pre[1][@class=' CodeMirror-line ']
		
		
}
