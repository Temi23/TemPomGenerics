package com.qa.hub.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.qa.hub.Pages.Pages;

public class BaseTest {
	
	
	public WebDriver driver;
	public WebDriverWait wait;
	public Pages pages;
	
	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "//C:\\Users\\Temi\\Downloads\\chromedriver.exe");
	driver = new ChromeDriver();
	
	wait = new WebDriverWait(driver,15);
	driver.manage().window().fullscreen();
	driver.get("https://app.hubspot.com/login");
	try {
		Thread.sleep(6000);
	} catch (InterruptedException e) {
			e.printStackTrace();
	}
	//create the obj of page class:
	
	pages = new Pages(driver,wait);
	}
	
	@AfterMethod
	public void tearDown() {
	driver.quit();
	}
}
