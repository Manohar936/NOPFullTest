package com.qa.nop.testpages;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.nop.base.TestBase;
import com.qa.nop.pages.ContentManagementPage;
import com.qa.nop.pages.DashBoardPage;
import com.qa.nop.pages.HomePage;

public class ContentManagementPageTest extends TestBase {
	HomePage homepage;
	DashBoardPage dashboardPage;
	ContentManagementPage contentpage;
	
	public ContentManagementPageTest() {
		super();
		// TODO Auto-generated constructor stub
	}
	
		@BeforeMethod
		public void setUp(){
			intialization();
			homepage = new HomePage();
			dashboardPage = new DashBoardPage();
			contentpage= new ContentManagementPage();
			dashboardPage=homepage.login(prop.getProperty("email"),prop.getProperty("password"));
			
	  }
		@Test(priority=1)
		public void clickonContentMenuTestPage() throws Exception{
			contentpage.clickOnContentMenuPage();
			
		}
		
		@Test(priority=2)
		public void clickonMessageMenuTestPage() throws Exception{
			contentpage.clickOnMessageMenuPage();
			
		}

		@Test(priority=3)
		public void clickonNewItemsMenuTestPage() throws Exception{
			contentpage.clickOnNewItemsMenuPage();
			
		}

		@Test(priority=4)
		public void clickonNewCommentsMenuTestPage() throws Exception{
			contentpage.clickOnNewCommentsMenuPage();
			
		}

		@Test(priority=5)
		public void clickonBlogMenuTestPage() throws Exception{
			contentpage.clickOnBlogMenuPage();
			
		}
		
		@Test(priority=5)
		public void clickonBlogcommentsMenuTestPage() throws Exception{
			contentpage.clickOnBlogcommentsMenuPage();
			
		}

		@Test(priority=7)
		public void clickonPollsMenuTestPage() throws Exception{
			contentpage.clickOnPollsMenuPage();
			
		}
		
		@Test(priority=8)
		public void clickonForumsMenuTestPage() throws Exception{
			contentpage.clickOnForumsMenuPage();
			
		}

		
		
		
		@AfterMethod
		public void tearDown(){
			driver.quit();
	}
	

}
