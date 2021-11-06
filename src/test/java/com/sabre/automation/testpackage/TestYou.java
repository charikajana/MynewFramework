package com.sabre.automation.testpackage;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.sabre.atuomation.webdriverutils.ByUitls;
import com.sabre.atuomation.webdriverutils.PropertyUitls;
import com.sabre.atuomation.webdriverutils.WebDriverUtils;

public class TestYou {

	public static void main(String[] args) {
		TestYou testyou=new TestYou();
		testyou.mesecond();
		
		
		

		PropertyUitls.getdesiredproperty("com.sabre.atuomation.CreateAccountPage.Name");
		
		

	}
	
	
	public void mesecond() {
		WebDriverUtils webdriverutils=new WebDriverUtils();
		webdriverutils.MyOwn_getpageTitel();
		
		
	}
	
	public void myfirst() {
		WebDriverUtils webdriverutils=new WebDriverUtils();
		webdriverutils.launchURL("http://www.testyou.in/Login.aspx");
		//WebElement wbelement=webdriverutils.MyOwn_FindElement_method(By.id("com.sabre.atuomation.CreateAccountPage.Name"));
		//WebElement wbelement=webdriverutils.MyOwn_FindElement_method(ByUitls.getByObject("com.sabre.atuomation.CreateAccountPage.Name"));
		WebElement wbelement=webdriverutils.MyOwn_FindElement_method("com.sabre.atuomation.CreateAccountPage.Name");
		List<WebElement> webElements=webdriverutils.MyOwn_FindElements_mehotd(By.xpath("com.sabre.atuomation.LoginPage.Name"));
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
		webdriverutils.MyOwn_SelectByVisibleText("com.sabre.atuomation.ForgetpasswordPage.Name", "6");
		webdriverutils.MyOwn_SelectByIndex("com.sabre.atuomation.CreateAccountPage.Login", 6);
		webdriverutils.MyOwn_SelectByValue("com.sabre.atuomation.CreateAccountPage.Login", "4");
		
		
		//click
		webdriverutils.MyOwn_Click("com.sabre.atuomation.CreateAccountPage.Login");
		
		//sendKeys
		webdriverutils.MyOwn_SendKeys("com.sabre.atuomation.CreateAccountPage.Login", "Sirisha");
		
		//is Enabled
		boolean flag=webdriverutils.MyOwn_isEnabled("com.sabre.atuomation.CreateAccountPage.Login");
		if(flag) {
			System.out.println("Test Case Pass");
		}else {
			System.out.println("Test Case Fail");
		}
		
		
		boolean flag1=webdriverutils.MyOwn_isSelected("com.sabre.atuomation.CreateAccountPage.Login");
		if(flag1) {
			System.out.println("Test Case Pass");
		}else {
			System.out.println("Test Case Fail");
		}

		

		
		
		wbelement.sendKeys("");
		wbelement.click();
	}
	
	
	

}
