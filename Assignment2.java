/*
 * This is the first half of the Expedia web automation project.
Use Selenium to
- Go to https://www.expedia.com/
- Below is the default search area in the Expedia home page if you have not
been there before.
Select the Flights tab, the search area is updated
- Provide the following input values
- Flying from: San Francisco, CA
- Flying to: New York, NY
- Departing: 06/20/2016
- Returning: 06/24/2016
- Adults: 3
- Children: 2
- Child 1 age: 5
- Child 2 age: 10
- Check the “Add a car” checkbox
- Click the Search button and make sure that the search result page is properly
displayed
Check the status line to make sure that there are 5 Travelers.
 */

package edu.ucsc.webapptest;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment2 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.expedia.com/");
		
		try {
			WebElement flightButton = driver.findElement(By.id("tab-flight-tab"));
			flightButton.click();
			WebElement flyingFrom = driver.findElement(By.id("flight-origin"));
			flyingFrom.clear();
			flyingFrom.sendKeys("San Francisco, CA");
			
			WebElement flyingTo = driver.findElement(By.id("flight-destination"));
			flyingTo.clear();
			flyingTo.sendKeys("New York, NY");
			
			WebElement departing = driver.findElement(By.id("flight-departing"));
			departing.clear();
			departing.sendKeys("07/20/2016");
			
			WebElement returning = driver.findElement(By.id("flight-returning"));
			returning.clear();
			returning.sendKeys("07/24/2016");
			
			WebElement adults = driver.findElement(By.id("flight-adults"));
			Select adultsSelect = new Select(adults);
			adultsSelect.selectByValue("3");
			
			WebElement children = driver.findElement(By.id("flight-children"));
			Select childrenSelect = new Select(children);
			childrenSelect.selectByValue("2");
			
			WebElement child1Age = driver.findElement(By.id("flight-age-select-1"));
			Select child1AgeSelect = new Select(child1Age);
			child1AgeSelect.selectByValue("5");
			
			WebElement child2Age = driver.findElement(By.id("flight-age-select-2"));
			Select child2AgeSelect = new Select(child2Age);
			child2AgeSelect.selectByValue("10");
			
			WebElement addCar = driver.findElement(By.id("flight-add-car-checkbox"));
			if (!addCar.isSelected()) {
				addCar.click();
			}
			
			WebElement searchButton = driver.findElement(By.id("search-button"));
			searchButton.click();
			
			WebElement status = driver.findElement(By.cssSelector("#wizardSearch .secondary-playback"));
			System.out.println(status.getText());
			
			WebDriverWait wait = new WebDriverWait(driver, 60);
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("acol-interstitial")));
		
		} 
		
		finally {
			driver.quit();
		}
	}
}
