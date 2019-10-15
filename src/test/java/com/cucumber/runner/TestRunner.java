package com.cucumber.runner;

import java.util.Properties;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.cucumber.baseclass.BaseClass;
import com.cucumber.utility.ConfigReader;

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
tags = {"@Adactin","~@Ignore"},
dryRun=false, strict = true, monochrome = true
)

public class TestRunner {
	public static WebDriver driver;
	public static Properties prop = new Properties();
	@BeforeClass
	public static void driverInitialization() throws Exception {
	ConfigReader cg =new ConfigReader();
		driver=BaseClass.getDriver("chrome");
	}
//		@AfterClass
//		public static void driverQuit() {
//        driver.quit();
//		}
}
	
	


