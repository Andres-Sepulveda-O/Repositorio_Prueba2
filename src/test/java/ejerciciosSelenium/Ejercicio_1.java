package ejerciciosSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Ejercicio_1 {
	/* 1. Abrir el navegador de google chrome 
	 * 2. Maximizar la ventana del navegador
	 * 3. Navegar a la pagina http://qatechhub.com 
	 * 4. Escribir un metodo que compare el titulo actual de la pagina con el siguiente texto "QA Automation Tools Trainings and Tutorials | QA Tech Hub" 
	 * 5. Navegar a la pagina de facebook "https://www.facebook.com" 
	 * 6. Imprimir el URL actual.
	 * 7. Navegar de regreso a la pagina de QA Tech Hub
	 * 8. Navegar de regreso a facebook
	 * 9. Recargar la pagina
	 * 10. Cerrar el navegador
	 * 11 . Mensaje de prueba*/

		public static WebDriver driver;

		@Test(priority=0)
		public void invocarNavegador() 
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\asepulveda\\eclipse-workspace\\SeleniumPractica\\src\\test\\resources\\chromedriver\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
			driver.get("http://qatechhub.com");
		}
		@Test(priority= 1)
		public void compararTitulos()
		{
			String titleOfThePage = driver.getTitle();
			Assert.assertEquals(titleOfThePage, "QA Automation Tools Trainings and Tutorials | QA Tech Hub");
		}

		@Test(priority= 2)
		public void comandosDeNavegacion() throws InterruptedException 
		{
			driver.navigate().to("https://www.facebook.com");

			String currentUrl = driver.getCurrentUrl();

			System.out.println("URL Actual :: " + currentUrl);
			Thread.sleep(2000);
			driver.navigate().back();
			Thread.sleep(2000);
			driver.navigate().forward();
			Thread.sleep(2000);
			driver.navigate().refresh();
		}
		
		@Test(priority= 3)
		public void cerrarNavegador()
		{
			 driver.quit();
		}
}
