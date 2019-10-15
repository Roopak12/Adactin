package com.cucumber.utility;

import org.openqa.selenium.WebDriver;

import com.cucumber.adactin.Login_Adactin;
import com.cucumber.adactin.Search_Hotel;
import com.cucumber.pom.ForgetPasswordPage;
import com.cucumber.pom.LoginPage;

public class PageObjectManager {
public WebDriver driver;
private Search_Hotel sh;
private Login_Adactin lp;
public  Search_Hotel getFb() {
	if(sh==null) {
		sh=new Search_Hotel(driver);
	}
	return sh;
}
public Login_Adactin getlp() {
	if (lp==null) {
	lp=new Login_Adactin(driver);	
	}
	return lp;
}
public PageObjectManager(WebDriver locdriver) {
	this.driver=locdriver;
}
}
