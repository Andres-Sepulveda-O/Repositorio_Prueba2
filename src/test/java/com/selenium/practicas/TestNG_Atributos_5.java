package com.selenium.practicas;

import static org.testng.Assert.assertEquals;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_Atributos_5 {
	
	public static WebDriver driver = null;
    public String url="https://www.lambdatest.com/";
    
    @BeforeSuite
    public void setUp()
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\asepulveda\\eclipse-workspace\\SeleniumPractica\\src\\test\\resources\\chromedriver\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        System.out.println("The setup process is completed");
    }
    
    @BeforeTest
    public void profileSetup()
    {
        driver.manage().window().maximize();
        System.out.println("The profile setup process is completed");
        
    }
    
    @BeforeClass
    public void appSetup()
    {
        driver.get(url);
        System.out.println("The app setup process is completed");
    }
   
    
    @Test(priority=2)
    public void checkLogin()
    {
          driver.get("https://accounts.lambdatest.com/login");
          driver.findElement(By.xpath("//input[@name='email']")).sendKeys("juanito_tester_1927@outlook.com");
          driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Password12345");
          driver.findElement(By.id("login-button")).click();
          System.out.println("The login process on lamdatest is completed");
    }
    
    @Test(priority=0 ,description= "this test validates the sign-up test")
    public void signUp() throws InterruptedException
    {
        WebElement link= driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div/div[2]/div/div/div[2]/a[2]"));
        link.click();
        WebElement firstName=driver.findElement(By.id("name"));
        firstName.sendKeys("LambdaTest");
        WebElement email=driver.findElement(By.id("email"));
        email.sendKeys("User622@gmail.com");
        WebElement password=driver.findElement(By.id("userpassword"));
        password.sendKeys("TestUser123");
        WebElement phoneNumber=driver.findElement(By.id("phone"));
        phoneNumber.sendKeys("9412262090");
        WebElement termsOfService=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/form/div[5]/label/samp"));
        termsOfService.click();
        WebElement button=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/form/div[6]/button"));
        button.click();
    }
    
    @Test(priority=3, alwaysRun= true, dependsOnMethods="checkLogin", description="this test validates the URL post logging in" , groups="url_validation")
    public void testCurrentUrl() throws InterruptedException
    {
    	driver.findElement(By.xpath("//*[@id=\"left_sidebar_header\"]/div[7]/a")).click();
	    Thread.sleep(6000);
	    String currentUrl= driver.getCurrentUrl();
	    assertEquals(currentUrl, "https://integrations.lambdatest.com/", "url did not matched");
	    System.out.println("The url validation test is completed");
    }
    
    @Test(priority=4, description = "this test validates the logout functionality" ,timeOut= 25000)
    public void logout() throws InterruptedException
    {
        Thread.sleep(6500);
         driver.findElement(By.id("profile__dropdown")).click();
         driver.findElement(By.id("app__logout")).click();   
    }
    
    @Test(enabled=false)
    public void skipMethod()
    {
        System.out.println("this method will be skipped from the test run using the attribute enabled=false");
    }
    
    @Test(priority=6,invocationCount =5,invocationTimeOut = 20)
    public void invocationcountShowCaseMethod()
    {
        System.out.println("this method will be executed by 5 times");
    }
    @AfterMethod()
    public void screenshot() throws IOException
    {
    	File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, new File("./screenshot.png"));
	    System.out.println("Screenshot of the test is taken");
    }
    
    @AfterClass
    public void closeUp()
    {
        driver.close();
        System.out.println("The close_up process is completed");
    }
    
    @AfterTest
    public void reportReady()
    {
        System.out.println("Report is ready to be shared, with screenshots of tests");
    }
    
    @AfterSuite
    public void cleanUp()
    {
        
        System.out.println("All close up activities completed");
    }
    
    @BeforeGroups("urlValidation")
    public void setUpSecurity() {
        System.out.println("url validation test starting");
    }
  
    @AfterGroups("urlValidation")
    public void tearDownSecurity() {
        System.out.println("url validation test finished");
    }
    
    
	
}
