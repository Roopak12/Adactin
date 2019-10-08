Feature: Adactin Project smoke test automation scripts

Scenario: To verify valid login details

Given User should be in Adactin application
Then User should see the Adactin logo displayed in the header
When User enter the name in the username field
And User enter the password in the password field
And User click on the login button
And user wait for 4 seconds for page load
Then User should see the Search Hotel title in the search page field

Scenario: To verify the checkout date field
Given After entering the username and password as per test data in LoginPage
Then  User should see the Search Hotel title in the search page field 
When User should set location in location field
When User should set Hotel in hotels field
And User should set room type in roomtype field
And User enter check-in-date later than check-out-date in respective fields
Then verify that check-in-date is not later than check-out-date