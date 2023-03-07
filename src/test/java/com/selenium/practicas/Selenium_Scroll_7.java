package com.selenium.practicas;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Selenium_Scroll_7 {
	
	public static WebDriver driver = null;

	@Test(priority=0)
	public void logIn() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\asepulveda\\eclipse-workspace\\SeleniumPractica\\src\\test\\resources\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com.mx");
		Thread.sleep(3000);
	}
	@Test(priority=1)
	public void scroll() throws InterruptedException
	{
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Laptop dell");
		Actions accion = new Actions(driver);
		accion.sendKeys(Keys.ENTER).perform();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("scrollBy(0, 2500)");
		
		Thread.sleep(5000);
	}
	@Test(priority=2)
	public void cerrar()
	{
		driver.quit();
	}

}
