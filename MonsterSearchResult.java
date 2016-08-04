package edu.ucsc.webapptest;

import static org.junit.Assert.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.LoadableComponent;

public class MonsterSearchResult extends LoadableComponent<MonsterSearchResult> {
	private WebDriver driver;
	private String title = "Monster.com";
	
	@FindBy(how=How.ID, using="resultsWrapper")
	private WebElement resultList;
	
	public MonsterSearchResult(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@Override
	protected void isLoaded() throws Error {
		assertTrue("Monster result page cannot be loaded", driver.getTitle().endsWith(title));		
	}

	@Override
	protected void load() {
	}
	
	public WebElement getFirstEntry() {
		WebElement first = resultList.findElement(By.cssSelector(".js_result_container:not(.featured-ad) > .js_result_row"));
		return first;
	}
	
	public String getFirstJobTitle() {
		return getFirstEntry().findElement(By.xpath("./*[@class='jobTitle']")).getText();
	}
	public String getFirstJobCompany() {
		return getFirstEntry().findElement(By.xpath("./*[@class='company']")).getText();
	}
	public String getFirstJobLocation() {
		return getFirstEntry().findElement(By.xpath("./*[@class='location']")).getText();
	}
}
