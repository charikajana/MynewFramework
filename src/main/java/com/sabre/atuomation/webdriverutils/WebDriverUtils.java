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

	public WebElement MyOwn_FindElement_method(String Keyvalue) {
		By by=ByUitls.getByObject(Keyvalue);
		//by= By.id("sdjfjsdfsklfj");
		WebElement wbelement = getcurrentdriver().findElement(by);
		return wbelement;
	}
	
	public void MyOwn_Click(String Keyvalue) {
		WebElement wb=MyOwn_FindElement_method(Keyvalue);
		wb.click();		

	}
	
	public void MyOwn_SendKeys(String Keyvalue,String value) {
		WebElement wb=MyOwn_FindElement_method(Keyvalue);
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
	
	public void MyOwn_SelectByVisibleText(String Keyvalue,String visibletext) {
		WebElement wb=MyOwn_FindElement_method(Keyvalue);
		Select sel=new Select(wb);
		sel.selectByVisibleText(visibletext);		
	}
	public void MyOwn_SelectByIndex(String Keyvalue,int Indexnumber) {
		WebElement wb=MyOwn_FindElement_method(Keyvalue);
		Select sel=new Select(wb);
		sel.selectByIndex(Indexnumber);	
	}
	
	public void MyOwn_SelectByValue(String Keyvalue,String value) {
		WebElement wb=MyOwn_FindElement_method(Keyvalue);
		Select sel=new Select(wb);
		sel.selectByValue(value);
	}
	
	public boolean MyOwn_isEnabled(String Keyvalue) {
		WebElement wb=MyOwn_FindElement_method(Keyvalue);
		boolean flag=wb.isEnabled();
		return flag;
	}
	
	public boolean MyOwn_isSelected(String Keyvalue) {
		WebElement wb=MyOwn_FindElement_method(Keyvalue);
		boolean flag=wb.isSelected();
		return flag;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
