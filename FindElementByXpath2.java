package edu.ucsc.webapptest;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindElementByXpath2 {
	private WebDriver driver;

	@Before
	public void setUp() {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://selenium-testing-winwust.c9users.io/divs.html");
	}

	@Test
	public void testHelloByXPath() {
		WebElement p1 = driver.findElement(By.id("id0"));
		assertEquals("Hello", p1.getText());
	}
	
	@Test
	public void testWorldByXPath() {
		WebElement p2 = driver.findElement(By.id("id1"));
		assertEquals("World", p2.getText());
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}
}
