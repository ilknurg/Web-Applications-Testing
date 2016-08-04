package edu.ucsc.webapptest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FacebookTest {
	private WebDriver driver;
	
	@Before
	public void setUp() {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	}
	
	@Test
	public void FacebookLogin() throws InterruptedException {
	WebElement username = driver.findElement(By.id("email"));
	username.clear();
	username.sendKeys("someoneelse@abc.com");
	
	WebElement password = driver.findElement(By.id("pass"));
	password.clear();
	password.sendKeys("aaaaaa");
	
	WebElement button = driver.findElement(By.id("u_0_o"));
	button.click();
	Thread.sleep(3000);
	}
	
	@After
	public void tearDown() throws Exception {
		
		driver.close();
	}
}
