package com.qa.nop.testpages;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.nop.base.TestBase;
import com.qa.nop.pages.DashBoardPage;
import com.qa.nop.pages.HomePage;

public class DashBoardPageTest  extends TestBase{
	DashBoardPage dashboardPage;
	HomePage homePage;
	
	public DashBoardPageTest(){
		super();
	}
	
	@BeforeMethod()
	public void setUp(){
		intialization();
		homePage = new HomePage();
		dashboardPage = new DashBoardPage();
	dashboardPage =	homePage.login(prop.getProperty("email"), prop.getProperty("password"));
		
	}
	
	@Test()
	public void clickHappyBlockTest() throws Exception{
		dashboardPage.clickHappyBlock();
		Thread.sleep(2000);
		String title = driver.getTitle();
		Assert.assertEquals(title, "Copyright removal key - nopCommerce");
		
	}
	@Test()
	public void clickServiceBlockTest() throws Exception{
		dashboardPage.clickServiceBlock();
		Thread.sleep(2000);
		String title = driver.getTitle();
		Assert.assertEquals(title, "Premium Support Services - nopCommerce");
		
	}
	@Test()
	public void clicHostingBlockTest() throws InterruptedException{
		dashboardPage.clickHostingBlock();
		Thread.sleep(2000);
		String title = driver.getTitle();
		Assert.assertEquals(title, "Premium nopCommerce Hosting on the Everleap ASP.NET Cloud");
		
		
	}
	@AfterMethod()
	public void tearDown(){
		driver.quit();
		
	}

}
