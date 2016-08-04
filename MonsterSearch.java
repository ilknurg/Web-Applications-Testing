package edu.ucsc.webapptest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class MonsterSearch {
	private WebDriver driver;
	
	@FindBy(how=How.CSS, using="#quickJobSearch1 #q1")
	private WebElement search;
	
	@FindBy(how=How.CSS, using="#quickJobSearch1 #where1")
	private WebElement location;

	@FindBy(how=How.CSS, using="#quickJobSearch1 #doQuickSearch")
	private WebElement searchButton;
	
	public MonsterSearch(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public MonsterSearchResult search(String query, String where) {
		search.clear();
		search.sendKeys(query);
		location.clear();
		location.sendKeys(where);
		searchButton.click();
		return new MonsterSearchResult(driver);
	}
}
