package com.qa.nop.testpages;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.nop.base.TestBase;
import com.qa.nop.pages.DashBoardPage;
import com.qa.nop.pages.HomePage;
import com.qa.nop.pages.SalesPage;

public class SalesTestPage extends TestBase {
		HomePage homepage;
		DashBoardPage dashboardpage;
		SalesPage salepage;
		
		public SalesTestPage(){
			super();
		}
		
		@BeforeMethod
		public  void setUp(){
			intialization();
			homepage = new HomePage();
			dashboardpage = new DashBoardPage();
			salepage = new SalesPage();
			dashboardpage=homepage.login(prop.getProperty("email"), prop.getProperty("password"));
		}
		@Test(priority=1)
		public void clickOnsalesMenuTestPage() throws Exception{
			salepage.clickOnSalesMenuPage();
		}
		@Test(priority=2)
		public void clickOnShipmentMenuTestPage() throws Exception{
			salepage.clickOnShipmentMenuPage();
		}
		@Test(priority=3)
		public void clickOnReturnMenuTestPage() throws Exception{
			salepage.clickOnSalesMenuPage();
		}
		@Test(priority=4)
		public void clickOnRecurringMenuTestPage() throws Exception{
			salepage.clickOnSalesMenuPage();
		}
		@Test(priority=5)
		public void clickOnGiftMenuTestPage() throws Exception{
			salepage.clickOnSalesMenuPage();
		}
		@Test(priority=6)
		public void clickOnShoppingMenuTestPage() throws Exception{
			salepage.clickOnshoppingMenuPage();
		}
		@AfterMethod
		public void tearDown(){
			driver.quit();
		}
		
}
