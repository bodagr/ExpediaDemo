package com.qa.pages;

import java.util.List;

import com.qa.base.TestBase;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class SearchResultPage extends TestBase {
	
	@FindBy(xpath = "//span[@id = 'Nonstop-stop-flights-checkbox']/parent::label")
	WebElement selectNonStop;	
	

	public SearchResultPage() {
		PageFactory.initElements(driver, this);
	}

	public void isResultStatsVisible() {		
		
//		WebDriverWait wait = new WebDriverWait(driver, 5);
//		wait.until(ExpectedConditions.elementToBeClickable(selectNonStop));
		click(selectNonStop);
		
		List <WebElement> elements = driver.findElements(By.xpath("//div[@data-test-id='listing-main']//span[@data-test-id='duration']"));
		
		for (WebElement el : elements) {
			System.out.println(el.getText());
		}
		
	}

}
