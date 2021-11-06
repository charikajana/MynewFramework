package com.sabre.atuomation.webdriverutils;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class PropertyUitls {

	public static Properties prop;

	public static String loadallProperties(String Keyvalue) {
		if (prop == null) {
			prop = new Properties();
			try {
				File filearray = new File(System.getProperty("user.dir") + "\\src\\test\\resources\\Locators\\");
				File[] file = filearray.listFiles();
				for (int i = 0; i < file.length; i++) {
					File f = file[i];
					FileInputStream fi = new FileInputStream(f);
					prop.load(fi);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		String PropertyName = prop.getProperty(Keyvalue);
		return PropertyName;

	}

	public static String getdesiredproperty(String Keyvalue) {
		/*
		 * String value=loadallProperties(Keyvalue); return value;
		 */
		return loadallProperties(Keyvalue);
	}


}
