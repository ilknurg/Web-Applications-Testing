package edu.ucsc.webapptest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class button {

	public button() {
		// TODO Auto-generated constructor stub
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		
		driver.get("http://selenium-testing-winwust.c9users.io/button.html");
		
		
		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
	}

}





