$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("FaceBook.feature");
formatter.feature({
  "line": 2,
  "name": "Facebook Application smoke test automation scripts",
  "description": "",
  "id": "facebook-application-smoke-test-automation-scripts",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Facebook"
    }
  ]
});
formatter.before({
  "duration": 343000,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "Launch the application",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "User should be in Facebook Applications",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefiniton.user_should_be_in_Facebook_Applications()"
});
formatter.result({
  "duration": 19294358800,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "Verify the login functionality of the application with invalid credentials",
  "description": "",
  "id": "facebook-application-smoke-test-automation-scripts;verify-the-login-functionality-of-the-application-with-invalid-credentials",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 10,
  "name": "User should see the facebook logo displayed in the header",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "User enter the Email address in the emailfield in Login Page",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "User enter the password in the passwordField",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "User click on the Login Button",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "User wait for 3 seconds for page load",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "User should see the Login into Facebook title",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefiniton.user_should_see_the_facebook_logo_displayed_in_the_header()"
});
formatter.result({
  "duration": 1450433000,
  "status": "passed"
});
formatter.match({
  "location": "StepDefiniton.user_enter_the_Email_address_in_the_emailfield_in_Login_Page()"
});
formatter.result({
  "duration": 1818013700,
  "status": "passed"
});
formatter.match({
  "location": "StepDefiniton.user_enter_the_password_in_the_passwordField()"
});
formatter.result({
  "duration": 640034400,
  "status": "passed"
});
formatter.match({
  "location": "StepDefiniton.user_click_on_the_Login_Button()"
});
formatter.result({
  "duration": 6466636700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "3",
      "offset": 14
    }
  ],
  "location": "StepDefiniton.user_wait_for_seconds_for_page_load(int)"
});
formatter.result({
  "duration": 3004631300,
  "status": "passed"
});
formatter.match({
  "location": "StepDefiniton.user_should_see_the_Login_into_Facebook_title()"
});
formatter.result({
  "duration": 317509400,
  "status": "passed"
});
formatter.after({
  "duration": 83400,
  "status": "passed"
});
});