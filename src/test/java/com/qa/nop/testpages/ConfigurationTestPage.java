package com.qa.nop.testpages;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.nop.base.TestBase;
import com.qa.nop.pages.ConfigurationPage;
import com.qa.nop.pages.DashBoardPage;
import com.qa.nop.pages.HomePage;

public class ConfigurationTestPage extends TestBase {
	HomePage homepage;
	DashBoardPage dashboardpage;
	ConfigurationPage configpage;
	
	public ConfigurationTestPage(){
		super();
	}
	
	@BeforeMethod
	public void setup(){
		intialization();
		homepage= new HomePage();
		dashboardpage = new DashBoardPage();
		configpage = new ConfigurationPage();
	dashboardpage =homepage.login(prop.getProperty("email"), prop.getProperty("password"));
			
	}
	
	@Test(priority=1)
	public void clickOnConfigurationMenuTestPage() throws Exception{
		configpage.clickOnConfigMenuPage();
	}
	
	@Test(priority=2)
	public void clickOnCustomerSettingsMenuTestPage() throws Exception{
		configpage.clickOnCustomersSettingsMenuPage();
	}
	@Test(priority=3)
	public void clickOnOrdersSettingsMenuTestPage() throws Exception{
		configpage.clickOnorderSettingsMenuPage();
	}
	
	@Test(priority=4)
	public void clickOnShippingSettingsMenuTestPage() throws Exception{
		configpage.clickOnShippingSettingsMenuPage();
	}

	@Test(priority=5)
	public void clickOnTaxSettingsMenuTestPage() throws Exception{
		configpage.clickOnTaxSettingsMenuPage();
	}

	@Test(priority=6)
	public void clickOnCatalogSettingsMenuTestPage() throws Exception{
		configpage.clickOnCatalogSettingsMenuPage();
	}

	@Test(priority=7)
	public void clickOnShoppingCartSettingsMenuTestPage() throws Exception{
		configpage.clickOnShoppingSettingsMenuPage();
	}

	@Test(priority=8)
	public void clickOnRewardsSettingsMenuTestPage() throws Exception{
		configpage.clickOnRewardsSettingsMenuPage();
	}
	
	@Test(priority=9)
	public void clickOnGDPRSettingsMenuTestPage() throws Exception{
		configpage.clickOnGDPRSettingsMenuPage();
	}

	@Test(priority=10)
	public void clickOnVendorsSettingsMenuTestPage() throws Exception{
		configpage.clickOnVendorSettingsMenuPage();
	}

	@Test(priority=11)
	public void clickOnBlogSettingsMenuTestPage() throws Exception{
		configpage.clickOnBlogSettingsMenuPage();
	}

	@Test(priority=12)
	public void clickOnNewsSettingsMenuTestPage() throws Exception{
		configpage.clickOnNewsSettingsMenuPage();
	}

	@Test(priority=13)
	public void clickOnForumSettingsMenuTestPage() throws Exception{
		configpage.clickOnForumSettingsMenuPage();
	}

	@Test(priority=14)
	public void clickOnMediaSettingsMenuTestPage() throws Exception{
		configpage.clickOnMediaSettingsMenuPage();
	}
	
	@Test(priority=15)
	public void clickOnAllSettingsMenuTestPage() throws Exception{
		configpage.clickOnAllSettingsMenuPage();
	}


	
	@Test(priority=16)
	public void clickOnEmailAccountsMenuTestPage() throws Exception{
		configpage.clickOnEmailAccountsMenuPage();
	}
	@Test(priority=17)
	public void clickOnStoresMenuTestPage() throws Exception{
		configpage.clickOnStoresMenuPage();
		
	}
	@Test(priority=18)
	public void clickOnCountryMenuTestPage() throws Exception{
		configpage.clickOnCountriesMenuPage();
		
	}
	@Test(priority=19)
	public void clickOnLanguagesMenuTestPage() throws Exception{
		configpage.clickOnLanguagesMenuPage();
	}
	@Test(priority=20)
	public void clickOnCurrenciesMenuTestPage() throws Exception{
		configpage.clickOnCurrencyMenuPage();
		
	}
	@Test(priority=21)
	public void clickOnPaymentMethodsMenuTestPage() throws Exception{
		configpage.clickOnPaymentMethodMenuPage();
		
	}
	@Test(priority=22)
	public void clickOnPaymentrestrictionsMenuTestPage() throws Exception{
		configpage.clickOnPaymentRestricitionsMenuPage();
		
	}
	@Test(priority=23)
	public void clickOnTaxProvidersMenuTestPage() throws Exception{
		configpage.clickOnTaxprovidersMenuPage();
		
	}
	@Test(priority=24)
	public void clickOnTaxCategoriesMenuTestPage() throws Exception{
		configpage.clickOnTaxCategoriesMenuPage();
		
	}
	@Test(priority=25)
	public void clickOnShippingMenuTestPage() throws Exception{
		configpage.clickOnShippingMenuPage();
		
	}
	
	@Test(priority=26)
	public void clickOnWarehousesMenuTestPage() throws Exception{
		configpage.clickOnWarehousesSettingsMenuPage();
	}
	
	@Test(priority=27)
	public void clickOnPickupPointsMenuTestPage() throws Exception{
		configpage.clickOnPickUpPointMenuPage();
	}
	
	@Test(priority=28)
	public void clickOnDatesSettingsMenuTestPage() throws Exception{
		configpage.clickOnDatesMenuPage();
	}
	
	@Test(priority=29)
	public void clickOnMeasuresSettingsMenuTestPage() throws Exception{
		configpage.clickOnMeasuresMenuPage();
	}

	@Test(priority=30)
	public void clickOnAccessControlMenuTestPage() throws Exception{
		configpage.clickOnAccessControlMenuPage();
		
	}
	@Test(priority=31)
	public void clickOnWidgetsMenuTestPage() throws Exception{
		configpage.clickOnWidgetsMenuPage();
	}
	@Test(priority=32)
	public void clickOnExternalAuthenticationMenuTestPage() throws Exception{
		configpage.clickOnAuthenticationMenuPage();
		
	}
	@Test(priority=33)
	public void clickOnLocalPluginsMenuTestPage() throws Exception{
		configpage.clickOnLocalMenuPage();
		
	}
	@Test(priority=34)
	public void clickOnAllPluginsMenuTestPage() throws Exception{
		configpage.clickOnAllPluginsMenuPage();
		
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	

}
