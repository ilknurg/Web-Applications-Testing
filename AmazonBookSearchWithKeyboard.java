package edu.ucsc.webapptest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AmazonBookSearchWithKeyboard {

	public static void main(String[] args) {
	WebDriver driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("http://www.amazon.com/");
	
	WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
	searchBox.clear();
	searchBox.sendKeys("Selenium");
	
	WebDriverWait waitingTime = new WebDriverWait(driver, 5);
	waitingTime.until(ExpectedConditions.visibilityOfElementLocated(By.id("nav-cover")));
	for (int i=0; i < 4; i++ ) {
		searchBox.sendKeys(Keys.ARROW_DOWN);
	}
	searchBox.sendKeys(Keys.ENTER);
	System.out.println(driver.findElement(By.id("s-result-count")).getText());
	driver.quit();
	
	}

}
