package com.qa.nop.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.excel.utility.Xls_Reader;
import com.qa.nop.base.TestBase;

public class CatalogPage extends TestBase {
	CatalogPage catalogPage;
	Xls_Reader xls_Reader;
	//PageObjects or ObjectRepository
	@FindBy(xpath="//span[contains(text(),'Catalog')]/preceding-sibling::i[@class='fa fa-book']")
	WebElement catalogLabel;
	
	@FindBy(xpath="//li[@class='treeview menu-open']//ul[@class='treeview-menu']//li//span[@class='menu-item-title'][contains(text(),'Products')]")
	WebElement productsMenu;
	
	@FindBy(xpath="//div[@class='pull-right']//following-sibling::a")
	WebElement addMenu;
	
	@FindBy(xpath="//a[contains(text(),'back to product list')]")
	WebElement backtolist;
	
	@FindBy(xpath="//div[@class='pull-right']//a//following-sibling::button[@name='download-catalog-pdf']")
	WebElement pdf;
	
	@FindBy(xpath="(//div[@class='btn-group']//button[@class='btn btn-success dropdown-toggle']//following-sibling::span[1])")
	WebElement exportblink;
	
	@FindBy(xpath="//button[@name='importexcel']")
	WebElement importlabel;
	
	@FindBy(xpath="//button[@id='delete-selected']")
	WebElement deletebtn;
	
	
	
	
	@FindBy(xpath="//input[@id='SearchProductName']")
	WebElement productName;
	
	@FindBy(xpath="//select[@id='SearchCategoryId']")
	WebElement searchId;
	
	@FindBy(xpath="//input[@id='SearchIncludeSubCategories']")
	WebElement subcategories;
	
	@FindBy(xpath="//select[@id='SearchManufacturerId']")
	WebElement smanufactures;
	
	@FindBy(xpath="//select[@id='SearchVendorId']")
	WebElement vendor;
	
	@FindBy(xpath="//select[@id='SearchWarehouseId']")
	WebElement warehouse;
	
	@FindBy(xpath="//select[@id='SearchProductTypeId']")
	WebElement productType;
	
	@FindBy(xpath="//select[@id='SearchPublishedId']")
	WebElement publish;
	
	@FindBy(xpath="//input[@id='GoDirectlyToSku']")
	WebElement toSKU;
	
	@FindBy(xpath="//button[@id='go-to-product-by-sku']")
	WebElement bysku;
	
	@FindBy(xpath="//button[@id='search-products']")
	WebElement searchBtn;
	
//	@FindBy(xpath="//div[@class='dataTables_scrollHeadInner']"
//			+ "//table[@class='table table-bordered table-hover table-striped dataTable no-footer']"
//			+ "//th")
//	WebElement allcolumns;
//	
//	@FindBy(xpath="//div[@class='dataTables_scrollHeadInner']"
//			+ "//table[@class='table table-bordered table-hover table-striped dataTable no-footer']"
//			+ "//tr")
//	WebElement allrows;
	
	
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
//		addMenu.click();
//		Thread.sleep(2000);
//		backtolist.click();
//		productName.sendKeys("$100 Physical Gift Card");
//		Select category = new Select(searchId);
//		category.selectByValue("1");
//		subcategories.click();
//		Select manfacturer = new Select(smanufactures);
//		manfacturer.selectByValue("2");
//		Select vendors = new Select(vendor);
//		vendors.selectByVisibleText("Vendor 1");
//		Select wares = new Select(warehouse);
//		wares.selectByVisibleText("Warehouse 1 (New York)");
//		Select pt = new Select(productType);
//		pt.selectByVisibleText("Simple");
//		Select pub = new Select(publish);
//		pub.selectByValue("1");
//		toSKU.sendKeys("PG_CR_100");
//		bysku.click();	
		
		//WebTable data no of col;
		
		
//		List<WebElement> row_table = driver.findElements(By.xpath("//div[@class='dataTables_scrollBody']"
//				+ "//table[@class='table table-bordered table-hover table-striped dataTable no-footer']"
//				+ "//tbody//tr"));
//			int row_count = row_table.size();
//			System.out.println("No.of rows:"+row_count);
//
//			for(int row=1;row<row_count;row++){
//			List<WebElement> col_table = driver.findElements(By.xpath("//div[@class='dataTables_scrollBody']"
//						+ "//table[@class='table table-bordered table-hover table-striped dataTable no-footer']"
//						+ "//tbody//td"));
//				int col_count = col_table.size();
//				System.out.println("No.of cols:"+col_count);
//				System.out.println("Number of cells in Row "+row+"are"+col_count);
//				
//				for(int column=0; column<col_count;column++){
//				String celtext=	col_table.get(column).getText();
//				System.out.println("Cell Value of row number " + row + " and column number " + column + "Is"+celtext);
//				System.out.println("-------------------------------------------------- ");
//				
//				}
//			}
		//*[@id="products-grid"]/tbody/tr[1]/td[1]
		//*[@id="products-grid"]/tbody/tr[2]/td[1]
		//*[@id="products-grid"]/tbody/tr[15]/td[1]
		
		String before_check="//*[@id='products-grid']/tbody/tr[";
		String after_check =	"]/td[1]";
		
		String bpicture="//*[@id='products-grid']/tbody/tr[";
		String apicture = "]/td[2]";

