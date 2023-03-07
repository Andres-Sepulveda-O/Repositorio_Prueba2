package testFinal;

import org.testng.annotations.Test;

import pageFinal.HomePage_Final;
import pageFinal.LogInPage_Final;
import pages2.CreateAccountPage_AP;
import pages2.HomePage_AP;

public class LogInPageTest_Final extends TestBase_FInal {
	
	@Test
	public void signIn() throws InterruptedException
	{
		HomePage_Final homePage = new HomePage_Final(driver);
		homePage.iniciarSesion();
		
		LogInPage_Final ingresarAlMail = new LogInPage_Final(driver);
		ingresarAlMail.ingresarCorreo("emailparapom@hotmail.com");
		ingresarAlMail.ingresarPassword("Password123");
		ingresarAlMail.ingresar();
		Thread.sleep(3000);
	}

}
