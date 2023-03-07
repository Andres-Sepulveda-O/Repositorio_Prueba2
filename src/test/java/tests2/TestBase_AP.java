package tests2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import pages2.HomePage_AP;
import tests.TestBase;

public class TestBase_AP {
	
	public static WebDriver driver = null;
	
	@BeforeTest
	public void inicializar()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\asepulveda\\eclipse-workspace\\SeleniumPractica\\src\\test\\resources\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	@AfterTest
	public void cerrar()
	{
		HomePage_AP.driver.quit();
	}

}
