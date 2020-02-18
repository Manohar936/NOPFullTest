package com.qa.nop.testpages;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.nop.base.TestBase;
import com.qa.nop.pages.CatalogPage;
import com.qa.nop.pages.DashBoardPage;
import com.qa.nop.pages.HomePage;

public class CatalogTestPage extends TestBase {
	
	HomePage homepage;
	DashBoardPage dashboardPage;
	CatalogPage catalogPage;
	
		public CatalogTestPage(){
		super();
		}
	
	@BeforeMethod
	public void setUp(){
		intialization();
		homepage = new HomePage();
		dashboardPage = new DashBoardPage();
		catalogPage = new CatalogPage();
		dashboardPage = homepage.login(prop.getProperty("email"), prop.getProperty("password"));
	}
	@Test(priority=1)
	public void clickOnCatalogPageTest() throws Exception{
		catalogPage.clickOnCatalogMenu();
		
	}
//	@Test(priority=2)
//	public void clickOnCategoriesMenuPageTest() throws Exception{
//		catalogPage.clickOnCategoriesMenu();
//	}
//	
//	@Test(priority=3)
//	public void clickOnManufactureMenuPageTest() throws Exception{
//		catalogPage.clickOnManufacturesMenu();
//	}
//	
//	@Test(priority=4)
//	public void clickOnProductReviewPageTest() throws Exception{
//		catalogPage.clickOnProductReviewMenu();
//	}
//	
//	@Test(priority=5)
//	public void clickOnProductTagPageTest() throws Exception{
//		catalogPage.clickOnProductTagMenu();
//	}
//	
//	@Test(priority=6)
//	public void clickOnAttributePageTest() throws Exception{
//		catalogPage.clickOnAttributeMenu();
//		
//	}
//	
//	@Test(priority=7)
//	public void clickOnSpecificationAttributePageTest() throws Exception{
//		catalogPage.clickOnSpecificationAttributeMenu();
//		
//	}
//	@Test(priority=8)
//	public void clickOnCheckOutPageTest() throws Exception{
//		catalogPage.clickOnCheckOutMenu();
//		
//	}
//	@AfterMethod
//	public void tearDown(){
//		driver.quit();
//		
//	}
	
	

}
