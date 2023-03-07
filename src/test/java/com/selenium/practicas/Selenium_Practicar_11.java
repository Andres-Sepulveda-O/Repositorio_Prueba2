package com.selenium.practicas;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Selenium_Practicar_11 {
	
public static WebDriver driver;
	
	@Test(priority=0)
	public void ingresar() throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\asepulveda\\eclipse-workspace\\SeleniumPractica\\src\\test\\resources\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	@Test(priority=1)
	public void signUp() throws InterruptedException
	{
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.id("email_create")).sendKeys("maildeprueba9@hotmail.com");
		driver.findElement(By.xpath("//*[@id=\"SubmitCreate\"]/span")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.id("id_gender1")).click();
		driver.findElement(By.id("customer_firstname")).sendKeys("Prueba First Name");
		driver.findElement(By.id("customer_lastname")).sendKeys("Prueba Last Name");
		driver.findElement(By.id("passwd")).sendKeys("Password12345");

		Select day = new Select(driver.findElement(By.id("days")));
		day.selectByValue("8");
		
		Select month = new Select(driver.findElement(By.id("months")));
		month.selectByValue("4");
		
		Select year = new Select(driver.findElement(By.id("years")));
		year.selectByValue("1996");
		
		driver.findElement(By.id("newsletter")).click();
		driver.findElement(By.id("optin")).click();
		
		
		driver.findElement(By.id("firstname")).sendKeys("Melodias");
		driver.findElement(By.id("lastname")).sendKeys("De la rosa");
		driver.findElement(By.id("company")).sendKeys("Empresa Pirata SA de CV");
		driver.findElement(By.id("address1")).sendKeys("Gonzalitos 409 oriente");
		driver.findElement(By.id("city")).sendKeys("Cadereyta Jimenez");
		
		Select estado = new Select(driver.findElement(By.id("id_state")));
		estado.selectByValue("43");
		driver.findElement(By.id("postcode")).sendKeys("67480");
		Select pais = new Select(driver.findElement(By.id("id_country")));
		pais.selectByValue("21");
		
		driver.findElement(By.id("phone_mobile")).sendKeys("828 0391 430");
		driver.findElement(By.id("alias")).sendKeys("Calle patito 120");
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("submitAccount")).click();
		
		Thread.sleep(3000);
	}
	
	@Test(priority=2)
	public void quit()
	{
		driver.quit();
	}

}
