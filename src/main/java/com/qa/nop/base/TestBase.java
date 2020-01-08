package com.qa.nop.base;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.qa.nop.utility.TestUtility;

public class TestBase {
	//class variables
	public static WebDriver driver;
	public static Properties prop;
	//constructor
	public TestBase(){
		prop = new Properties();
		try{
			FileInputStream fis = new FileInputStream("G:/Workspace/NOPCommereceTest/src"
					+ "/main/java/com/qa/nop/properties/Config.properties ");
			prop.load(fis);
				
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
	}
	//Method
	public void intialization(){
		String browserName =prop.getProperty("browser");
		if(browserName.equals("chrome")){
			System.setProperty("webdriver.chrome.driver", "D:/Java/chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browserName.equals("firefox")){
			System.setProperty("webdriver.gecko.driver", "D:/Java/geckodriver.exe");
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtility.PageLoadTimeOut, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtility.PageLoadTimeOut, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));		
		
	}
	

}
