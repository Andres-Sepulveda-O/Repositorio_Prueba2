package com.selenium.practicas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
//Corregir este mugrero
public class TestNG_Parametros_8 {

	public static WebDriver driver = null;
	@Parameters({ "username", "password"})
	@Test()
	public void checkLogin(String username, String password)
	{
		driver.get("https://accounts.lambdatest.com/login");
	    driver.findElement(By.xpath("//input[@name='email']")).sendKeys(username);
	    driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
	    driver.findElement(By.xpath("//*[@id='app']/section/form/div/div/button")).click();
	    System.out.println("The login process on lamdatest is completed");
	}

}
