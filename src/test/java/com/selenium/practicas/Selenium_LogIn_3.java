package com.selenium.practicas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Selenium_LogIn_3 {
	
	public static WebDriver driver = null;
	
	@Test(priority=0)
	public void logIn() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\asepulveda\\eclipse-workspace\\SeleniumPractica\\src\\test\\resources\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(3000);
		
		driver.navigate().back();
		
		WebElement usuario = driver.findElement(By.id("user-name"));
		usuario.sendKeys("standard_user");
		
		WebElement contrasena = driver.findElement(By.id("password"));
		contrasena.sendKeys("secret_sauce");
		Thread.sleep(3000);
		
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(3000);
	}
	
	@Test(priority=1)
	public void compararTitulo() 
	{
		String tituloActual = driver.getTitle();
		String tituloEsperado = "Swag Labs";
		Assert.assertEquals(tituloEsperado, tituloActual);
		driver.quit();
	}

}
