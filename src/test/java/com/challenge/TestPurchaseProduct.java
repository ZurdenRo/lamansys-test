package com.challenge;

import java.time.Duration;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.challenge.pages.ebay.HomePage;

public class TestPurchaseProduct {

	ChromeDriver driver;
	
	@BeforeClass(alwaysRun = true)
	public void beforeClass() {
		this.driver = new ChromeDriver();
		this.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		this.driver.manage().window().setSize(new Dimension(1440, 900));
	}
	
	@Test(groups = "purchase")
	public void testGetPrice() {
		HomePage hp = new HomePage(driver);
		hp.searchProduct();
		String price = hp.getPriceFirstElement();
		Assert.assertNotEquals(price, "");
		Assert.assertTrue(price.contains("USD"));
	}
	
	@AfterClass(alwaysRun = true)
	public void afterClass() {
		driver.close();
	}
	
}
