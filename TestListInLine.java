package edu.ucsc.webapptest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertArrayEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.*;

public class TestListInLine {
	private WebDriver driver;

	@Before
	public void setUp() {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("file:///Users/ilknurgokcuoglu/Desktop/Coding/Web%20App%20Testing/class3code/multiple.html");
	}
	
	@Test
	public void testListInlineStyle() {
		WebElement color = driver.findElement(By.name("color"));
		assertEquals("100px", color.getCssValue("width"));
		assertEquals("100px", color.getCssValue("height"));
	}
	
	@Test
	public void testListSelection() {
		WebElement color = driver.findElement(By.name("color"));
		Select select = new Select(color);
		assertTrue(select.isMultiple());
		
		select.selectByIndex(2);
		select.selectByIndex(1);
		select.deselectByIndex(1);
		select.selectByIndex(3);
		select.deselectByIndex(2);
		select.selectByIndex(0);
		
		WebElement display = driver.findElement(By.id("display"));
		assertEquals("Black,Brown", display.getText());
		assertEquals("Black", select.getFirstSelectedOption().getText());
		
		String[] expectedSelections = new String[] {"Black", "Brown"};
		List<String> actualSelections = new ArrayList<String>();
		
		for (WebElement option : select.getAllSelectedOptions()) {
			actualSelections.add(option.getText());
		}
		
		assertArrayEquals(expectedSelections, actualSelections.toArray());
		assertEquals(2, select.getAllSelectedOptions().size());
	}

	@After
	public void tearDown() throws Exception {
		// Close the browser
		driver.quit();
	}
}
