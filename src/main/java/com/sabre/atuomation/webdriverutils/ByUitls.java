package com.sabre.atuomation.webdriverutils;

import org.openqa.selenium.By;

public class ByUitls {
	
	public static By getByObject(String KeyValue) {
		By by=null;
		String s=PropertyUitls.getdesiredproperty(KeyValue);		
		String[] sarry=s.split(";");
		String bylocator=sarry[0];
		String byvalue=sarry[1];	
		if(bylocator.toUpperCase().equalsIgnoreCase("XPATH")) {
			by=By.xpath(byvalue);
		}else if(bylocator.toUpperCase().equalsIgnoreCase("ID")) {
			by=By.id(byvalue);
		}else if(bylocator.toUpperCase().equalsIgnoreCase("NAME")) {
			by=By.name(byvalue);
		}else if(bylocator.toUpperCase().equalsIgnoreCase("linkText")) {
			by=By.linkText(byvalue);			
		}else if(bylocator.toUpperCase().equalsIgnoreCase("partialLinkText")) {
			by=By.partialLinkText(byvalue);			
		}else if(bylocator.toUpperCase().equalsIgnoreCase("cssSelector")) {
			by=By.cssSelector(byvalue);
		}
		return by;
	}

	

}
