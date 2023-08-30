package com.numpyninja.cluelesscoders.stepdefinitions;

import java.util.Properties;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;

import com.numpyninja.cluelesscoders.pageobjects.ArrayPage;
import com.numpyninja.cluelesscoders.pageobjects.DataStructurePage;
import com.numpyninja.cluelesscoders.pageobjects.FrontPage;
import com.numpyninja.cluelesscoders.pageobjects.HomePage;
import com.numpyninja.cluelesscoders.pageobjects.RegisterPage;
import com.numpyninja.cluelesscoders.pageobjects.SignPage;
import com.numpyninja.cluelesscoders.pageobjects.StackPage;
import com.numpyninja.cluelesscoders.pageobjects.graphPage;

public class BaseClass {
	
	
	public WebDriver driver;
	public HomePage home;
	
	public FrontPage front;
	public RegisterPage regist;
	public SignPage signIn;
	public DataStructurePage dataStructure;
	public StackPage stack;
	public ArrayPage array;
	public graphPage graph;
	
	public Properties configProp;
	//creating random String for unique email
	public static String randomstring()
	{
		String generatedString1=RandomStringUtils.randomAlphabetic(5);
		return(generatedString1);
	}

}
