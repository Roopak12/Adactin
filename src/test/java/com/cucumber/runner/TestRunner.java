package com.cucumber.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.cucumber.baseclass.BaseClass;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
//		plugin = {"pretty",
//				"html:src\\test\\resource\\com\\cucumber\\reports",
//				"json:src\\test\\resource\\com\\cucumber\\reports.json",
//				"junit:src\\test\\resource\\com\\cucumber\\reports.xml"},
		features = "src\\test\\java\\com\\cucumber\\feature",
glue="com.cucumber.stepdefinition",
//tags = {"@Facebook","~@Ignore"},
dryRun=false, strict = true, monochrome = true
)

public class TestRunner {
	public static WebDriver driver;
	@BeforeClass
	public static void driverInitialization() throws Exception {
		driver=BaseClass.getDriver("chrome");
	}
		@AfterClass
		public static void driverQuit() {
        driver.quit();
		}
}
	
	


