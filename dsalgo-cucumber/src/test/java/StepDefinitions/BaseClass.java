package StepDefinitions;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;

import PageObjects.FrontPage;
import PageObjects.HomePage;
import PageObjects.RegisterPage;

public class BaseClass {
	
	
	public WebDriver driver;
	public HomePage home;
	
	public FrontPage front;
	public RegisterPage regist;
	
	
	//creating random String for unique email
	public static String randomstring()
	{
		String generatedString1=RandomStringUtils.randomAlphabetic(5);
		return(generatedString1);
	}

}
