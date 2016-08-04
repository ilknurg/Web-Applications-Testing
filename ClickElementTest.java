package edu.ucsc.webapptest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ClickElementTest {
	private WebDriver driver ; 
	
	@Before
	public void setUp() {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("file:///Users/ilknurgokcuoglu/Desktop/Coding/Web%20App%20Testing/class3code/button.html");
	}
	
	@Test
	public void TestClickButton() throws InterruptedException {
		WebElement element = driver.findElement(By.id("btn"));
		element.click();
		WebElement element2 = driver.findElement(By.id("display"));
		assertEquals("Hello" , element2.getText());
		Thread.sleep(2000);
	}
	@After
	public void tearDown() throws Exception {
		driver.close();
	}

}
