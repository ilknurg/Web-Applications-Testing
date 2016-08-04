package edu.ucsc.webapptest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EbayIphoneSearchWithKeyboard {

	public static void main(String[] args) 
	{
		WebDriver driver = new FirefoxDriver(); 
		//driver.manage().window().maximize();
		driver.get("http://www.ebay.com/");
		try 
	{
		WebElement searchBox = driver.findElement(By.id("gh-ac"));
		searchBox.clear();
		searchBox.sendKeys("Iphone");
		
		WebDriverWait wait = new WebDriverWait(driver,5);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("gh-btn"))); 
		
		for (int i=0; i<4; i++); 
	{
		searchBox.sendKeys(Keys.ARROW_DOWN);
	}
	    searchBox.sendKeys(Keys.ENTER);
	    
		System.out.println(driver.findElement(By.className("listingscount")).getText());
	}
		finally 
		{
			driver.quit();
		}
		
	}

}
