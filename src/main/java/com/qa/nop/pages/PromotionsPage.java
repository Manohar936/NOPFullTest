package com.qa.nop.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.nop.base.TestBase;

public class PromotionsPage extends TestBase{
	
	PromotionsPage promotionPage;
	
	public PromotionsPage(){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[contains(text(),'Promotions')]")
	WebElement promotionsMenu;
	
	@FindBy(xpath="//span[contains(text(),'Discounts')]")
	WebElement discountsMenu;
	
	@FindBy(xpath="//span[contains(text(),'Affiliates')]")
	WebElement affiliatesMenu;
	
	@FindBy(xpath="//span[contains(text(),'Newsletter subscribers')]")
	WebElement newsletterMenu;

	@FindBy(xpath="//span[contains(text(),'Campaigns')]")
	WebElement campaignsMenu;

	
	public void clickOnPromotionsMenuPage() throws Exception{
		promotionsMenu.click();
		Thread.sleep(2000);
		Actions builder = new Actions(driver);
		builder.moveToElement(discountsMenu).build().perform();
		discountsMenu.click();
	}
	
	public void clickOnAffiliatesMenuPage() throws Exception{
		promotionsMenu.click();
		Thread.sleep(2000);
		Actions builder = new Actions(driver);
		builder.moveToElement(affiliatesMenu).build().perform();
		affiliatesMenu.click();
	}
	
	public void clickOnNewLetterMenuPage() throws Exception{
		promotionsMenu.click();
		Thread.sleep(2000);
		Actions builder = new Actions(driver);
		builder.moveToElement(newsletterMenu).build().perform();
		newsletterMenu.click();
	}
	
	public void clickOnCampaignsMenuPage() throws Exception{
		promotionsMenu.click();
		Thread.sleep(2000);
		Actions builder = new Actions(driver);
		builder.moveToElement(campaignsMenu).build().perform();
		campaignsMenu.click();
	}
	

}
