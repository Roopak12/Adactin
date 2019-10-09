package com.cucumber.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.cucumber.baseclass.BaseClass;
import com.cucumber.runner.TestRunner;
import com.cucumber.utility.ConfigReader;
import com.cucumber.utility.PageObjectManager;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefiniton extends BaseClass {
	public static WebDriver driver=TestRunner.driver;
	public static PageObjectManager pg=new PageObjectManager(driver);
	  public ConfigReader cg=new ConfigReader(driver);
	  
	  @Given("^User should be in Facebook Applications$")
		public void user_should_be_in_Facebook_Applications() throws Throwable {
		   url("https://www.google.com");
		}
	  
	

	@Then("^User should see the facebook logo displayed in the header$")
	public void user_should_see_the_facebook_logo_displayed_in_the_header() throws Throwable {
		elementisDisplayed(pg.getlp().getFb_logo());
	  
	}

	@When("^User enter the Email address in the emailfield in Login Page$")
	public void user_enter_the_Email_address_in_the_emailfield_in_Login_Page() throws Throwable {
		sendkey(pg.getlp().getEmailField(), "Testemail@gmail.com");
	}

	@When("^User enter the password in the passwordField$")
	public void user_enter_the_password_in_the_passwordField() throws Throwable {
		sendkey(pg.getlp().getPasswordField(), "12345678");
	}

	@When("^User click on the Login Button$")
	public void user_click_on_the_Login_Button() throws Throwable {
		clickElement(pg.getlp().getLoginButton());
	  
	}

	@When("^User wait for (\\d+) seconds for page load$")
	public void user_wait_for_seconds_for_page_load(int sec) throws Throwable {
		waitforvisibilityofelment(cg.getWait());
	  
	}
	

	@Then("^User should see the Login into Facebook title$")
	public void user_should_see_the_Login_into_Facebook_title() throws Throwable {
		String actual=text(pg.getFb().getForgetPasswordTitle());
		Assert.assertEquals("Log in to Facebook", actual);
	}
//		@When("^User enter the'(.*)' in the emailfield in Login Page$")
//		public void user_enter_the_test_gmail_com_in_the_emailfield_in_Login_Page(String username) throws Throwable {
//			LoginPage l=new LoginPage(driver);
//			sendkey(l.getEmailField(), username);
//		}

//		@When("^User enter the '(.*)' in the passwordField$")
//		public void user_enter_the_in_the_passwordField(String Password) throws Throwable {
//			LoginPage l=new LoginPage(driver);
//			sendkey(l.getPasswordField(), Password);
//		}
//						
//
//@When("^User enter the '(.*)' in the emailfield in Login Page$")
//public void user_enter_the_testuser_in_the_emailfield_in_Login_Page(String Username) throws Throwable {
//		LoginPage lp=new LoginPage(driver);
//		sendkey(lp.getEmailField(), Username);
//		
	  
	}
//@When("^User wait for (\\d+) seconds for page loading$")
//public void user_wait_for_seconds_for_page_loading(int sec) throws Throwable {
//	Thread.sleep(sec*1000);

	



