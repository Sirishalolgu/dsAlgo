package com.numpyninja.cluelesscoders.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class FrontPage {

	public WebDriver ldriver;

	public FrontPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(ldriver, this);
	}

	@FindBy(xpath = "//button[@class='btn']")
	public WebElement getStarted;

	public void clickonGetStarted() throws Exception {
		// waitForElement(20,getStarted);
		getStarted.click();
	}
}
