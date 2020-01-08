package com.qa.nop.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.nop.base.TestBase;

public class DashBoardPage extends TestBase {
	DashBoardPage dashboardpage;
	//PageObjects
	@FindBy(xpath="//a[contains(text(),'Happy New Year!')]")
	WebElement happylabel ;
	@FindBy(xpath="//a[contains(text(),'Premium support services')]")
	WebElement servicelabel ;
	@FindBy(xpath="//a[contains(text(),'Recommended hosting for your store')]")
	WebElement hostinglabel ;
	//Constructor
	public DashBoardPage(){
		PageFactory.initElements(driver, this);
	}
	
	//Actions
	public void clickHappyBlock(){
		happylabel.click();
	}
	public void clickServiceBlock(){
		servicelabel.click();
	}
	public void clickHostingBlock(){
		hostinglabel.click();
	}
	

}
