package com.qa.hub.Test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.hub.Pages.LoginPage;


public class LoginPageTest extends BaseTest{
	
	@Test(priority=1)
	public void verifyLogingPageTitleTest() {
		String title = pages.getInstance(LoginPage.class).getLoginPageTitle();
		System.out.println("login page title is :" + title);
		Assert.assertEquals(title, "HubSpot Login");
	}
	
	@Test(priority=2)
	public void loginTest() {
		pages.getInstance(LoginPage.class).doLogin("Temijr@yahoo.com.com", "@Test0987");
	}

}
