package com.numpyninja.cluelesscoders.testrunner;



import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


//@RunWith(Cucumber.class) //Junit execution 
@CucumberOptions(
		plugin = {"pretty", "html:target/cucumber.html","json:target/cucumber.json",					
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}, //reporting purpose
		monochrome=true,  //console output color
		// tags =  "@Invalid or @Home",//from feature file
		features = ".//Features",//location of feature files
		dryRun=false,
		glue= "com.numpyninja.cluelesscoders.stepdefinitions") 
public class TestRun extends AbstractTestNGCucumberTests{

	@Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
				
		return super.scenarios();
    }
	
	
	
}
