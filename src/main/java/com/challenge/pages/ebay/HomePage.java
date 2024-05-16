package com.challenge.pages.ebay;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.challenge.pages.*;

public class HomePage extends BasePage{

	By inputSearch = By.id("#gh-ac");
	By buttonSearch = By.id("gh-btn");
	By listProducts = By.id("srp-river-results > ul");
	
	public HomePage(WebDriver driver) {
		super(driver);
	}

	
	public void searchProduct() {
		
	}
	
	
}
