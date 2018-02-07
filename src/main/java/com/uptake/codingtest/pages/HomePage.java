package com.uptake.codingtest.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.uptake.codingtest.base.TestBase;

public class HomePage extends TestBase {

	//Page Factory - OR
	@FindBy(css="[href='https://www.uptake.com/']")	
	WebElement home;
	@FindBy(xpath="//a[contains(text(),'Products')]")
	WebElement products;
	@FindBy(linkText="Industries")
	WebElement industries;
	

	//to intialize the page factory, create a constructor
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}	
	
	// Actions:
	public String navigateToProductsPage() {
		products.click();
		return driver.getTitle();
	}

	public String navigateToIndustriesPage() {
		industries.click();
		return driver.getTitle();
	}

	public String navigateToHomePage() {
		home.click();
		return driver.getTitle();
	}
}
