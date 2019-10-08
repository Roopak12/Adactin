package com.cucumber.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public  WebDriver driver;
	public LoginPage(WebDriver ldriver) {
		this.driver=ldriver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath = "//i[contains(@class,'fb_logo')]")
	private WebElement fb_logo;
	public WebElement getFb_logo() {
		return fb_logo;
	}
	public WebElement getEmailField() {
		return emailField;
	}
	public WebElement getPasswordField() {
		return passwordField;
	}
	public WebElement getLoginButton() {
		return loginButton;
	}
	@FindBy(id="email")
	private WebElement emailField;
	@FindBy(id="pass")
	private WebElement passwordField;
	@FindBy(xpath = "//input[@value=\"Log In\"]")
	private WebElement loginButton;
	

	

}
