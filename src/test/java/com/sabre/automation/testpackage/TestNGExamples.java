package com.sabre.automation.testpackage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGExamples {
	
	@BeforeClass
	public void beforeclassTestng() {
		System.out.println("Cars Before Class");
	}
	
	@AfterClass
	public void afterclasstestng() {
		System.out.println("Cars After Class");
	}

	@BeforeMethod
	public void carsbeforemethod() {
		System.out.println("Cars Before Method");

	}

	@Test
	public void MYserstmethod() {
		System.out.println("First");
	}

	@Test
	public void Mysecondmethod() {
		System.out.println("Second");
	}

	@AfterMethod
	public void carsaftermethod() {
		System.out.println("Cars After Method");
	}

	@Test
	public void MYthirdmethod() {
		System.out.println("Thrid");
	}

	@Test
	public void Myfourthmethod() {
		System.out.println("fourth");
	}
	
	


}
