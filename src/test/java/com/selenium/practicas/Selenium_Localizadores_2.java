package com.selenium.practicas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Selenium_Localizadores_2 {
	
	public static WebDriver driver = null;
	
	@Test
	public void localizadores() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\asepulveda\\eclipse-workspace\\SeleniumPractica\\src\\test\\resources\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		
		driver.findElement(By.id("user-name")).sendKeys("PorID");
		driver.findElement(By.id("password")).sendKeys("PorID");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"user-name\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("PorXPath");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("PorXPath");
		Thread.sleep(3000);
		
		driver.findElement(By.name("user-name")).clear();
		driver.findElement(By.name("user-name")).sendKeys("PorNombre");
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys("PorNombre");
		Thread.sleep(3000);
		driver.quit();
	}

}
