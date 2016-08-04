package edu.ucsc.webapptest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UCSC_ScreenShot_Test_2 {

	public static void main(String[] args) {
	WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.ucsc-extension.edu/");
		
		WebElement element = driver.findElement(By.cssSelector("#section-footer ul.menu:nth-child(2)"));
		
		
	}

	}

