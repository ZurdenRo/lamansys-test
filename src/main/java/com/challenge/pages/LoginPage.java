package com.challenge.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class LoginPage extends BasePage{

	private final static String URL = "https://accounts.google.com/";

	private final By tittle = By.cssSelector("#headingText > span");
	private final By input_email = By.cssSelector("#identifierId");
	private final By button_email = By.cssSelector("#identifierNext > div > button > div:nth-child(3)");
	private final By input_password = By.cssSelector("#password > div.aCsJod.oJeWuf > div > div.Xb9hP > input");
	private final By text_incorrect_password = By.cssSelector("div.njnYzb.NhPs4c.Jj6Lae > div:nth-child(2) > * > span");
	private final By button_password = By.cssSelector("#passwordNext > div > button > div:nth-child(3)");
			
	
	public LoginPage(ChromeDriver driver) {
		super(driver);
		goUrl(LoginPage.URL);
	}
	
	public void login() {
		this.visibilityOfElementLocated(this.tittle);
		this.write(this.input_email, "lamansys3@gmail.com");
		this.elementToBeClickable(this.button_email);
		this.ac_click(this.button_email);
		this.visibilityOfElementLocated(this.input_password);
		this.write(this.input_password, "Lamansys920");
		this.elementToBeClickable(this.button_password);
		this.ac_click(this.button_password);
	}
	
	public void bad_login(){
		this.visibilityOfElementLocated(this.tittle);
		this.write(this.input_email, "lamansys3@gmail.com");
		this.elementToBeClickable(this.button_email);
		this.ac_click(this.button_email);
		this.visibilityOfElementLocated(this.input_password);
		this.write(this.input_password, "BadPassword");
		this.ac_click(this.button_password);
	}
	
	public String verifyText() {
		return this.getText(this.text_incorrect_password);
	}
	
}

