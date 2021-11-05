package com.sabre.atuomation.webdriverutils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.ProfilesIni;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

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

	public static WebDriver getdesiredsslcertificateBrowser(String browsername) {
		if (browsername.equalsIgnoreCase("CHROME")) {
			driver = BrowserFactory.sslCertifcate();
		} else if (browsername.equalsIgnoreCase("EDGE")) {
			driver = BrowserFactory.sslcertificate1();
		} else if (browsername.equalsIgnoreCase("IE")) {
			driver = BrowserFactory.sslcertificate2();

		} else if (browsername.equalsIgnoreCase("FIREFOX")) {
			BrowserFactory.sslcertificate3();

		}
		return driver;

	}

	public static WebDriver sslCertifcate() {
		System.setProperty("WebDriver.chrome.driver",
				System.getProperty("user.dir") + "\\src\\main\\resources\\drivers\\chromedriver.exe");

		ChromeOptions chromeoptions = new ChromeOptions();
		chromeoptions.setAcceptInsecureCerts(true);
		driver = new ChromeDriver(chromeoptions);
		driver.manage().window().maximize();

		return driver;
	}

	public static WebDriver sslcertificate1() {
		System.setProperty("WebDriver.edge.driver",
				System.getProperty("user.dir") + "\\src\\main\\resources\\drivers\\msedgedriver.exe");
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://expired.badssl.com/");
		driver.findElement(By.id("details-button")).click();
		driver.findElement(By.id("proceed-link")).click();
		return driver;

	}

	public static WebDriver sslcertificate2() {
		System.setProperty("webdriver.ie.driver",
				System.getProperty("user.dir") + "\\src\\main\\resources\\drivers\\IEDriverServer.exe");
		driver = new InternetExplorerDriver();
		driver.manage().window().maximize();
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		driver.get("https://expired.badssl.com/");
		return driver;
	}

	public static WebDriver sslcertificate3() {
		System.setProperty("webdriver.firefox.driver",
				System.getProperty("user.dir") + "\\src\\main\\resources\\drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		ProfilesIni prof = new ProfilesIni();
		FirefoxProfile ffProfile = prof.getProfile("myProfile");
		driver.get("https://expired.badssl.com/");
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
		System.setProperty("webdriver.edge.driver",
				System.getProperty("user.dir") + "\\src\\main\\resources\\drivers\\msedgedriver.exe");
		driver = new EdgeDriver();
		driver.manage().window().maximize();

		return driver;
	}

	public WebDriver getIEBrowser() {
		System.setProperty("webdriver.ie.driver",
				System.getProperty("user.dir") + "\\src\\main\\resources\\drivers\\IEDriverServer.exe");
		driver = new InternetExplorerDriver();
		driver.manage().window().maximize();

		return driver;
	}

	public WebDriver getFirefoxBrowser() {
		System.setProperty("webdriver.firefox.driver",
				System.getProperty("user.dir") + "\\src\\main\\resources\\drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();

		return driver;
	}

}
