package com.qa.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class ExpediaPage extends TestBase {
	
	
	@FindBy (xpath="//button[@id='tab-flight-tab-hp']")
	public WebElement flightsBtn;
	
	@FindBy (xpath="//input[@id='flight-origin-hp-flight']")
	public WebElement flyingFromInput;
	
	@FindBy (xpath="//input[@id='flight-destination-hp-flight']")
	public WebElement flyingToInput;
	
	@FindBy (xpath="//input[@id='flight-departing-hp-flight']")
	WebElement departingDateInput;
	
	@FindBy (xpath="//input[@id='flight-returning-hp-flight']")
	WebElement returningDateInput;
	
	@FindBy (xpath="(//button[@type='submit'])[11]")
	WebElement searchBtn;

	
	//initialize Page Object
	public ExpediaPage() {
		PageFactory.initElements(driver, this);		
	}
	
	public void getTitle() {
		String title = driver.getTitle();
		System.out.println(title);
	}
	
	public SearchResultPage startPage() {
		click(flightsBtn);
		flyingFromInput.sendKeys("San Francisco");
		sleep(1);
		flyingToInput.sendKeys("Las Vegas");
		
		departingDateInput.clear();
		departingDateInput.sendKeys("10/20/2019");
		sleep(1);
		returningDateInput.click();
		String keys = Keys.chord(Keys.CONTROL, "a");
		returningDateInput.sendKeys(keys + Keys.DELETE);
		sleep(1);
		returningDateInput.clear();
		returningDateInput.sendKeys("10/25/2019");
		click(flyingToInput);

		click(searchBtn);		
		return new SearchResultPage();
	}
	
	

}
