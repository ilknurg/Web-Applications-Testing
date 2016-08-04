/*
 *This is the second half of the Expedia web automation project
 *In the Expedia home page, after you click the Search button to submit your
query, you will be directed to the result page. But it takes a while for the result to
be fully loaded.
Wait until the result is fully loaded, and print out the departure time, arrival time
(need to indicate whether the arrival time is next day), and price for each result
entry
 */

package edu.ucsc.webapptest;
import java.util.concurrent.TimeUnit;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment3 {
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
			
//			Thread.sleep(5000);
			
			WebElement searchButton = driver.findElement(By.id("search-button"));
			searchButton.click();
			
			WebElement status = driver.findElement(By.cssSelector("#wizardSearch .secondary-playback"));
			System.out.println(status.getText());
			
			WebDriverWait wait = new WebDriverWait(driver, 60);
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("acol-interstitial")));
			
			List<WebElement> lis = driver.findElements(By.cssSelector("#flightModuleList > li"));
			
			for (WebElement li : lis) {
				System.out.println();
				System.out.println("Departure time: " + li.findElement(By.className("departure-time")).getText());
				System.out.print("Arrival time: " + li.findElement(By.className("arrival-time")).getText());
				try {
					li.findElement(By.className("next-day"));
					System.out.println(" (next day)");
				} catch (NoSuchElementException e) {
					System.out.println();
				}
				System.out.println("Price: " + 
						li.findElement(By.className("dollars")).getText() + 
						li.findElement(By.className("cents")).getText());
			}
		} finally {
			driver.quit();
		}
	}
}