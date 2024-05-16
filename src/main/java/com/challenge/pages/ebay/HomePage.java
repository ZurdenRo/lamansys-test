package com.challenge.pages.ebay;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.challenge.pages.BasePage;

public class HomePage extends BasePage{


	By inputSearch = By.id("gh-ac");
	By buttonSearch = By.id("gh-btn");
	By listProducts = By.cssSelector("#srp-river-results > ul > li:nth-child(2)");
	By firstProduct = By.cssSelector("* div.s-item__info.clearfix > div:nth-child(3) > div.s-item__details-section--primary > div:nth-child(1) > span");
	
	public HomePage(ChromeDriver driver) {
		super(driver);	
		this.goUrl("https://www.ebay.com/");
	}
	
	public void searchProduct() {
		this.visibilityOfElementLocated(this.inputSearch);
		this.write(this.inputSearch, "Electric Guitar");
		this.ac_click(this.buttonSearch);
	}
	
	public String getPriceFirstElement() {
		this.visibilityOfElementLocated(this.listProducts);
		WebElement first = this.getInnerElement(this.listProducts, this.firstProduct);
		return first.getAttribute("innerHTML");
	}
	
}
