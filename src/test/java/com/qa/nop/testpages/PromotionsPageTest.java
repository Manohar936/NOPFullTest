package com.qa.nop.testpages;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.nop.base.TestBase;
import com.qa.nop.pages.DashBoardPage;
import com.qa.nop.pages.HomePage;
import com.qa.nop.pages.PromotionsPage;

public class PromotionsPageTest extends TestBase {
	HomePage homepage;
	DashBoardPage dashboardpage;
	PromotionsPage promotionpage;
	
	public PromotionsPageTest() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@BeforeMethod
	public void setUp(){
		intialization();
		homepage = new HomePage();
		dashboardpage = new DashBoardPage();
		promotionpage= new PromotionsPage();
		dashboardpage= homepage.login(prop.getProperty("email"), prop.getProperty("password"));
		
	}
	
	@Test(priority=1)
	public void clickOnPromotionsMenuTestPage() throws Exception{
		promotionpage.clickOnPromotionsMenuPage();
		
	}
	
	@Test(priority=2)
	public void clickOnAffiliatesMenuTestPage() throws Exception{
		promotionpage.clickOnAffiliatesMenuPage();
	}

	@Test(priority=3)
	public void clickOnNewLetterMenuTestPage() throws Exception{
		promotionpage.clickOnNewLetterMenuPage();
		
	}
	@Test(priority=4)
	public void clickOnCampaignsMenuTestPage() throws Exception{
		promotionpage.clickOnCampaignsMenuPage();
	}

//	@AfterMethod
//	public void tearDown(){
//		driver.quit();
//		
//	}
	

}
