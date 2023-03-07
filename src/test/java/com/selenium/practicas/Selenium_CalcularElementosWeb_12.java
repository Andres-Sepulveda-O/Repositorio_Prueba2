package com.selenium.practicas;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Selenium_CalcularElementosWeb_12 {
	
public static WebDriver driver = null;
	
	@Test(priority=0)
	public void ingresar() throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\asepulveda\\eclipse-workspace\\SeleniumPractica\\src\\test\\resources\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://facebook.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	@Test(priority=1)
	public void contarElementos()
	{
		List<WebElement> elementoDiv =  driver.findElements(By.tagName("div"));
		System.out.println("La cantidad de divs es " + elementoDiv.size());
		
		List<WebElement> elementoLinks = driver.findElements(By.tagName("a"));
		for (WebElement link: elementoLinks)
		{
			System.out.println("Link: " + link.getText());
		}
		
		List<WebElement> elementoBtn = driver.findElements(By.tagName("button"));
		System.out.println("La pagina contiene " + elementoBtn.size() + " botones");
		
		for(WebElement btn: elementoBtn)
		{
			System.out.println("Boton: " + btn.getText());
		}
	}
	
	@Test(priority=2)
	public void quit()
	{
		driver.quit();
	}

}
