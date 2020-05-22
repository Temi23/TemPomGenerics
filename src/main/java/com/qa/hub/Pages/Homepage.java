package com.qa.hub.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Homepage extends BasePage {

	public Homepage(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
		
	}

	//page locator
	By header = By.xpath("//i18n-string[@data-key='app.header.title']");
	
	//page action
	public String getHomePageTitle() {
		return driver.getTitle();
		
	}
	public String getHomePageHeader() {
		return doGetText(header);
	}
	
}
