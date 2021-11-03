package com.sabre.automation.testpackage;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.sabre.atuomation.webdriverutils.WebDriverUtils;

public class TestYou {

	public static void main(String[] args) {
		WebDriverUtils webdriverutils=new WebDriverUtils();
		webdriverutils.launchURL("http://www.testyou.in/Login.aspx");
		WebElement wbelement=webdriverutils.MyOwnFindElementmethod(By.xpath("login"));
		wbelement.sendKeys("");
		wbelement.click();

		

	}
	
	
	

}
