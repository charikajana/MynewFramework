package com.sabre.atuomation.webdriverutils;

import org.openqa.selenium.WebDriver;

public class WebDriverUtils {
	
	static WebDriver driver;
	
	
	
	public static void main(String[] args) {
		driver=BrowserFactory.getdesiredbrowser("FIREFOX");
		driver.get("http://www.testyou.in/Login.aspx");
	
	}
	


}
