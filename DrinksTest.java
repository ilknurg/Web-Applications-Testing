package edu.ucsc.webapptest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.*;

public class DrinksTest {
	private WebDriver driver;

	@Before
	public void setUp() {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("file:///Users/ilknurgokcuoglu/Desktop/Coding/Web%20App%20Testing/class3code/radiobuttons.html");
	}

	@Test
	public void testClickRadioButtons() {
		// XPath selectors
//		WebElement fish = driver.findElement(By.xpath("//input[@value='fish']"));
//		WebElement pickle = driver.findElement(By.xpath("//input[@value='pickle']"));
//		WebElement soda = driver.findElement(By.xpath("//input[@value='soda']"));
		// CSS selectors
		WebElement fish = driver.findElement(By.cssSelector("input[value='fish']"));
		WebElement pickle = driver.findElement(By.cssSelector("input[value='pickle']"));
		WebElement soda = driver.findElement(By.cssSelector("input[value='soda']"));
		
		fish.click();
		pickle.click();
		soda.click();
		
		WebElement display = driver.findElement(By.id("price"));
		assertEquals("6", display.getText());	
		
		List<WebElement> drinkOptions = driver.findElements(By.name("drink"));
		for (WebElement drink : drinkOptions) {
			if (drink.getAttribute("value").equals("soda")) {
				assertTrue(drink.isSelected());
			} else {
				assertFalse(drink.isSelected());
			}
		}
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

}
