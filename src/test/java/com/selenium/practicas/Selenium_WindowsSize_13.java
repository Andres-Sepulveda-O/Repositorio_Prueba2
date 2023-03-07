package com.selenium.practicas;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Selenium_WindowsSize_13 {
	
public static WebDriver driver = null;
	
	@Test(priority=0)
	public void ingresar() throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\asepulveda\\eclipse-workspace\\SeleniumPractica\\src\\test\\resources\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://google.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	@Test(priority=1)
	public void windowsSize()
	{
		int altura = driver.manage().window().getSize().getHeight();
		int ancho = driver.manage().window().getSize().getWidth();
		
		System.out.println("El largo actual es " + altura);
		System.out.println("El ancho actual es " + ancho);
		
		Dimension dimension = new Dimension(1024,768);
		driver.manage().window().setSize(dimension);
		System.out.println("Actualizando el largo y ancho de la pagina...");
		
		altura = driver.manage().window().getSize().getHeight();
		ancho = driver.manage().window().getSize().getWidth();
		
		System.out.println("El largo actual es " + altura);
		System.out.println("El ancho actual es " + ancho);
		
	}
	
	@Test(priority=2)
	public void quit()
	{
		driver.quit();
	}

}
