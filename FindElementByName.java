package edu.ucsc.webapptest;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.After;
import org.junit.AfterClass;

public class FindElementByName {
	private static WebDriver driver;

	@BeforeClass
	public static void setUp() {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://selenium-testing-winwust.c9users.io/search.html");
	}

	@Test
	public void testFindElementByName() {
		WebElement textbox = driver.findElement(By.name("keyword"));
		String textBoxText = textbox.getAttribute("value");
		assertEquals("Type in your keyword", textBoxText);
	}
	
	@Test
	public void testFindElementByClassName() {
		WebElement label = driver.findElement(By.className("label"));
		String labelText = label.getText();
		assertEquals("Search", labelText);		
	}

	@AfterClass
	public static void tearDown() throws Exception {
		driver.quit();
	}
}
