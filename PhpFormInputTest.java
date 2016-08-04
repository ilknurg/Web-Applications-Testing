package edu.ucsc.webapptest;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PhpFormInputTest{
	private WebDriver driver;

	@Before
	public void setUp() {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("file:///Users/ilknurgokcuoglu/Desktop/Coding/Web%20App%20Testing/class3code/input.html");
	}

	@Test
	public void testClickButton() {
		WebElement input = driver.findElement(By.id("name"));
		input.sendKeys("John");
		input.submit();
		// second page
		WebElement display = driver.findElement(By.id("display"));		
		assertEquals("John", display.getText());
		// you have to get find input again
		input = driver.findElement(By.id("name"));
		assertEquals("", input.getAttribute("value"));
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}
}

