package com.challenge.pages;
import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BasePage {

	private WebDriver driver;
	private WebDriverWait wait;
	
	public BasePage(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(30L));
	}
	
	protected void goUrl(String url) {
		this.driver.get(url);
	}
	
	private WebElement getElement(By path) {
		return this.driver.findElement(path);
	}
	
	protected WebElement getInnerElement(By outsideElement, By innerElement) {
		return this.driver.findElement(outsideElement).findElement(innerElement);
	}
	
	protected void click(By path) {
		getElement(path).click();
	}
	
	protected void ac_click(By path) {
		Actions actions = new Actions(this.driver);
		actions.moveToElement(getElement(path)).click().build().perform();
	}
	
	protected void write(By path, String txt) {
		getElement(path).sendKeys(txt);
	}
	
	protected String getText(By path) {
		return this.driver.findElement(path).getAttribute("innerText");
	}
	
	protected String getAttribute(By path, String attribute) {
		return this.driver.findElement(path).getAttribute(attribute);
	}
	
	protected void visibilityOfElementLocated(By locator) {
		this.wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
	
	protected void elementToBeClickable(By locator) {
		this.wait.until(ExpectedConditions.elementToBeClickable(locator));
	}
}
