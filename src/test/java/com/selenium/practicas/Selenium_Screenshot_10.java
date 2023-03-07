package com.selenium.practicas;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Selenium_Screenshot_10 {
	
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
	public void screenshot() throws IOException 
	{
		//take Screenshot
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("./screenshot.png"));
				
		//take Element Screenshot
		WebElement elementScreenshot = driver.findElement(By.cssSelector("#header_container > div.header_secondary_container > div.peek"));
		File scrFileElement = elementScreenshot.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFileElement, new File("./element.png"));
	}
	
	@Test(priority=2)
	public void quit()
	{
		driver.quit();
	}

}
