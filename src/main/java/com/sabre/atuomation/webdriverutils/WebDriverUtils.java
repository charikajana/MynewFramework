package com.sabre.atuomation.webdriverutils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

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
		
		//we can write in single line as below
		//getcurrentdriver().get(URL);

	}
	
	public WebElement MyOwnFindElementmethod(By by) {		
		WebElement wbelement=getcurrentdriver().findElement(by);
		return wbelement;
	}
	
	
	
	

}
