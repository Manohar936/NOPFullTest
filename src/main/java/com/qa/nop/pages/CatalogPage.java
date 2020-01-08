package com.qa.nop.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.nop.base.TestBase;

public class CatalogPage extends TestBase {
	CatalogPage catalogPage;
	//PageObjects or ObjectRepository
	@FindBy(xpath="//span[contains(text(),'Catalog')]/preceding-sibling::i[@class='fa fa-book']")
	WebElement catalogLabel;
	
	@FindBy(xpath="//li[@class='treeview menu-open']//ul[@class='treeview-menu']//li//span[@class='menu-item-title'][contains(text(),'Products')]")
	WebElement productsMenu;
	
	@FindBy(xpath="//span[contains(text(),'Categories')]/preceding-sibling::i[@class='fa fa-dot-circle-o']")
	WebElement categoriesMenu;
	
	@FindBy(xpath="//span[contains(text(),'Manufacturers')]/preceding-sibling::i[@class='fa fa-dot-circle-o']")
	WebElement manufactureMenu;
	
	@FindBy(xpath="//span[contains(text(),'Product reviews')]/preceding-sibling::i[@class='fa fa-dot-circle-o']")
	WebElement productreview;
	
	@FindBy(xpath="//span[contains(text(),'Product tags')]/preceding-sibling::i[@class='fa fa-dot-circle-o']")
	WebElement productsTag;
	
	@FindBy(xpath="//span[contains(text(),'Attributes')]/preceding-sibling::i[@class='fa fa-dot-circle-o']")
	WebElement AttributeLabel;
	
	@FindBy(xpath="//span[contains(text(),'Product attributes')]/preceding-sibling::i[@class='fa fa-genderless']")
	WebElement productAttribute;
	
	@FindBy(xpath="//span[contains(text(),'Specification attributes')]/preceding-sibling::i[@class='fa fa-genderless']")
	WebElement specificationAttribute;
	
	@FindBy(xpath="//span[contains(text(),'Checkout attributes')]/preceding-sibling::i[@class='fa fa-genderless']")
	WebElement checkoutAttribute;
	
	//Constructor
	public CatalogPage(){
		PageFactory.initElements(driver, this);
	}
	
	//Actions
	
	public void clickOnCatalogMenu() throws Exception{
		catalogLabel.click();
		Thread.sleep(2000);
		Actions builder = new Actions(driver);
		builder.moveToElement(productsMenu).build().perform();
		productsMenu.click();	
	}
	
	public void clickOnCategoriesMenu() throws Exception{
		catalogLabel.click();
		Thread.sleep(2000);
		Actions builder = new Actions(driver);
		builder.moveToElement(categoriesMenu).build().perform();
		categoriesMenu.click();
	}
	
	public void clickOnManufacturesMenu() throws Exception{
		catalogLabel.click();
		Thread.sleep(2000);
		Actions builder = new Actions(driver);
		builder.moveToElement(manufactureMenu).build().perform();
		manufactureMenu.click();
	}
	
	public void clickOnProductReviewMenu() throws Exception{
		catalogLabel.click();
		Thread.sleep(2000);
		Actions builder = new Actions(driver);
		builder.moveToElement(productreview).build().perform();
		productreview.click();
	}
	
	public void clickOnProductTagMenu() throws Exception{
		catalogLabel.click();
		Thread.sleep(2000);
		Actions builder = new Actions(driver);
		builder.moveToElement(productsTag).build().perform();
		productsTag.click();
	}
	
	public void clickOnAttributeMenu() throws Exception{
		catalogLabel.click();
		Thread.sleep(2000);
		Actions builder = new Actions(driver);
		builder.moveToElement(AttributeLabel).build().perform();
		AttributeLabel.click();
	}
	
	public void clickOnProductAttributeMenu() throws Exception{
		catalogLabel.click();
		Thread.sleep(2000);
		Actions builder = new Actions(driver);
		builder.moveToElement(productAttribute).build().perform();
		productAttribute.click();
	}
	
	public void clickOnSpecificationAttributeMenu() throws Exception{
		catalogLabel.click();
		Thread.sleep(2000);
		Actions builder = new Actions(driver);
		builder.moveToElement(specificationAttribute).build().perform();
		specificationAttribute.click();
	}
	
	public void clickOnCheckOutMenu() throws Exception{
		catalogLabel.click();
		Thread.sleep(2000);
		Actions builder = new Actions(driver);
		builder.moveToElement(checkoutAttribute).build().perform();		
		checkoutAttribute.click();
	}

}
