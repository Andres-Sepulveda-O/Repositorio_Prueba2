package com.selenium.practicas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Selenium_CheckOutValidacion_9 {
	
	
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
	public void agregarCarrito() throws InterruptedException
	{
		//En este ejercicio filtraremos los productos de Z a la A, agregaremos 3 productos, presionaremos el carrito y luego removeremos un producto desde el carrito, procederemos a hacer el check out y validaremos texto de checkout.
		WebElement dropDownMenu = driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div[2]/span/select"));
		Select dropMenu = new Select(dropDownMenu);
		dropMenu.selectByValue("za");
		Thread.sleep(3000);
		
		driver.findElement(By.id("add-to-cart-test.allthethings()-t-shirt-(red)")).click();
		driver.findElement(By.id("add-to-cart-sauce-labs-onesie")).click();
		driver.findElement(By.id("add-to-cart-sauce-labs-fleece-jacket")).click();
		
		driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("remove-test.allthethings()-t-shirt-(red)")).click();
		Thread.sleep(3000);	
		
	}
	@Test(priority=2)
	public void checkOut() throws InterruptedException
	{
		driver.findElement(By.id("checkout")).click();
		driver.findElement(By.id("first-name")).sendKeys("Prueba First Name");
		driver.findElement(By.id("last-name")).sendKeys("Prueba Last Name");
		driver.findElement(By.id("postal-code")).sendKeys("67480");
		Thread.sleep(3000);
		
		driver.findElement(By.id("continue")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.id("finish")).click();
		Thread.sleep(3000);
		
        String verificarTexto = driver.findElement(By.xpath("//*[@id=\"checkout_complete_container\"]/h2")).getText();

        if(verificarTexto.equals("THANK YOU FOR YOUR ORDER")) 
        {
        	System.out.println("Texto THANK YOU FOR YOUR ORDER encontrado");
        }
        else 
        {
        	System.out.println("Texto no encontrado");
        }
        driver.findElement(By.id("back-to-products")).click();
        Thread.sleep(2000);
	}
	
	@Test(priority=3)
	public void quit()
	{
		driver.quit();
	}

}
