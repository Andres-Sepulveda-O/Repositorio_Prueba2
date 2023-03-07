package pages2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreateAccountPage_AP {
	
	WebDriver driver;
	
	By crearCuenta = By.id("SubmitCreate"); 
	By correoElectronico = By.id("email_create");
	By titulo = By.id("id_gender1");
	By firstName = By.id("customer_firstname");
	By lastName = By.id("customer_lastname");
	By password = By.id("passwd");
	By firstNameAddress = By.id("firstname");
	By lastNameAddress = By.id("lastname");
	By address = By.id("address1");
	By city = By.id("city");
	By state = By.id("id_state");
	By zipCode = By.id("postcode");
	By country = By.id("id_country");
	By mobilePhone = By.id("phone_mobile");
	By emailAlias = By.id("alias");
	By registrar = By.xpath("//*[@id=\"submitAccount\"]/span");
	
	public CreateAccountPage_AP(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void  crearCuenta()
	{
		driver.findElement(crearCuenta).click();
	}
	
	public void ingresarCorreoNuevo(String strCorreoNuevo)
	{
		driver.findElement(correoElectronico).sendKeys(strCorreoNuevo);
	}
	
	public void seleccionarTitulo()
	{
		driver.findElement(titulo).click();
	}
	
	public void ingresarFirstName(String strFirstName)
	{
		driver.findElement(firstName).sendKeys(strFirstName);
	}
	
	public void ingresarLastName(String strLastName)
	{
		driver.findElement(lastName).sendKeys(strLastName);
	}
	
	public void ingresarPassword(String strPassword)
	{
		driver.findElement(password).sendKeys(strPassword);
	}
	
	public void ingresarFirstNameAddress(String strFirstNameAddress)
	{
		driver.findElement(firstNameAddress).sendKeys(strFirstNameAddress);
	}
	
	public void ingresarLasttNameAddress(String strLastNameAddress)
	{
		driver.findElement(lastNameAddress).sendKeys(strLastNameAddress);
	}
	
	public void ingresarAddress(String strAddress)
	{
		driver.findElement(address).sendKeys(strAddress);
	}
	
	public void ingresarCity(String strCity)
	{
		driver.findElement(city).sendKeys(strCity);
	}
	
	public void ingresarState()
	{
		driver.findElement(state).click();
	}
	
	public void ingresarZipCode(String strZipCode)
	{
		driver.findElement(zipCode).sendKeys(strZipCode);
	}
	
	public void ingresarCountry()
	{
		driver.findElement(country).click();
	}
	
	public void ingresarMobilePhone(String strMobilePhone)
	{
		driver.findElement(mobilePhone).sendKeys(strMobilePhone);
	}
	
	public void ingresarEmailAlias(String strEmailAlias)
	{
		driver.findElement(emailAlias).sendKeys(strEmailAlias);
	}
	
	public void registrar()
	{
		driver.findElement(registrar).click();
	}
}
