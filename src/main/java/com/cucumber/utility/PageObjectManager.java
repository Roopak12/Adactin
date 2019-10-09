package com.cucumber.utility;

import org.openqa.selenium.WebDriver;

import com.cucumber.pom.ForgetPasswordPage;
import com.cucumber.pom.LoginPage;

public class PageObjectManager {
public WebDriver driver;
private ForgetPasswordPage fb;
private LoginPage lp;
public  ForgetPasswordPage getFb() {
	if(fb==null) {
		fb=new ForgetPasswordPage(driver);
	}
	return fb;
}
public LoginPage getlp() {
	if (lp==null) {
	lp=new LoginPage(driver);	
	}
	return lp;
}
public PageObjectManager(WebDriver ldriver) {
	this.driver=ldriver;
}
}
