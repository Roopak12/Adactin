package com.cucumber.stepdefinition;

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
	  public static ConfigReader cg=new ConfigReader(driver);
	  
	  @Given("^User should be in Adactin application$")
	  public void user_should_be_in_Adactin_application() throws Throwable {
		 getUrlFrom("https://adactin.com/HotelApp/index.php");
	  }

	  @Then("^User should see the Adactin logo displayed in the header$")
	  public void user_should_see_the_Adactin_logo_displayed_in_the_header() throws Throwable {
      elementisDisplayed(pg.getlp().getAdactinLogo());
	  }

	  @When("^User enter the name in the username field$")
	  public void user_enter_the_name_in_the_username_field() throws Throwable {
	  sendkey(pg.getlp().getUserName(),"testcase12");
	  }

	  @When("^User enter the password in the password field$")
	  public void user_enter_the_password_in_the_password_field() throws Throwable {
	  sendkey(pg.getlp().getPassword(),"Rpk$0604");
	  }

	  @When("^User click on the login button$")
	  public void user_click_on_the_login_button() throws Throwable {
	  clickkk(pg.getlp().getLoginButton());
	  }

	  @When("^user wait for (\\d+) seconds for page load$")
	  public void user_wait_for_seconds_for_page_load(int sec) throws Throwable {
	  Thread.sleep(sec*1000);
	  }

	  @Then("^User should see the Search Hotel title in the search page field$")
	  public void user_should_see_the_Search_Hotel_title_in_the_search_page_field() throws Throwable {
	  elementisDisplayed(pg.getFb().getSearchLogo());
	  }

	  @When("^User should set location in location field$")
	  public void user_should_set_location_in_location_field() throws Throwable {
      dropdown(pg.getFb().getLocation_field(), "index", "1");
	  }

	  @When("^User should set Hotel in hotels field$")
	  public void user_should_set_Hotel_in_hotels_field() throws Throwable {
	  dropdown(pg.getFb().getHotel_field(), "index", "1");
	  }

	  @When("^User should set room type in roomtype field$")
	  public void user_should_set_room_type_in_roomtype_field() throws Throwable {
	  dropdown(pg.getFb().getRoomtype_field(), "index", "1");
	  }

	  @When("^User enter check-in-date later than check-out-date in respective fields$")
	  public void user_enter_check_in_date_later_than_check_out_date_in_respective_fields() throws Throwable {
      sendkey(pg.getFb().getCheck_in_field(), "22/10/2019");
	  }

	  @Then("^verify that check-in-date is not later than check-out-date$")
	  public void verify_that_check_in_date_is_not_later_than_check_out_date() throws Throwable {
	  sendkey(pg.getFb().getCheck_out_field(),"20/10/2019");
	  }
	  @When("^User should set no\\.of rooms in rooms field$")
	  public void user_should_set_no_of_rooms_in_rooms_field() throws Throwable {
	  dropdown(pg.getFb().getNumberOf_Rooms(), "index", "1");
	  }

@Then("^User click on the search button$")
public void user_click_on_the_search_button() throws Throwable {
clickkk(pg.getFb().getsearchField());
}
@When("^User should set location in the location field$")
public void user_should_set_location_in_the_location_field() throws Throwable {
	dropdown(pg.getFb().getLocation_field(), "index", "1");
}

@When("^User should set Hotel in hotel field$")
public void user_should_set_Hotel_in_hotel_field() throws Throwable {
	dropdown(pg.getFb().getHotel_field(), "index", "1");
}

@When("^User should set room type in the roomtype field$")
public void user_should_set_room_type_in_the_roomtype_field() throws Throwable {
	 dropdown(pg.getFb().getRoomtype_field(), "index", "1");
}

@When("^User should set no\\.of rooms in the rooms field$")
public void user_should_set_no_of_rooms_in_the_rooms_field() throws Throwable {
	dropdown(pg.getFb().getNumberOf_Rooms(), "index", "1");
}
@When("^User enter check-in-date later the than check-out-date in respective fields$")
public void user_enter_check_in_date_later_the_than_check_out_date_in_respective_fields() throws Throwable {
	 sendkey(pg.getFb().getCheck_in_field(), "10/10/2019");
}

