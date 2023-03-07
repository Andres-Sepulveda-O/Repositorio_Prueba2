package pageFinal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogInPage_Final {
	
	WebDriver driver;
	By email = By.id("email");
	By password = By.id("passwd");
	By signIn = By.xpath("//*[@id=\"SubmitLogin\"]/span");
	
	public LogInPage_Final(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void ingresarCorreo(String strCorreo)
	{
		driver.findElement(email).sendKeys(strCorreo);
	}
	
	public void ingresarPassword(String strPassword)
	{
		driver.findElement(password).sendKeys(strPassword);
	}
	
	public void ingresar()
	{
		driver.findElement(signIn).click();
	}



}
