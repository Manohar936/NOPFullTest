package com.qa.nop.testpages;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.nop.base.TestBase;
import com.qa.nop.pages.HomePage;

public class HomepageTest  extends TestBase{
	HomePage homePage;
	
	public HomepageTest(){
		super();
	}
	
	@BeforeMethod
	public void setUp(){
		intialization();
		homePage = new HomePage();
	}
	
	@Test
	
public void validateHomePageTitleTest(){
		String title = homePage.validateLoginPageTitle();
		Assert.assertEquals(title, "Your store. Login");
	}
	
	@Test
	public void loginBtnTest(){
		homePage.login(prop.getProperty("email"), prop.getProperty("password"));
		
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
		
	}
	
}
