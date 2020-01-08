package com.qa.nop.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.nop.base.TestBase;

public class CustomerPage extends TestBase {
	 CustomerPage customerPage;
	 //PageObjects
	 @FindBy(xpath="//span[contains(text(),'Customers')]/preceding-sibling::i[@class='fa fa-user']")
	 WebElement customerMenu;
	 @FindBy(xpath="//li[@class='treeview menu-open']//ul[@class='treeview-menu']//li//"
	 		+ "span[@class='menu-item-title'][contains(text(),'Customers')]")
	 WebElement customers;
	 @FindBy(xpath="//span[contains(text(),'Customer roles')]")
	 WebElement customerroles;
	 @FindBy(xpath="//span[contains(text(),'Online customers')]")
	 WebElement customerOnline;
	 @FindBy(xpath="//span[contains(text(),'Vendors')]")
	 WebElement vendor;
	 @FindBy(xpath="//span[contains(text(),'Activity log')]")
	 WebElement activityLog;
	 @FindBy(xpath="//span[contains(text(),'Activity Types')]")
	 WebElement activityTypes;
	 @FindBy(xpath="//span[contains(text(),'GDPR requests (log)')]")
	 WebElement logRequest ;
	 //constructor
	 public CustomerPage(){
		 PageFactory.initElements(driver, this);
	 }
	 
	 //actions
	 public void clickOnCustomersMenu() throws Exception{
		 customerMenu.click();
		 Thread.sleep(2000);
		 Actions builder = new Actions(driver);
		 builder.moveToElement(customers).build().perform();
		 customers.click();
	 }
	 
	 public void clickOnCustomerRolesPage() throws Exception{
		 customerMenu.click();
		 Thread.sleep(2000);
		 Actions builder = new Actions(driver);
		 builder.moveToElement(customerroles).build().perform();
		 customerroles.click();

	 }
	 
	 public void clickOnOnlineCustomersPage() throws Exception{
		 customerMenu.click();
		 Thread.sleep(2000);
		 Actions builder = new Actions(driver);
		 builder.moveToElement(customerOnline).build().perform();
		 customerOnline.click();

	 }
	 
	 public void clickOnVendorsPage() throws Exception{
		 customerMenu.click();
		 Thread.sleep(2000);
		 Actions builder = new Actions(driver);
		 builder.moveToElement(vendor).build().perform();
		 vendor.click();

	 }
	 
	 public void clickOnActivityLog() throws Exception{
		 customerMenu.click();
		 Thread.sleep(2000);
		 Actions builder = new Actions(driver);
		 builder.moveToElement(activityLog).build().perform();
		 activityLog.click();

	 }
	 
	 public void clickOnActivityTypes() throws Exception{
		 customerMenu.click();
		 Thread.sleep(2000);
		 Actions builder = new Actions(driver);
		 builder.moveToElement(activityTypes).build().perform();
		 activityTypes.click();

	 }
	 
	 public void clickOnLogRequest() throws Exception{
		 customerMenu.click();
		 Thread.sleep(2000);
		 Actions builder = new Actions(driver);
		 builder.moveToElement(logRequest).build().perform();
		 logRequest.click();

	 }

}
