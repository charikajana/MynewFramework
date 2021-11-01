package com.sabre.atuomation.webdriverutils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverUtils {
	
	public static void main(String[] args) {
		/**
		 * 
		 * String Projectpath=System.getProperty("user.dir");			
		   System.setProperty("webdriver.chrome.driver",Projectpath+"\\src\\main\\resources\\drivers\\chromedriver.exe");
		 */			  
		  System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\main\\resources\\drivers\\chromedriver.exe");  
		  WebDriver driver = new ChromeDriver(); 
		  driver.manage().window().maximize();
		  driver.get("http://www.testyou.in/Login.aspx");
		 
	}
	
	
	

}
