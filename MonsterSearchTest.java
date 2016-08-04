/*
Follow the Amazon search example introduced in the class, use the Page Object
Model to search “selenium” jobs in the “San Jose, CA” area at 
http://www.monster.com/
Test the job title, company name and the location of the first returned result.
****Every time when you run your test code, you’d better do the search first, 
copy the data from the first returned result to your test code, and run your 
test code.
 */

package edu.ucsc.webapptest;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MonsterSearchTest {
	private WebDriver driver;
	
	private String firstJobTitle = "Adobe CQ/AEM Technical lead";
	private String firstJobCompany = "Smartwe Inc";
	private String firstJobLocation = "Sunnyvale ,CA";
	
	@Before
	public void setUp() {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
	}
	
	@Test
	public void testBookSearch() {
		MonsterHomePage home = new MonsterHomePage(driver);
		home.get();
		MonsterSearchResult result = home.getSearch().search("Selenium", "San Jose, CA");
		assertEquals(firstJobTitle, result.getFirstJobTitle());
		assertEquals(firstJobCompany, result.getFirstJobCompany());
		assertEquals(firstJobLocation, result.getFirstJobLocation());
	}
	
	@After
	public void tearDown() {
		driver.quit();
	}

}
