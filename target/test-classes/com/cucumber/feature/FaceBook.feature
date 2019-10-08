@Facebook
Feature: Facebook Application smoke test automation scripts

Background: Launch the application
Given User should be in Facebook Applications


Scenario: Verify the login functionality of the application with invalid credentials

Then User should see the facebook logo displayed in the header
When User enter the Email address in the emailfield in Login Page
And User enter the password in the passwordField
And User click on the Login Button
And User wait for 3 seconds for page load
Then User should see the Login into Facebook title 
