package com.qa.nop.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.nop.base.TestBase;

public class SalesPage extends TestBase {
	
	SalesPage salePage;
	
	public SalesPage(){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[contains(text(),'Sales')]/preceding-sibling::i[@class='fa fa-shopping-cart']")
	WebElement salesMenu;
	
	@FindBy(xpath="//span[contains(text(),'Orders')]/preceding-sibling::i[@class='fa fa-dot-circle-o']")
	WebElement ordersMenu;
	
	@FindBy(xpath="//span[contains(text(),'Shipments')]/preceding-sibling::i[@class='fa fa-dot-circle-o']")
	WebElement shipmentsMenu;
	
	@FindBy(xpath="//span[contains(text(),'Return requests')]/preceding-sibling::i[@class='fa fa-dot-circle-o']")
	WebElement returnMenu;
	
	@FindBy(xpath="//span[contains(text(),'Recurring payments')]/preceding-sibling::i[@class='fa fa-dot-circle-o']")
	WebElement recurringMenu;
	
	@FindBy(xpath="//span[contains(text(),'Gift cards')]/preceding-sibling::i[@class='fa fa-dot-circle-o']")
	WebElement giftMenu;
	
	@FindBy(xpath="//span[contains(text(),'Shopping carts and wishlists')]/preceding-sibling::i[@class='fa fa-dot-circle-o']")
	WebElement shoppingLabel;
	
	public void clickOnSalesMenuPage() throws Exception{
		salesMenu.click();
		Actions builder = new Actions(driver);
		builder.moveToElement(ordersMenu).build().perform();
		Thread.sleep(2000);
		ordersMenu.click();	
	}
	
	public void clickOnShipmentMenuPage() throws Exception{
		salesMenu.click();
		Actions builder = new Actions(driver);
		builder.moveToElement(shipmentsMenu).build().perform();
		Thread.sleep(2000);
		shipmentsMenu.click();	
	}
	
	public void clickOnReturnMenuPage() throws Exception{
		salesMenu.click();
		Actions builder = new Actions(driver);
		builder.moveToElement(returnMenu).build().perform();
		Thread.sleep(2000);
		returnMenu.click();	
	}
	
	public void clickOnMenuPage() throws Exception{
		salesMenu.click();
		Actions builder = new Actions(driver);
		builder.moveToElement(giftMenu).build().perform();
		Thread.sleep(2000);
		giftMenu.click();	
	}
	
	public void clickOnRecurringMenuPage() throws Exception{
		salesMenu.click();
		Actions builder = new Actions(driver);
		builder.moveToElement(recurringMenu).build().perform();
		Thread.sleep(2000);
		recurringMenu.click();	
	}
	
	public void clickOnshoppingMenuPage() throws Exception{
		salesMenu.click(); 
		Actions builder = new Actions(driver);
		builder.moveToElement(shoppingLabel).build().perform();
		Thread.sleep(2000);
		shoppingLabel.click();	
	}

}
