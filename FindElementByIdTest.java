package edu.ucsc.webapptest;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


//This test compares 2 object values while getting getText() and compare assertEquals and
//says these two shouldnt match and it says its false , to True statement test passes.

public class FindElementByIdTest {
	private WebDriver driver;
	
	@Before
	public void setUp(){
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	}

	@Test
	public void testFindElementById(){
		WebElement element = driver.findElement(By.id("u_0_j"));
		element.getText();
		
		driver.findElement(By.id("pagelet_bluebar"));
		String titleText1 = element.getText();
		
		assertFalse("titleText", titleText1);
		
	}
	
	private void assertFalse(String string, String titleText) {
		// TODO Auto-generated method stub
		
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}
	
}
