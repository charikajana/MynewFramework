package com.sabre.atuomation.webdriverutils;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class WebDriverUtils {

	static WebDriver driver;

	public WebDriver getcurrentdriver() {
		if (driver == null) {
			driver = BrowserFactory.getdesiredbrowser("CHROME");
		}
		return driver;
	}

	public void launchURL(String URL) {
		driver = getcurrentdriver();
		driver.get(URL);
	}

	public WebElement MyOwn_FindElement_method(By by) {
		WebElement wbelement = getcurrentdriver().findElement(by);
		return wbelement;
	}
	
	public void MyOwn_Click(By by) {
		WebElement wb=MyOwn_FindElement_method(by);
		wb.click();		
		//MyOwn_FindElement_method(by).click();		
	}
	
	public void MyOwn_SendKeys(By by,String value) {
		WebElement wb=MyOwn_FindElement_method(by);
		wb.sendKeys(value);
	}

	public List<WebElement> MyOwn_FindElements_mehotd(By by) {
		List<WebElement> wbelements = getcurrentdriver().findElements(by);
		return wbelements;
				
		//return getcurrentdriver().findElements(by);

	}
		
	public String MyOwn_getCurrentURL() {
		String currentURL=getcurrentdriver().getCurrentUrl();
		return currentURL;
		
	}
	
	public String MyOwn_getpageTitel() {
		String title=getcurrentdriver().getTitle();
		return title;
	}
	
	public String MyOwn_getPageSource() {
		String pagesource=getcurrentdriver().getPageSource();
		return pagesource;
	}
	
	public void MyOwn_SelectByVisibleText(By by,String visibletext) {
		WebElement wb=MyOwn_FindElement_method(by);
		Select sel=new Select(wb);
		sel.selectByVisibleText(visibletext);		
	}
	public void MyOwn_SelectByIndex(By by,int Indexnumber) {
		WebElement wb=MyOwn_FindElement_method(by);
		Select sel=new Select(wb);
		sel.selectByIndex(Indexnumber);	
	}
	
	public void MyOwn_SelectByValue(By by,String value) {
		WebElement wb=MyOwn_FindElement_method(by);
		Select sel=new Select(wb);
		sel.selectByValue(value);
	}
	
	public boolean MyOwn_isEnabled(By by) {
		WebElement wb=MyOwn_FindElement_method(by);
		boolean flag=wb.isEnabled();
		return flag;
	}
	
	public boolean MyOwn_isSelected(By by) {
		WebElement wb=MyOwn_FindElement_method(by);
		boolean flag=wb.isSelected();
		return flag;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
