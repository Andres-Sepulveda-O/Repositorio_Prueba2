package pageFinal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage_Final {
	
public static WebDriver driver;
	
	By inicioDeSesion = By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a");
	
	public HomePage_Final (WebDriver driver)
	{
		this.driver = driver;
	}
	
	//esta parte me puede causar problemas.
	
	public void iniciarSesion()
	{
		driver.findElement(inicioDeSesion).click();
	}
}
