package bmicalculate.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


import static org.junit.Assert.*;

public class BmiCalculatestepDefs {
	private WebDriver driver; 
	private BmiPage page;
	
	@Before
	public void setUp() {
		driver = new FirefoxDriver();
	}
	
	@After 
	public void tearDown() {
		driver.quit();
	}
	
	@Given("the user is on the BMI Calculate page")
	public void theUserIsBmiPage() {
		page = new BmiPage(driver);	
	}
	
	@When ("he enters \"([^\"]*)\" as height")
	public void heEntersHeight(String height) {
		page.setHeight(height);
	}
	@And("he enters \"([^\"]*)\" as weight")
	public void heEntersWeight(String weight) {
		page.setWeight(weight);
	}
	
	@And("he clicks the Calculate button")
	public void heClicksCalculateButton() {
		page.clickCalculate();
	}
	
	@Then("ensure the BMI category is \"([^\"]*)\"")
	public void ensureTheBmiCategory(String category) {
		assertEquals(category, page.getBmiCategory());
	}
}
	

