package TestRunner;



import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;




//@RunWith(Cucumber.class) //Junit execution 
@CucumberOptions(
		plugin = {"pretty", "html:target/cucumber.html"}, //reporting purpose
		monochrome=true,  //console output color
		 //tags from feature file
		features = ".//Features/home.feature", //location of feature files
		dryRun=false,
		glue= "StepDefinitions") 
public class TestRun extends AbstractTestNGCucumberTests{

	@Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
				
		return super.scenarios();
    }
	
	
	
}
