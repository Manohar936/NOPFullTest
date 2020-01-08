package com.qa.nop.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.nop.base.TestBase;

public class HomePage extends TestBase {
	
	//PageFactoryor ObjectRepository
	@FindBy(xpath="//input[@id='Email']")
	WebElement useremail ;
	@FindBy(xpath="//input[@id='Password']")
	WebElement passwd ;
	@FindBy(xpath="//input[@class='button-1 login-button']")
	WebElement loginBtn ;
	@FindBy(xpath="//input[@id='RememberMe']")
	WebElement rememberme ;
	
	//Constructor
	public HomePage(){
		//this refers current class object
		PageFactory.initElements(driver, this);
	}
	//Actions
	public String validateLoginPageTitle(){
		return driver.getTitle();
		
	}
	
	public DashBoardPage login(String email,String password){
		useremail.sendKeys(email);
		passwd.sendKeys(password);
		loginBtn.click();
		return new DashBoardPage();
	}


}