		String bproductname="//*[@id='products-grid']/tbody/tr[";
		String aproductname =	"]/td[3]";
		
		String bsku="//*[@id='products-grid']/tbody/tr[";
		String asku =	"]/td[4]";
		
		String bprice="//*[@id='products-grid']/tbody/tr[";
		String aprice =	"]/td[5]";

		String bstock="//*[@id='products-grid']/tbody/tr[";
		String astock= "]/td[6]";
		
		String bproducttype="//*[@id='products-grid']/tbody/tr[";
		String aproducttype = "]/td[7]";

		String bpublish="//*[@id='products-grid']/tbody/tr[";
		String apublish =	"]/td[8]";
		
		String bedit="//*[@id='products-grid']/tbody/tr[";
		String aedit =	"]/td[9]";
		
		List<WebElement> rows = driver.findElements(By.xpath("//table[@class='table table-bordered table-hover table-striped dataTable no-footer']//tbody//tr"));
		System.out.println("Total no of rows:"+rows.size());
		int rowcount =rows.size();
		
		List<WebElement> columns = driver.findElements(By.xpath("//table[@class='table table-bordered table-hover table-striped dataTable no-footer']//tbody//td"));
		System.out.println("Total no of columns:"+columns.size());
		int colcount = rows.size();
		
		Xls_Reader reader = new Xls_Reader("G:/Workspace/NOPCommereceTest/ExcelData/CatalogProducts.xlsx");
	if(!reader.isSheetExist("TabelData")){
		reader.addSheet("TableData");
		reader.addColumn("TableData", "CheckBox");
		reader.addColumn("TableData", "Picture");
		reader.addColumn("TableData", "ProductName");
		reader.addColumn("TableData", "SKU");
		reader.addColumn("TableData", "Price");
		reader.addColumn("TableData", "Stockquantity");
		reader.addColumn("TableData", "ProductType");
		reader.addColumn("TableData", "Published");
		reader.addColumn("TableData", "Edit");
	}
		for(int i=2;i<=rowcount;i++){
		
		String actualPath= before_check+i+after_check;
		String checkbox = driver.findElement(By.xpath(actualPath)).getText();
		System.out.println(checkbox);
		reader.setCellData("TableData", "CheckBox", i, checkbox);
		
		String actualpicture= bpicture+i+apicture;
		String picture = driver.findElement(By.xpath(actualpicture)).getText();
		System.out.println(checkbox);
		reader.setCellData("TableData", "Picture", i, picture);
		
		String actualPath1= bproductname+i+aproductname;
		String productname = driver.findElement(By.xpath(actualPath1)).getText();
		System.out.println(productname);
		reader.setCellData("TableData", "ProductName", i, productname);
				
		
		String actualPath2= bsku+i+asku;
		String sku = driver.findElement(By.xpath(actualPath2)).getText();
		System.out.println(sku);
		reader.setCellData("TableData", "SKU", i, sku);
		
		String actualPath3= bprice+i+aprice;
		String price = driver.findElement(By.xpath(actualPath3)).getText();
		System.out.println(price);
		reader.setCellData("TableData","Price", i, price);
		
		String actualPath4= bstock+i+astock;
		String stock = driver.findElement(By.xpath(actualPath4)).getText();
		System.out.println(stock);
		reader.setCellData("TableData", "Stockquantity", i, stock);
		
		String actualPath5= bproducttype+i+aproducttype;
		String producttype = driver.findElement(By.xpath(actualPath5)).getText();
		System.out.println(producttype);
		reader.setCellData("TableData", "ProductType", i, producttype);
		
		String actualPath6= bpublish+i+apublish;
		String publish = driver.findElement(By.xpath(actualPath6)).getText();
		System.out.println(publish);
		reader.setCellData("TableData", "Published", i, publish);
		
		String actualPath7= bedit+i+aedit;
		String edit = driver.findElement(By.xpath(actualPath7)).getText();
		System.out.println(edit);
		reader.setCellData("TableData", "Edit", i, edit);
		
		}
		}
	
	
	public void clickOnCategoriesMenu() throws Exception{
		catalogLabel.click();
		Thread.sleep(2000);
		Actions builder = new Actions(driver);
		builder.moveToElement(categoriesMenu).build().perform();
		categoriesMenu.click();
		Thread.sleep(2000);
		
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
		Thread.sleep(2000);
		Actions builder1 = new Actions(driver);
		builder1.moveToElement(productAttribute).build().perform();
		productAttribute.click();
	}
	
	public void clickOnSpecificationAttributeMenu() throws Exception{
		catalogLabel.click();
		Thread.sleep(2000);
		Actions builder = new Actions(driver);
		builder.moveToElement(AttributeLabel).build().perform();
		AttributeLabel.click();
		Thread.sleep(2000);
		Actions builder1 = new Actions(driver);
		builder1.moveToElement(specificationAttribute).build().perform();
		specificationAttribute.click();
	}
	
	public void clickOnCheckOutMenu() throws Exception{
		catalogLabel.click();
		Thread.sleep(2000);
		Actions builder = new Actions(driver);
		builder.moveToElement(AttributeLabel).build().perform();
		AttributeLabel.click();
		Actions builder1 = new Actions(driver);
		builder1.moveToElement(checkoutAttribute).build().perform();		
		checkoutAttribute.click();
	}

}
