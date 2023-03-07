package com.selenium.practicas;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Selenium_TitulodelSitio_14 {

public static WebDriver driver = null;
	
	@Test(priority=0)
	public void ingresar() throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\asepulveda\\eclipse-workspace\\SeleniumPractica\\src\\test\\resources\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://spotify.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	@Test(priority=1)
	public void spotifyTitle()
	{
		String titulo = driver.getTitle();
		
		if(titulo.equals("Escuchar es todo - Spotify"))
		{
			System.out.println("Prueba pasada!!!");
		}
		else
		{
			System.out.println(titulo);
			System.out.println("Prueba fallada!!!");
		}
	}
	
	@Test(priority=2)
	public void quit()
	{
		driver.quit();
	}
}
