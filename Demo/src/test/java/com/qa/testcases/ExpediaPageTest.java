package com.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.*;

import com.qa.base.TestBase;
import com.qa.pages.ExpediaPage;
import com.qa.pages.SearchResultPage;

public class ExpediaPageTest extends TestBase {
	
	ExpediaPage expediaPage;
	SearchResultPage searchResultPage;
	
	public ExpediaPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		expediaPage = new ExpediaPage();
	}

	
	@Test(priority=1)
	public void verifyNonStopFlyights() {
		expediaPage.startPage();
		searchResultPage.isResultStatsVisible();
		sleep(2);
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