@When("^verify that check-in-date is not later than the check-out-date$")
public void verify_that_check_in_date_is_not_later_than_the_check_out_date() throws Throwable {
	 sendkey(pg.getFb().getCheck_out_field(), "12/10/2019");
}
@When("^When User should select location in location field$")
public void when_User_should_select_location_in_location_field() throws Throwable {
	dropdown(pg.getFb().getLocation_field(), "index", "1");
}

@When("^User should select Hotel in hotels field$")
public void user_should_select_Hotel_in_hotels_field() throws Throwable {
	dropdown(pg.getFb().getHotel_field(), "index", "1");
}

@When("^User should select room type in roomtype field$")
public void user_should_select_room_type_in_roomtype_field() throws Throwable {
	 dropdown(pg.getFb().getRoomtype_field(), "index", "1");
}

@When("^User should select no\\.of rooms in rooms field$")
public void user_should_select_no_of_rooms_in_rooms_field() throws Throwable {
	dropdown(pg.getFb().getNumberOf_Rooms(), "index", "1");
}

@When("^User should enter check-in-date field$")
public void user_should_enter_check_in_date_field() throws Throwable {
	sendkey(pg.getFb().getCheck_in_field(), "15/10/2019");
}

@When("^User should enter check-out-date field$")
public void user_should_enter_check_out_date_field() throws Throwable {
	sendkey(pg.getFb().getCheck_out_field(), "16/10/2019");
}

@When("^User should select the no\\.of\\.adults field$")
public void user_should_select_the_no_of_adults_field() throws Throwable {
dropdown(pg.getFb().getAdult_perroom_field(), "index", "1");
}

@When("^User should select the no\\.of\\.children field$")
public void user_should_select_the_no_of_children_field() throws Throwable {
	dropdown(pg.getFb().getChild_perroom_field(), "index", "0");
}

@When("^User click on search button$")
public void user_click_on_search_button() throws Throwable {
clickkk(pg.getFb().getsearchField());
}



}



	  

	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  //	  @Given("^User should be in Facebook Applications$")
//		public void user_should_be_in_Facebook_Applications() throws Throwable {
//		   getUrlFrom("https://www.facebook.com");
//		}
//	  
//	
//
//	@Then("^User should see the facebook logo displayed in the header$")
//	public void user_should_see_the_facebook_logo_displayed_in_the_header() throws Throwable {
//		elementisDisplayed(pg.getlp().getFb_logo());
//	  
//	}
//
//	@When("^User enter the Email address in the emailfield in Login Page$")
//	public void user_enter_the_Email_address_in_the_emailfield_in_Login_Page() throws Throwable {
//		sendkey(pg.getlp().getEmailField(), "Testemail@gmail.com");
//	}
//
//	@When("^User enter the password in the passwordField$")
//	public void user_enter_the_password_in_the_passwordField() throws Throwable {
//		sendkey(pg.getlp().getPasswordField(), "12345678");
//	}
//
//	@When("^User click on the Login Button$")
//	public void user_click_on_the_Login_Button() throws Throwable {
//		clickElement(pg.getlp().getLoginButton());
//	  
//	}
//
//	@When("^User wait for (\\d+) seconds for page load$")
//	public void user_wait_for_seconds_for_page_load(int sec) throws Throwable {
//		waitforvisibilityofelment(cg.getWait());
//	  
//	}
//	
//
//	@Then("^User should see the Login into Facebook title$")
//	public void user_should_see_the_Login_into_Facebook_title() throws Throwable {
//		String actual=text(pg.getFb().getForgetPasswordTitle());
//		Assert.assertEquals("Log in to Facebook", actual);
//	}
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
	  
	
//@When("^User wait for (\\d+) seconds for page loading$")
//public void user_wait_for_seconds_for_page_loading(int sec) throws Throwable {
//	Thread.sleep(sec*1000);

	



