package com.uptake.codingtest.pages;

import com.uptake.codingtest.base.TestBase;

public class HomePage extends TestBase {

	String homepageurl = "https://www.uptake.com/";
	String productsurl = "https://www.uptake.com/products";
	String industriesurl = "https://www.uptake.com/industries";

	// Actions:
	public String navigateToProductsPage() {
		driver.navigate().to(productsurl);
		return driver.getTitle();
	}

	public String navigateToIndustriesPage() {
		driver.navigate().to(industriesurl);
		return driver.getTitle();
	}

	public String navigateToHomePage() {
		driver.navigate().to(homepageurl);
		return driver.getTitle();
	}
}
