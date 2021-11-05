package com.sabre.automation.testpackage;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.sabre.atuomation.webdriverutils.WebDriverUtils;

public class TestYou {

	public static void main(String[] args) {
		TestYou testyou=new TestYou();
		testyou.mesecond();
		

	}
	
	
	public void mesecond() {
		WebDriverUtils webdriverutils=new WebDriverUtils();
		webdriverutils.MyOwn_getpageTitel();
	}
	
	public void myfirst() {
		WebDriverUtils webdriverutils=new WebDriverUtils();
		webdriverutils.launchURL("http://www.testyou.in/Login.aspx");
		WebElement wbelement=webdriverutils.MyOwn_FindElement_method(By.xpath("login"));
		List<WebElement> webElements=webdriverutils.MyOwn_FindElements_mehotd(By.xpath("login"));
		int k=webElements.size();
		for(int i=0;i<k;i++) {
			WebElement wb=webElements.get(i);
			wb.clear();
			wb.sendKeys("");
			
			
			if(wb.isEnabled()) {
				wb.click();
				System.out.println("Test case Pass");
			}else {
				System.out.println("Test case Fail");
			}
			break;
		}
		
		
		//getCurrentURL
		String currentURL=webdriverutils.MyOwn_getCurrentURL();
		if(currentURL.equalsIgnoreCase("https://")) {
			System.out.println("Test Case Pass");
		}else {
			System.out.println("Test Case Fail");
		}
		
		
		//get title
		String title=webdriverutils.MyOwn_getpageTitel();
		if(title.equalsIgnoreCase("")) {
			System.out.println("Test Case Pass");
		}else {
			System.out.println("Test Case Fail");
		}
		
		
		//get pagesource
		String pagesource=webdriverutils.MyOwn_getPageSource();
		if(pagesource.contains("")) {
			System.out.println("Test Case Pass");
		}else {
			System.out.println("Test Case Fail");
		}
		
		//select 
		webdriverutils.MyOwn_SelectByVisibleText(By.xpath("login"), "6");
		webdriverutils.MyOwn_SelectByIndex(By.xpath("login"), 6);
		webdriverutils.MyOwn_SelectByValue(By.xpath("login"), "4");
		
		
		//click
		webdriverutils.MyOwn_Click(By.xpath("login"));
		
		//sendKeys
		webdriverutils.MyOwn_SendKeys(By.xpath("login"), "Sirisha");
		
		//is Enabled
		boolean flag=webdriverutils.MyOwn_isEnabled(By.xpath("login"));
		if(flag) {
			System.out.println("Test Case Pass");
		}else {
			System.out.println("Test Case Fail");
		}
		
		
		boolean flag1=webdriverutils.MyOwn_isSelected(By.xpath("login"));
		if(flag1) {
			System.out.println("Test Case Pass");
		}else {
			System.out.println("Test Case Fail");
		}

		

		
		
		wbelement.sendKeys("");
		wbelement.click();
	}
	
	
	

}
