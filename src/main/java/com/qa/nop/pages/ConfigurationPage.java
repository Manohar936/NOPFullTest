package com.qa.nop.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.nop.base.TestBase;

public class ConfigurationPage extends TestBase {
	
	ConfigurationPage configpage;
	
	public ConfigurationPage(){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[contains(text(),'Configuration')]")
	WebElement  configMenu;
	
	@FindBy(xpath="//span[contains(text(),'Settings')]")
	WebElement  settingsMenu;
	
	@FindBy(xpath="//span[contains(text(),'General settings')]")
	WebElement  generalSettings;

	@FindBy(xpath="//span[contains(text(),'Customer settings')]")
	WebElement  customersSettings;

	@FindBy(xpath="//span[contains(text(),'Order settings')]")
	WebElement  ordersSettings;

	@FindBy(xpath="//span[contains(text(),'Shipping settings')]")
	WebElement  shipsettings;

	@FindBy(xpath="//span[contains(text(),'Tax settings')]")
	WebElement  taxsettings;

	@FindBy(xpath="//span[contains(text(),'Catalog settings')]")
	WebElement  catalogsettings;

	@FindBy(xpath="//span[contains(text(),'Shopping cart settings')]")
	WebElement  shopcartsettings;

	@FindBy(xpath="//span[contains(text(),'Reward points')]")
	WebElement  rewardsettings;

	@FindBy(xpath="//span[contains(text(),'GDPR settings')]")
	WebElement  gdprsettings;
	
	@FindBy(xpath="//span[contains(text(),'Vendor settings')]")
	WebElement  vendorsettings;

	@FindBy(xpath="//span[contains(text(),'Blog settings')]")
	WebElement  blogSettings;

	@FindBy(xpath="//span[contains(text(),'News settings')]")
	WebElement  newsSettings;

	@FindBy(xpath="//span[contains(text(),'Forum settings')]")
	WebElement  forumsettings;

	@FindBy(xpath="//span[contains(text(),'Media settings')]")
	WebElement  mediasettings;

	@FindBy(xpath="//span[contains(text(),'All settings (advanced)')]")
	WebElement  allsettings;

	@FindBy(xpath="//span[contains(text(),'Email accounts')]")
	WebElement  emailMenu;
	
	@FindBy(xpath="//span[contains(text(),'Stores')]")
	WebElement  storesMenu;
	
	@FindBy(xpath="//span[contains(text(),'Countries')]")
	WebElement  countriesMenu;
	
	@FindBy(xpath="//span[contains(text(),'Languages')]")
	WebElement  languageMenu;
	
	@FindBy(xpath="//span[contains(text(),'Currencies')]")
	WebElement  currencyMenu;
	
	@FindBy(xpath="//span[contains(text(),'Payment methods')]")
	WebElement  paymentMenu;
	
	@FindBy(xpath="//span[contains(text(),'Payment restrictions')]")
	WebElement  paymentrestrictMenu;
	
	@FindBy(xpath="//span[contains(text(),'Tax providers')]")
	WebElement  taxProvidersMenu;
	
	@FindBy(xpath="//span[contains(text(),'Tax categories')]")
	WebElement  taxcategoryMenu;
	
	@FindBy(xpath="(//span[contains(text(),'Shipping')])[2]")
	WebElement labelShip;
	
	@FindBy(xpath="//span[contains(text(),'Shipping providers')]")
	WebElement  shipProvidersMenu;
	
	@FindBy(xpath="//span[contains(text(),'Warehouses')]")
	WebElement  warehousesMenu;
	
	@FindBy(xpath="//span[contains(text(),'Pickup points')]")
	WebElement  pickupMenu;
	
	@FindBy(xpath="//span[contains(text(),'Dates and ranges')]")
	WebElement  datesMenu;
	
	@FindBy(xpath="//span[contains(text(),'Measures')]")
	WebElement  measuresMenu;
	
	@FindBy(xpath="//span[contains(text(),'Access control list')]")
	WebElement  accessMenu;
	
	@FindBy(xpath="//span[contains(text(),'Widgets')]")
	WebElement  widgetsMenu;
	
	@FindBy(xpath="//span[contains(text(),'External authentication')]")
	WebElement  authenticationMenu;
	
	@FindBy(xpath="//span[contains(text(),'Local plugins')]")
	WebElement  localMenu;
	
	@FindBy(xpath="//span[contains(text(),'All plugins and themes')]")
	WebElement  allPluginsMenu;
	
	public void clickOnConfigMenuPage() throws Exception{
		configMenu.click();
		Thread.sleep(2000);
		Actions builder = new Actions(driver);
		builder.moveToElement(settingsMenu).build().perform();
		settingsMenu.click();
		Thread.sleep(2000);
		Actions builder1 = new Actions(driver);
		builder1.moveToElement(generalSettings).build().perform();
		generalSettings.click();
		
		
	}
	public void clickOnCustomersSettingsMenuPage() throws Exception{
		configMenu.click();
		Thread.sleep(2000);
		Actions builder = new Actions(driver);
		builder.moveToElement(settingsMenu).build().perform();
		settingsMenu.click();
		Thread.sleep(2000);
		Actions builder1 = new Actions(driver);
		builder1.moveToElement(customersSettings).build().perform();
		customersSettings.click();
	}
	
	public void clickOnorderSettingsMenuPage() throws Exception{
		configMenu.click();
		Thread.sleep(2000);
		Actions builder = new Actions(driver);
		builder.moveToElement(settingsMenu).build().perform();
		settingsMenu.click();
		Thread.sleep(2000);
		Actions builder1 = new Actions(driver);
		builder1.moveToElement(ordersSettings).build().perform();
		ordersSettings.click();
	}
	
	public void clickOnShippingSettingsMenuPage() throws Exception{
		configMenu.click();
		Thread.sleep(2000);
		Actions builder = new Actions(driver);
		builder.moveToElement(settingsMenu).build().perform();
		settingsMenu.click();
		Thread.sleep(2000);
		Actions builder1 = new Actions(driver);
		builder1.moveToElement(shipsettings).build().perform();
		shipsettings.click();
	}
	
	public void clickOnTaxSettingsMenuPage() throws Exception{
		configMenu.click();
		Thread.sleep(2000);
		Actions builder = new Actions(driver);
		builder.moveToElement(settingsMenu).build().perform();
		settingsMenu.click();
		Thread.sleep(2000);
		Actions builder1 = new Actions(driver);
		builder1.moveToElement(taxsettings).build().perform();
		taxsettings.click();
	}
	
	public void clickOnCatalogSettingsMenuPage() throws Exception{
		configMenu.click();
		Thread.sleep(2000);
		Actions builder = new Actions(driver);
		builder.moveToElement(settingsMenu).build().perform();
		settingsMenu.click();
		Thread.sleep(2000);
		Actions builder1 = new Actions(driver);
		builder1.moveToElement(catalogsettings).build().perform();
		catalogsettings.click();
	}
	
	public void clickOnShoppingSettingsMenuPage() throws Exception{
		configMenu.click();
		Thread.sleep(2000);
		Actions builder = new Actions(driver);
		builder.moveToElement(settingsMenu).build().perform();
		settingsMenu.click();
		Thread.sleep(2000);
		Actions builder1 = new Actions(driver);
		builder1.moveToElement(shopcartsettings).build().perform();
		shopcartsettings.click();
	}
	
	public void clickOnRewardsSettingsMenuPage() throws Exception{
		configMenu.click();
		Thread.sleep(2000);
		Actions builder = new Actions(driver);
		builder.moveToElement(settingsMenu).build().perform();
		settingsMenu.click();
		Thread.sleep(2000);
		Actions builder1 = new Actions(driver);
		builder1.moveToElement(rewardsettings).build().perform();
		shopcartsettings.click();
	}
	
	public void clickOnGDPRSettingsMenuPage() throws Exception{
		configMenu.click();
		Thread.sleep(2000);
		Actions builder = new Actions(driver);
		builder.moveToElement(settingsMenu).build().perform();
		settingsMenu.click();
		Thread.sleep(2000);
		Actions builder1 = new Actions(driver);
		builder1.moveToElement(gdprsettings).build().perform();
		gdprsettings.click();
	}
	
	public void clickOnVendorSettingsMenuPage() throws Exception{
		configMenu.click();
		Thread.sleep(2000);
		Actions builder = new Actions(driver);
		builder.moveToElement(settingsMenu).build().perform();
		settingsMenu.click();
		Thread.sleep(2000);
		Actions builder1 = new Actions(driver);
		builder1.moveToElement(vendorsettings).build().perform();
		vendorsettings.click();
	}
	
	public void clickOnBlogSettingsMenuPage() throws Exception{
		configMenu.click();
		Thread.sleep(2000);
		Actions builder = new Actions(driver);
		builder.moveToElement(settingsMenu).build().perform();
		settingsMenu.click();
		Thread.sleep(2000);
		Actions builder1 = new Actions(driver);
		builder1.moveToElement(blogSettings).build().perform();
		blogSettings.click();
	}
	
	public void clickOnNewsSettingsMenuPage() throws Exception{
		configMenu.click();
		Thread.sleep(2000);
		Actions builder = new Actions(driver);
		builder.moveToElement(settingsMenu).build().perform();
		settingsMenu.click();
		Thread.sleep(2000);
		Actions builder1 = new Actions(driver);
		builder1.moveToElement(newsSettings).build().perform();
		newsSettings.click();
	}
	
	public void clickOnForumSettingsMenuPage() throws Exception{
		configMenu.click();
		Thread.sleep(2000);
		Actions builder = new Actions(driver);
		builder.moveToElement(settingsMenu).build().perform();
		settingsMenu.click();
		Thread.sleep(2000);
		Actions builder1 = new Actions(driver);
		builder1.moveToElement(forumsettings).build().perform();
		forumsettings.click();
	}
	
	
	public void clickOnMediaSettingsMenuPage() throws Exception{
		configMenu.click();
		Thread.sleep(2000);
		Actions builder = new Actions(driver);
		builder.moveToElement(settingsMenu).build().perform();
		settingsMenu.click();
		Thread.sleep(2000);
		Actions builder1 = new Actions(driver);
		builder1.moveToElement(mediasettings).build().perform();
		mediasettings.click();
	}
	
	public void clickOnAllSettingsMenuPage() throws Exception{
		configMenu.click();
		Thread.sleep(2000);
		Actions builder = new Actions(driver);
		builder.moveToElement(settingsMenu).build().perform();
		settingsMenu.click();
		Thread.sleep(2000);
		Actions builder1 = new Actions(driver);
		builder1.moveToElement(allsettings).build().perform();
		allsettings.click();
	}
	
	public void clickOnShippingMenuPage() throws Exception{
		configMenu.click();
		Thread.sleep(2000);
		Actions builder = new Actions(driver);
		builder.moveToElement(labelShip).build().perform();
		labelShip.click();
		Thread.sleep(2000);
		Actions builder1 = new Actions(driver);
		builder1.moveToElement(shipProvidersMenu).build().perform();
		shipProvidersMenu.click();
	}
	
	public void clickOnWarehousesSettingsMenuPage() throws Exception{
		configMenu.click();
		Thread.sleep(2000);
		Actions builder = new Actions(driver);
		builder.moveToElement(labelShip).build().perform();
		labelShip.click();
		Thread.sleep(2000);
		Actions builder1 = new Actions(driver);
		builder1.moveToElement(warehousesMenu).build().perform();
		warehousesMenu.click();
	}
	
	public void clickOnPickUpPointMenuPage() throws Exception{
		configMenu.click();
		Thread.sleep(2000);
		Actions builder = new Actions(driver);
		builder.moveToElement(labelShip).build().perform();
		labelShip.click();
		Thread.sleep(2000);
		Actions builder1 = new Actions(driver);
		builder1.moveToElement(pickupMenu).build().perform();
		pickupMenu.click();
	}
	
	public void clickOnDatesMenuPage() throws Exception{
		configMenu.click();
		Thread.sleep(2000);
		Actions builder = new Actions(driver);
		builder.moveToElement(labelShip).build().perform();
		labelShip.click();
		Thread.sleep(2000);
		Actions builder1 = new Actions(driver);
		builder1.moveToElement(datesMenu).build().perform();
		datesMenu.click();
	}
	
	public void clickOnMeasuresMenuPage() throws Exception{
		configMenu.click();
		Thread.sleep(2000);
		Actions builder = new Actions(driver);
		builder.moveToElement(labelShip).build().perform();
		labelShip.click();
		Thread.sleep(2000);
		Actions builder1 = new Actions(driver);
		builder1.moveToElement(measuresMenu).build().perform();
		measuresMenu.click();
	}
	
	public void clickOnEmailAccountsMenuPage() throws Exception{
		configMenu.click();
		Thread.sleep(2000);
		Actions builder = new Actions(driver);
		builder.moveToElement(emailMenu).build().perform();
		emailMenu.click();
	}
	
	public void clickOnStoresMenuPage() throws Exception{
		configMenu.click();
		Thread.sleep(2000);
		Actions builder = new Actions(driver);
		builder.moveToElement(storesMenu).build().perform();
		storesMenu.click();
		
	}
	
	public void clickOnCountriesMenuPage() throws Exception{
		configMenu.click();
		Thread.sleep(2000);
		Actions builder = new Actions(driver);
		builder.moveToElement(countriesMenu).build().perform();
		countriesMenu.click();
		
	}
	
	public void clickOnLanguagesMenuPage() throws Exception{
		configMenu.click();
		Thread.sleep(2000);
		Actions builder = new Actions(driver);
		builder.moveToElement(languageMenu).build().perform();
		languageMenu.click();
		
	}
	
	public void clickOnCurrencyMenuPage() throws Exception{
		configMenu.click();
		Thread.sleep(2000);
		Actions builder = new Actions(driver);
		builder.moveToElement(currencyMenu).build().perform();
		currencyMenu.click();
		}
	
	public void clickOnPaymentMethodMenuPage() throws Exception{
		configMenu.click();
		Thread.sleep(2000);
		Actions builder = new Actions(driver);
		builder.moveToElement(paymentMenu).build().perform();
		paymentMenu.click();
		
	}
	
	public void clickOnPaymentRestricitionsMenuPage() throws Exception{
		configMenu.click();
		Thread.sleep(2000);
		Actions builder = new Actions(driver);
		builder.moveToElement(paymentrestrictMenu).build().perform();
		paymentrestrictMenu.click();
		
	}
	
	public void clickOnTaxprovidersMenuPage() throws Exception{
		configMenu.click();
		Thread.sleep(2000);
		Actions builder = new Actions(driver);
		builder.moveToElement(taxProvidersMenu).build().perform();
		taxProvidersMenu.click();
		
	}
	
	public void clickOnTaxCategoriesMenuPage() throws Exception{
		configMenu.click();
		Thread.sleep(2000);
		Actions builder = new Actions(driver);
		builder.moveToElement(taxcategoryMenu).build().perform();
		taxcategoryMenu.click();
		
	}
	
	public void clickOnAccessControlMenuPage() throws Exception{
		configMenu.click();
		Thread.sleep(2000);
		Actions builder = new Actions(driver);
		builder.moveToElement(accessMenu).build().perform();
		accessMenu.click();
	}
	
	public void clickOnAuthenticationMenuPage() throws Exception{
		configMenu.click();
		Thread.sleep(2000);
		Actions builder = new Actions(driver);
		builder.moveToElement(authenticationMenu).build().perform();
		authenticationMenu.click();
		
	}
	
	public void clickOnWidgetsMenuPage() throws Exception{
		configMenu.click();
		Thread.sleep(2000);
		Actions builder = new Actions(driver);
		builder.moveToElement(widgetsMenu).build().perform();
		widgetsMenu.click();
		
	}
	
	public void clickOnLocalMenuPage() throws Exception{
		configMenu.click();
		Thread.sleep(2000);
		Actions builder = new Actions(driver);
		builder.moveToElement(localMenu).build().perform();
		localMenu.click();
		
	}
	
	public void clickOnAllPluginsMenuPage() throws Exception{
		configMenu.click();
		Thread.sleep(2000);
		Actions builder = new Actions(driver);
		builder.moveToElement(allPluginsMenu).build().perform();
		allPluginsMenu.click();
		
	}
	

	


	
	
}
