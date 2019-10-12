package com.qa.pages;

import java.util.List;

import com.qa.base.TestBase;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class SearchResultPage extends TestBase {
	
	@FindBy(xpath = "//input[@name='fs0' and @id='stopFilter_stops-0']//parent::div")
	WebElement selectNonStop;
	
	@FindBy(xpath = "//input[@id='return-date-1']")
	WebElement selectReturnDate;
	
	@FindBy(xpath = "//input[@data-test-id='listing-main']")
	WebElement resultSections;
	

	public SearchResultPage() {
		PageFactory.initElements(driver, this);
	}

	public void isResultStatsVisible() {
		String keys = Keys.chord(Keys.CONTROL, "a");
		selectReturnDate.sendKeys(keys + Keys.DELETE);
		selectReturnDate.clear();
		selectReturnDate.sendKeys("01/01/2020");
		
		
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(selectNonStop));
		click(selectNonStop);
		
		
		WebElement element= selectNonStop; 
		JavascriptExecutor ex=(JavascriptExecutor)driver;
		ex.executeScript("arguments[0].click()", element);
		sleep(5);
//
		
//		List<WebElement> list = operBy;
//		for (int i=0; i<list.size(); i++) {
//			WebElement local_element = list.get(i);
//			
//			String header = local_element.getText();
//			System.out.println("Programming courses ----> " +(i+1) +". " + header);
//		}
		
	}

}
