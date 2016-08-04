package edu.ucsc.webapptest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class isMultipeOptions {
	private WebDriver driver; 
	
	@Before
	public void setUp() {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("file:///Users/ilknurgokcuoglu/Desktop/Coding/Web%20App%20Testing/class3code/multiple.html");
	}
		
	@Test
	public void TestingMultipleOptions() {
		
		WebElement element = driver.findElement(By.id("color"));
		
		Select select = new Select(element);
		assertTrue(select.isMultiple());
		
		select.selectByIndex(0);
		select.selectByIndex(1);
		select.selectByIndex(2);
		select.selectByIndex(3);
		select.selectByIndex(4);
		
		WebElement display = driver.findElement(By.tagName("p"));
		
		System.out.println(display.getText());
	}
	
	
	@After
	public void tearDown() throws Exception {

		driver.quit();
	}
	}
