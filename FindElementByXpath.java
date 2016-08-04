package edu.ucsc.webapptest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindElementByXpath {

	private WebDriver driver;
	
	@Before
	public void setUp(){
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://selenium-testing-winwust.c9users.io/table.html");
	} 
	@Test
	public void TestFindElementByXpath() {
		WebElement element = driver.findElement(By.xpath("//input"));
		String element2 = element.getAttribute("value");
		assertEquals("12", element2);
	}
	@After
	public void tearDown() throws Exception {
		driver.close();
	}
}

