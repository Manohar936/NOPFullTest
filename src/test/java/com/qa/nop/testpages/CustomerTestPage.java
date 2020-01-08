package com.qa.nop.testpages;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.nop.base.TestBase;
import com.qa.nop.pages.CustomerPage;
import com.qa.nop.pages.DashBoardPage;
import com.qa.nop.pages.HomePage;

public class CustomerTestPage extends TestBase {
	DashBoardPage dashboardPage;
	HomePage homepage;
	CustomerPage customerPage;
	
	public CustomerTestPage(){
		super();	
	}
	
	@BeforeMethod
	public void setUp(){
		intialization();
		homepage = new HomePage();
		dashboardPage = new DashBoardPage();
		customerPage = new CustomerPage();
		dashboardPage=homepage.login(prop.getProperty("email"),prop.getProperty("password"));	
	}
	
	@Test(priority=1)
	public void clickOnCustomersTestPage() throws Exception {
		customerPage.clickOnCustomersMenu();
		
	}
	@Test(priority=2)
	public void clickOnLogRequestTestPage() throws Exception{
		customerPage.clickOnLogRequest();
	}
	@Test(priority=3)
	public void clickOnCustomerRolesTestPage() throws Exception{
		customerPage.clickOnCustomerRolesPage();
	}
	@Test(priority=4)
	public void clickOnVendorsTestPage() throws Exception {
		customerPage.clickOnVendorsPage();
	}
	@Test(priority=5)
	public void clickOnActivityTestPage() throws Exception{
		customerPage.clickOnActivityLog();
	}
	@Test(priority=6)
	public void clickOnActivityTypeTestPage() throws Exception{
		customerPage.clickOnActivityTypes();
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}





}
