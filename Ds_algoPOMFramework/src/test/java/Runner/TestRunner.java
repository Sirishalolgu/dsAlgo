package Runner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//@RunWith(Cucumber.class) //Junit execution

	@CucumberOptions(
			plugin = {"pretty", "html:target/cucumber.html"}, //reporting purpose
			monochrome=false,  //console output color
			 //tags from feature file
			features = {"src/test/resources/features/Home.feature"}, //location of feature files
			glue= "StepDefinition") //location of step definition files
//	tags = "@Home",

public class TestRunner extends AbstractTestNGCucumberTests {
		
		
		@Override
	    @DataProvider(parallel = true)
	    public Object[][] scenarios() {
					
			return super.scenarios();
	    }

}
