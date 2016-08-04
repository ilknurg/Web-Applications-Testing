/*
 * - Go to http://www.amazon.com/
*- Search “Selenium WebDriver” using the search box in the home page
*- In the result page, print out the number of books listed in the first result page
*and the book title and its paperback price for each listed book. Note that the
*paperback price is optional with bonus points.
*Make sure that you print out the red price for immediately below Paperback
*($44.99)
 */

package edu.ucsc.webapptest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class assignment1 {
	public static void main(String[] args) {
	
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		try {
			driver.get("http://www.amazon.com");
			
			WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
			searchBox.clear();
			searchBox.sendKeys("Selenium WebDriver");
			
			WebElement searchButton = driver.findElement(By.xpath("//*[@id=\"nav-search\"]/form/div[2]/div/input"));
			searchButton.click();
			
			List<WebElement> bookList = driver.findElements(By.cssSelector("#s-results-list-atf > li"));
			
			System.out.println("Number of books listed in this page: " + bookList.size());
			System.out.println();
			
			for (WebElement element : bookList) {
				WebElement title = element.findElement(By.tagName("h2"));
				System.out.println(title.getAttribute("innerText"));
				try {
					WebElement price = element.findElement(By.xpath(".//h3[text()='Paperback']/../../following-sibling::div[1]//span[contains(@class, 's-price')]"));
					System.out.println(price.getText());
				} catch (NoSuchElementException e) {
					System.out.println("No Paperback price");
				}
				System.out.println();
			}
		} finally {
			driver.quit();
		}
	}
}
