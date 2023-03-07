package ejerciciosSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Ejercicio_2 {
	/* 1. Ingresar a la pagina de "http://automationpractice.com/" 
	 * 2. Maximizar la ventana del navegador
	 * 3. Presionar el boton de "Sign in" ubicado arriba de la derecha
	 * 4. Ingresar el mail en la parte de "Create an account" y presionar el boton de crear cuenta
	 * 5. Llenar los datos necesarios para crear la cuenta
	 * 6. Presionar el boton de "Register" */
	public static WebDriver driver;
	@BeforeClass
	public void invocarNavegador(){
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\asepulveda\\eclipse-workspace\\SeleniumPractica\\src\\test\\resources\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/");						
	}
	
	
	@Test
	public void registroAutomation() throws InterruptedException {
		
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.id("email_create")).sendKeys("maildeprueba5@hotmail.com");
		driver.findElement(By.xpath("//*[@id=\"SubmitCreate\"]/span")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.id("id_gender1")).click();
		driver.findElement(By.id("customer_firstname")).sendKeys("Prueba First Name");
		driver.findElement(By.id("customer_lastname")).sendKeys("Prueba Last Name");
		driver.findElement(By.id("passwd")).sendKeys("Password12345");

		Select dia = new Select(driver.findElement(By.id("days")));
		dia.selectByValue("8");
		
		Select mes = new Select(driver.findElement(By.id("months")));
		mes.selectByValue("4");
		
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
	
	
	@AfterClass
	public void cerrarNavegador(){
		
		driver.quit();
		
	}
}
