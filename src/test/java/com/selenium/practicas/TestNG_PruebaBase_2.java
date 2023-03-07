package com.selenium.practicas;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TestNG_PruebaBase_2 {

	@BeforeSuite
	public void setUp() {
		
		System.out.println("Initializing Everything !!!");
	}
	
	@AfterSuite
	public void tearDown() {
		
		System.out.println("Quitting Everything !!!");
	}
}
