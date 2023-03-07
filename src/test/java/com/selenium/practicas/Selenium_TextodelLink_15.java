package com.selenium.practicas;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Selenium_TextodelLink_15 {
	
public static WebDriver driver = null;
	
	@Test(priority=0)
	public void ingresar() throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\asepulveda\\eclipse-workspace\\SeleniumPractica\\src\\test\\resources\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.bbc.com/mundo");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	@Test(priority=1)
	public void textoDelLink()
	{
		List<WebElement> listaLinks = driver.findElements(By.tagName("a"));
		for (WebElement link : listaLinks)
		{
			System.out.println("Link: " + link.getText());
		}
	}
	
	@Test(priority=2)
	public void quit()
	{
		driver.quit();
	}

}
