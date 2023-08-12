package StepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import PageObjects.FrontPage;
import PageObjects.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Steps extends BaseClass {

	@Given("User Launch Chrome browser")
	public void user_launch_chrome_browser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		home = new HomePage(driver);
		front = new FrontPage(driver);
	}

	@When("User opens URL {string}")
	public void user_opens_url(String url) {
		driver.get(url);
	}

	@Then("Page Title should be {string}")
	public void page_title_should_be(String titile) {
		if (driver.getPageSource().contains("Login was unsuccessful.")) {
			driver.close();
			Assert.assertTrue(false);
		} else {
			Assert.assertEquals(titile, driver.getTitle());
		}

	}

	@When("Click on Get Started")
	public void click_on_get_started() throws Exception {
		front.clickonGetStarted();
	}

	@When("User click on Register link")
	public void user_click_on_register_link() {
		home.clickOnRegister();
	}

	@When("User click on Sign in link")
	public void user_click_on_sign_in_link() {
		home.clickOnSignIn();
	}
	
	@When("User click on Data Structure DropDown")
	public void user_click_on_data_structure_drop_down() {
	    home.clickOnDataStructure();
	}

	@When("User click on {string}")
	public void user_click_on(String option) {
	   home.clickOnDSOption(option);
	}

	@Then("The user get warning message {string}")
	public void the_user_get_warning_message(String string) {
	   home.getErrorMessage();
	}

	@Then("close browser")
	public void close_browser() {
		driver.quit();
	}

}
