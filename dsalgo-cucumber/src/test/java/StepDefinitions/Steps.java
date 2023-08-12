package StepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import PageObjects.FrontPage;
import PageObjects.HomePage;
import PageObjects.RegisterPage;
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
		regist = new RegisterPage(driver);
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

//	Registration

	@When("User enters Username as {string} , Password as {string} and Password confirmation as {string}")
	public void user_enters_username_as_password_as_and_password_confirmation_as(String username, String password,
			String password3) {
		regist.enterTxtintoUsername(username);
		regist.enterTxtintoPassword(password);
		regist.enterTxtintoconfirmationPassword(password3);
	}

	@When("The user clicks on Register button")
	public void the_user_clicks_on_register_button() {
		regist.clickonRegisterButton();
	}

	@Then("It should display an error {string} below Username textbox")
	public void it_should_display_an_error_below_username_textbox(String expectedMessage) {
		String actualMessage = regist.txtUsername.getAttribute("validationMessage");
		Assert.assertEquals(actualMessage, expectedMessage);

	}
	@Then("It should display an error message {string}")
	public void it_should_display_an_error_message(String expectedMessage) {
		
		String actualMessage =home.getErrorMessage();
		System.out.println(actualMessage);
		Assert.assertEquals(actualMessage, expectedMessage);
	}
	@Then("The user should be redirected to Homepage with the message {string}")
	public void the_user_should_be_redirected_to_homepage_with_the_message(String expectedMessage) {
		String actualMessage =home.getErrorMessage();
		Assert.assertEquals(actualMessage, expectedMessage);
		System.out.println(driver.getTitle());
		System.out.println(actualMessage);
	}

	

	
	
	@Then("The user should get error message {string} below first empty field {string} {string} {string}.")
	public void the_user_should_get_error_message_below_first_empty_field(String expectedMessage, String username, String password, String passwordconfirm) {
	
		if(username.isEmpty())
		{
			String actualMessage = regist.txtUsername.getAttribute("validationMessage");
			Assert.assertEquals(actualMessage, expectedMessage);
		}
		else if(password.isEmpty())
		{
			String actualMessage = regist.txtPassword.getAttribute("validationMessage");
			Assert.assertEquals(actualMessage, expectedMessage);
		}
		else if(passwordconfirm.isEmpty()) {
			
			String actualMessage = regist.txtPasswordConfirmation.getAttribute("validationMessage");
			Assert.assertEquals(actualMessage, expectedMessage);
			
		}
		
	
	}

	@When("User click on Get Started of {string}")
	public void user_click_on_get_started_of(String option) {
		home.clickOnGetStartedOfEachSection(option);
	}

	@Then("close browser")
	public void close_browser() {
		driver.quit();
	}

}
