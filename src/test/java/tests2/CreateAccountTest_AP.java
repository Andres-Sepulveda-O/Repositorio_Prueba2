package tests2;

import org.testng.annotations.Test;

import pages2.CreateAccountPage_AP;
import pages2.HomePage_AP;

public class CreateAccountTest_AP extends TestBase_AP {
	
	@Test
	public void crearCuentaNueva()
	{
		HomePage_AP homePage = new HomePage_AP(driver);
		homePage.iniciarSesion();
		
		CreateAccountPage_AP crearNuevaCuenta = new CreateAccountPage_AP(driver);
		crearNuevaCuenta.ingresarCorreoNuevo("PruebaABCD1234@hotmail.com");
		crearNuevaCuenta.crearCuenta();
		
		
		crearNuevaCuenta.seleccionarTitulo();
		crearNuevaCuenta.ingresarFirstName("Fulanito");
		crearNuevaCuenta.ingresarLastName("De la Rosa");
		crearNuevaCuenta.ingresarPassword("Password123!");
		crearNuevaCuenta.ingresarFirstNameAddress("Fulanito");
		crearNuevaCuenta.ingresarLasttNameAddress("De la Rosa");
		crearNuevaCuenta.ingresarAddress("Calle generica 123, colonia de las lomas, monterrey, N.L.");
		crearNuevaCuenta.ingresarCity("Cuidad cualquiera");
		crearNuevaCuenta.ingresarState();
		crearNuevaCuenta.ingresarZipCode("74817");
		crearNuevaCuenta.ingresarCountry();
		crearNuevaCuenta.ingresarMobilePhone("8281029483");
		crearNuevaCuenta.ingresarEmailAlias("qweasdr11@hotmail.com");
		crearNuevaCuenta.registrar();
		
	}

}
