package ejerciciosSelenium;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Ejercicio_3 {
	
	/* 1. Abrir el navegador de google chrome 
	 * 2. Maximizar la ventana del navegador
	 * 3. Navegar a la pagina https://www.amazon.com.mx/ 
	 * 4. Buscar el producto de "Laptop Dell" 
	 * 5. Presionar el filtro que solo sean compus DELL
	 * 6. Escribir un rango de precio y buscar*/
	
	public static ChromeDriver driver;
	@BeforeClass
	public void invocarNavegador(){
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\asepulveda\\eclipse-workspace\\SeleniumPractica\\src\\test\\resources\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();	
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		driver.get("https://www.amazon.com.mx/");
		
	}
	
	@Test(priority=0)
	public void buscarProducto()
	{
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Laptop Dell");
		driver.findElement(By.id("nav-search-submit-button")).click();
	}
	@Test(priority=1)
	public void usarFiltros()
	{
		driver.findElement(By.xpath("//*[@id=\"p_89/Dell\"]/span/a/div/label/i")).click();
		driver.findElement(By.id("low-price")).sendKeys("1000");
		driver.findElement(By.id("high-price")).sendKeys("1500");
		driver.findElement(By.xpath("//*[@id=\"a-autoid-1\"]/span/input")).click();
	}
	@Test(priority=2)
	public void tomarFoto() throws IOException
	{
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("./screenshot.png"));
	}
	@AfterClass
	public void cerrarNavegador()
	{
		driver.quit();
	}
}
