package com.qa.nop.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.nop.base.TestBase;

public class ContentManagementPage extends TestBase {
	ContentManagementPage contentpage;
	
	
	
	public ContentManagementPage() {
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}


	@FindBy(xpath="//span[contains(text(),'Content management')]")
	WebElement contentMenu;
	
	@FindBy(xpath="//span[contains(text(),'Topics (pages)')]")
	WebElement topicsMenu;
	
	@FindBy(xpath="//span[contains(text(),'Message templates')]")
	WebElement messageMenu;

	@FindBy(xpath="//span[contains(text(),'News items')]")
	WebElement nitemsMenu;

	@FindBy(xpath="//span[contains(text(),'News comments')]")
	WebElement ncommentsMenu;
	
	@FindBy(xpath="//span[contains(text(),'Blog posts')]")
	WebElement blogMenu;


	@FindBy(xpath="//span[contains(text(),'Blog comments')]")
	WebElement bcommentsMenu;

	@FindBy(xpath="//span[contains(text(),'Polls')]")
	WebElement pollsMenu;
	
	@FindBy(xpath="//span[contains(text(),'Forums')]")
	WebElement forumsMenu;

	
	public void clickOnContentMenuPage() throws Exception{
		contentMenu.click();
		Thread.sleep(2000);
		Actions builder = new Actions(driver);
		builder.moveToElement(topicsMenu).build().perform();
		topicsMenu.click();
	}
	
	public void clickOnMessageMenuPage() throws Exception{
		contentMenu.click();
		Thread.sleep(2000);
		Actions builder = new Actions(driver);
		builder.moveToElement(messageMenu).build().perform();
		messageMenu.click();
	}
	
	public void clickOnForumsMenuPage() throws Exception{
		contentMenu.click();
		Thread.sleep(2000);
		Actions builder = new Actions(driver);
		builder.moveToElement(forumsMenu).build().perform();
		forumsMenu.click();
	}
	
	public void clickOnPollsMenuPage() throws Exception{
		contentMenu.click();
		Thread.sleep(2000);
		Actions builder = new Actions(driver);
		builder.moveToElement(pollsMenu).build().perform();
		pollsMenu.click();
	}

	public void clickOnBlogMenuPage() throws Exception{
		contentMenu.click();
		Thread.sleep(2000);
		Actions builder = new Actions(driver);
		builder.moveToElement(blogMenu).build().perform();
		blogMenu.click();
	}

	public void clickOnNewCommentsMenuPage() throws Exception{
		contentMenu.click();
		Thread.sleep(2000);
		Actions builder = new Actions(driver);
		builder.moveToElement(ncommentsMenu).build().perform();
		ncommentsMenu.click();
	}

	public void clickOnNewItemsMenuPage() throws Exception{
		contentMenu.click();
		Thread.sleep(2000);
		Actions builder = new Actions(driver);
		builder.moveToElement(nitemsMenu).build().perform();
		nitemsMenu.click();
	}
	
	public void clickOnBlogcommentsMenuPage() throws Exception{
		contentMenu.click();
		Thread.sleep(2000);
		Actions builder = new Actions(driver);
		builder.moveToElement(bcommentsMenu).build().perform();
		bcommentsMenu.click();
	}


}
