package com.cucumber.utility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ConfigReader {
	public static Properties prop = new Properties();
public WebDriver driver;
	public ConfigReader() throws Exception {
		try {
			File f = new File(System.getProperty("user.dir")
					+ "\\src\\test\\resource\\com\\cucumber\\property\\Configuration.property");
			FileInputStream fis = new FileInputStream(f);
			prop.load(fis);
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("File not valid");

		}
	}

	public ConfigReader(WebDriver lodriver) {
		this.driver= lodriver;
	}

	public String getBrowser() throws Exception {
		try {
			String browser = prop.getProperty("BrowserName");
			return browser;
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("Browser name is not valid");
		}
	}

	public String getUrl() throws Exception {
		try {
			String urL = prop.getProperty("Url");
			return urL;
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("not a valid url");
		}
	}

	public WebElement getWait() throws Exception {
		try {
			Object wait = prop.getProperty("Implicit wait");
			return (WebElement) wait;
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception();
		}
	}

}
