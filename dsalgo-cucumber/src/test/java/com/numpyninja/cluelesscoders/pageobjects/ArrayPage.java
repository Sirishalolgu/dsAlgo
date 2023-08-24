package com.numpyninja.cluelesscoders.pageobjects;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class ArrayPage {
	
public WebDriver driver;
	
	
	List<WebElement> topicList;
	String expected, actual;
	public String url = "https://dsportalapp.herokuapp.com/login";
	By dropdown = By.xpath("//a[@class='nav-link dropdown-toggle']");
		By listTopic = By.xpath("//a[@class='list-group-item']");
	By pageContent = By.xpath("//strong/p[contains(@class,'bg-secondary')]");
	By topicLeft = By.xpath("//li[contains(@class,'list-group-item')]/a");
	By try_here =By.xpath("//a[text()='Try here>>>']");
	By codeText = By.xpath("//div[contains(@class, 'CodeMirror')]/div/textarea");
	By btnRun = By.xpath("//button[text()='Run']");
	By out = By.id("output");
	By practiceQues = By.xpath("//a[text()='Practice Questions']");
	By array_python = By.xpath("//a[contains(text(),'Arrays in Python')]");
	By text = By.className("CodeMirror-scroll");
	
	
	
	public ArrayPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(this.driver, this);
	}
  
	public void clickonPracticeQues() {
		driver.findElement(array_python).click();
	   driver.findElement(practiceQues).click();
	   
	}
	public void runandsubmit(String topicLink) throws InterruptedException {
		driver.navigate().forward();
		List<String>topicArray = List.of(topicLink.split(","));
		Iterator<String> a = topicArray.iterator();
		while(a.hasNext()) {
			String topicToClick = a.next();
			driver.findElement(By.xpath("//a[contains(text(),'"+topicToClick+"')]")).click();
			Thread.sleep(1000);
		WebElement s = driver.findElement(text);
		driver.findElement(btnRun).click();
		driver.switchTo().alert().accept();
		driver.navigate().back();
		//driver.findElement(submit).click();
		}
	}

}
