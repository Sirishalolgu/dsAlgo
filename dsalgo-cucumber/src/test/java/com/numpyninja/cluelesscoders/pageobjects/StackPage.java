package com.numpyninja.cluelesscoders.pageobjects;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;




public class StackPage {

	public WebDriver driver ;
	 List<WebElement> topicList;
	 List<String> codeTest;
     String s ="print'hello'";
		
	
	String expected, actual;
	public String url = "https://dsportalapp.herokuapp.com/login";
	 By sign_In = By.xpath("//a[text()='Sign in']");
		By dropdown = By.xpath("//a[@class='nav-link dropdown-toggle']");
 	By stack =By.xpath("//a[text()='Stack']");
		By get_started = By.xpath("//button[text()='Get Started']");
	 By stack_get =By.xpath("//h5[text()='Stack']/../a[text()='Get Started']");
	 By listTopic = By.xpath("//a[@class='list-group-item']");
	 By operation = By.xpath("//a[@class='list-group-item'][text()='Operations in Stack']");
	 By topicLeft = By.xpath("//li[contains(@class,'list-group-item')]/a");
	
	 By try_here =By.xpath("//a[text()='Try here>>>']");
	 By code_text =By.xpath("//div[contains(@class, 'CodeMirror')]/div/textarea");
	 By practiceQues = By.xpath("//a[text()='Practice Questions']");
	 By btnRun = By.xpath("//button[text()='Run']");
	 By out = By.id("output");
		
		
	public StackPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(this.driver, this);
	}
	

	
public void selectStackList() {
	driver.findElement(dropdown).click();
	driver.findElement(stack).click();
}

public String getPageUrl() {
	
	actual=driver.getCurrentUrl();
	return actual;
}

public void clickonTopics(String topicLink) throws InterruptedException {
	JavascriptExecutor js =(JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,500)");
	List<String>topicArray = List.of(topicLink.split(","));
	Iterator<String> a = topicArray.iterator();
	while(a.hasNext()){
		String topicToClick = a.next();
		driver.findElement(By.xpath("//a[contains(text(),'"+topicToClick+"')]")).click();
		driver.findElement(try_here).click();
		Thread.sleep(1000);
		driver.findElement(code_text).sendKeys(s);
		driver.findElement(btnRun).click();
		Thread.sleep(1000);
		driver.navigate().back();
		
		}
	}
	public void clickonTryHere() throws InterruptedException {
			Thread.sleep(2000);
		}

	


}
