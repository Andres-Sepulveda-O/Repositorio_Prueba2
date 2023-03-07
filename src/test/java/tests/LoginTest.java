package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;

public class LoginTest extends TestBase{
	
	@Test
	public void loginPass()
	{
		LoginPage loginpage = new LoginPage(driver);
		loginpage.setUserName("mgr123");
		loginpage.setPassword("mgr!23");
		loginpage.clickLogin();
		HomePage homePage = new HomePage(driver);
		Assert.assertTrue(homePage.getHomePageDashboardUserName().toLowerCase().contains("manger id : mgr123"));
	}

}
