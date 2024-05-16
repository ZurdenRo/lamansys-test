package com.challenge.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class MailPage extends BasePage{

	private By images_icon = By.cssSelector("header > div:nth-child(2) > * > div > div.gb_b.gb_x.gb_3f.gb_K > div > a > img"); 
	
	public MailPage(ChromeDriver driver){
		super(driver);
	}
	
	public String checkImagesLoginComplete() {
		this.visibilityOfElementLocated(this.images_icon);
		return this.getAttribute(this.images_icon, "complete");
	}
	
	public String checkImagesLoginNaturalWidth() {
		this.visibilityOfElementLocated(this.images_icon);
		return this.getAttribute(this.images_icon, "naturalWidth");
	}
	
	
}
