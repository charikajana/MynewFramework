package com.sabre.atuomation.webdriverutils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserFactory {

	static WebDriver driver;

	
	
	
	
	public static WebDriver getdesiredbrowser(String browserName) {
		BrowserFactory bf = new BrowserFactory();
		if (browserName.equalsIgnoreCase("CHROME")) {
			driver = bf.getChromeBrowser();
		} else if (browserName.equalsIgnoreCase("EDGE")) {
			driver = bf.getEdgeBrowser();
		} else if (browserName.equalsIgnoreCase("FIREFOX")) {
			driver = bf.getFirefoxBrowser();
		} else if (browserName.equalsIgnoreCase("IE")) {
			driver = bf.getIEBrowser();
		}
		return driver;

	}

	public WebDriver getChromeBrowser() {
		
		
		
		
		
		
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\src\\main\\resources\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		return driver;
	}

	public WebDriver getEdgeBrowser() {
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\src\\main\\resources\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		return driver;
	}

	public WebDriver getIEBrowser() {
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\src\\main\\resources\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		return driver;
	}

	public WebDriver getFirefoxBrowser() {
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\src\\main\\resources\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		return driver;
	}

}
