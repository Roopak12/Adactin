package com.cucumber.adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Adactin {
	public WebDriver driver;
	public Login_Adactin(WebDriver locdriver) {
this.driver=locdriver;
PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//img[@alt=\"AdactIn Group\"]")
	private WebElement adactinLogo;

	public WebElement getAdactinLogo() {
		return adactinLogo;
	}

	public WebElement getUserName() {
		return userName;
	}

	public WebElement getPassword() {
		return password;
	}
	@FindBy(id = "username")
	private WebElement userName;
	
	@FindBy(id = "password")
	private WebElement password;
	
	@FindBy(id = "login")
	private WebElement loginButton;
	public WebElement getLoginButton() {
		return loginButton;
	}

	}
	


