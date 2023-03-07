package com.selenium.practicas;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Selenium_ClickDerecho_5 {
	
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
	}
	@Test(priority=1)
	public void clickDerecho() throws InterruptedException
	{
		Actions accion = new Actions(driver);
		WebElement elemento = driver.findElement(By.xpath("//*[@id=\"page_wrapper\"]/footer/ul/li[2]/a"));
		accion.contextClick(elemento).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
		Thread.sleep(5000);
	}
	@Test(priority=2)
	public void cerrar()
	{
		driver.quit();
	}

}
