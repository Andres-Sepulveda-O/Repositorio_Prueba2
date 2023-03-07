package com.selenium.practicas;

import org.openqa.selenium.Platform;
import org.testng.annotations.DataProvider;

/* This annotated method is used for supplying data to the test method in which the dataProvider attribute is defined. 
 * This annotated method helps in creating a data driven framework where multiple sets of input values can be given which returns a 2D array or object. 
 * @DataProvider annotation in TestNG comes with two attributes.

name- this attribute is used to provide name to the dataprovider. If not set it defaults to the name of the method provided.

parallel- this is one attribute that helps in running your tests in parallel with different variation of data. 
This attribute is one of the reasons to make TestNG more powerful to Junit. Its default value is false.*/

public class TestNG_DataProvider_6 {
	
	@DataProvider(name="SetEnvironment", parallel=true)
	public Object[][] getData(){
	 
	Object[][] browserProperty = new Object[][]{
	 
	 
	{Platform.WIN8, "chrome", "70.0"},
	{Platform.WIN8, "chrome", "71.0"}
	};
	return browserProperty;
	 
	}

}
