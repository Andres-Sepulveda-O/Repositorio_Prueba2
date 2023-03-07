package com.selenium.practicas;

import org.testng.annotations.Factory;
import org.testng.annotations.Test;

//This annotation helps to run multiple test classes through a single test class. It basically defines and create tests dynamically.


//no entiendo
public class TestNG_Factory_7 {
	
	@Test
	public void testMethod1() 
	{
		System.out.println("This is to test for method 1 for Factor Annotation");
	}
	
	@Test
	public void testMethod2()
	{
		System.out.println("This is to test for method 2 for Factor Annotation");
	}
	
	@Factory()
	@Test
	public Object[] getTestFactoryMethod() 
	{
		Object[] factoryTest = new Object[2];
        factoryTest[0] = new TestNG_Factory_7();
        return factoryTest;
	}

}
