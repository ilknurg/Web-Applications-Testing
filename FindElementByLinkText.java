package edu.ucsc.webapptest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindElementByLinkText {
	private WebDriver driver; 
	
	@Before
	public void setUp() {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://selenium-testing-winwust.c9users.io/links.html");
	}

	@Test
	public void TestFindElementByLinkText() throws InterruptedException {
		WebElement element = driver.findElement(By.linkText("Google Link"));
		assertEquals("http://www.google.com/", element.getAttribute("href"));
		Thread.sleep(3000);
	}
	@After
	public void tearDown() throws Exception {
		driver.quit();
	}
	
	
}

