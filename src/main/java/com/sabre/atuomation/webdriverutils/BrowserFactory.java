package com.sabre.atuomation.webdriverutils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

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
				System.getProperty("user.dir") + "\\src\\main\\resources\\drivers\\msedgedriver.exe");
		driver = new EdgeDriver();
		driver.manage().window().maximize();

		return driver;
	}

	public WebDriver getIEBrowser() {
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\src\\main\\resources\\drivers\\IEDriverServer.exe");
		driver = new InternetExplorerDriver();
		driver.manage().window().maximize();

		return driver;
	}

	public WebDriver getFirefoxBrowser() {
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\src\\main\\resources\\drivers\\chromedriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();

		return driver;
	}

}
