package com.challenge;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.challenge.pages.LoginPage;
import com.challenge.pages.MailPage;

import java.time.Duration;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class TestLogin{
	
	ChromeDriver driver;
	
	@BeforeClass(alwaysRun = true)
	public void beforeClass() {
		this.driver = new ChromeDriver();
		this.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		this.driver.manage().window().setSize(new Dimension(1440, 900));
	}
	
	@Test(groups = { "success"})
	public void testSucces() {
		LoginPage lp = new LoginPage(driver);
		lp.login();
		MailPage mp = new MailPage(driver);
		String complete = mp.checkImagesLoginComplete();
		String width = mp.checkImagesLoginNaturalWidth();
		Assert.assertEquals(complete, "true");
		Assert.assertEquals(width, "32");
	}

	@Test(groups = {"fail"} )
	public void testFail() {
		LoginPage lp = new LoginPage(driver);
		lp.bad_login();
		String text = lp.verifyText();
		Assert.assertNotNull(text);
	}

	@AfterClass(alwaysRun = true)
	public void afterClass() {
		driver.close();
	}
	
}

	