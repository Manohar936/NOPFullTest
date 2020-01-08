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
	@Test
	public void clickOnCatalogPageTest() throws Exception{
		//catalogPage.clickOnCatalogMenu();
		catalogPage.clickOnCategoriesMenu();
//		catalogPage.clickOnManufacturesMenu();
//		catalogPage.clickOnProductReviewMenu();
//		catalogPage.clickOnProductTagMenu();
//		catalogPage.clickOnAttributeMenu();
//		catalogPage.clickOnProductAttributeMenu();
//		catalogPage.clickOnSpecificationAttributeMenu();
//		catalogPage.clickOnCheckOutMenu();
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
		
	}
	
	

}
