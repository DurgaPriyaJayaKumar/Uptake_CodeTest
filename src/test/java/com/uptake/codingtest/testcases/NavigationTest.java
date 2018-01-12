package com.uptake.codingtest.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.uptake.codingtest.base.TestBase;
import com.uptake.codingtest.pages.HomePage;

public class NavigationTest extends TestBase {

	public HomePage homePage;

	@BeforeMethod
	public void setUp() {
		try {
			initialization();
			homePage = new HomePage(); // creating an object
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void navigateToProductsTest() {
		String title1 = homePage.navigateToProductsPage();
		Assert.assertEquals(title1, "Predictive Analytics Solutions for Global Industry | Uptake");
		String title2 = homePage.navigateToHomePage();
		Assert.assertEquals(title2, "Industrial Analytics for Global Industry | Uptake");
	}

	@Test
	public void navigateToIndustriesTest() {
		String title3 = homePage.navigateToIndustriesPage();
		Assert.assertEquals(title3, "Industrial Analytics for the Connected World | Uptake");
		String title4 = homePage.navigateToHomePage();
		Assert.assertEquals(title4, "Industrial Analytics for Global Industry | Uptake");
	}

	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}

}
