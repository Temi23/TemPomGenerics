package com.qa.hub.Test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.hub.Pages.Homepage;
import com.qa.hub.Pages.LoginPage;

public class HomePageTest extends BaseTest {

	@Test(priority=1)
	public void homePageTitleTest() {
		pages.getInstance(LoginPage.class).doLogin("Temijr@yahoo.com", "@Test0987");
		 String title =pages.getInstance(Homepage.class).getHomePageTitle();
		 System.out.println("home page title is: "+ title);
		 Assert.assertEquals(title, "Account Setup | HubSpot");
	}
	
	@Test(priority=2)
	public void verifyHomePageHeaderTest() {
		pages.getInstance(LoginPage.class).doLogin("Temijr@yahoo.com", "@Test0987");
		String header = pages.getInstance(Homepage.class).getHomePageHeader();
		System.out.println("home page header is:" + header);
		Assert.assertEquals(header, "Thanks for choosing HubSpot");
	}
	
	
}
