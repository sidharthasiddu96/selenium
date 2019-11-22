package seleniumdemos1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class NewTest1{
	WebDriver driver;
  
  @BeforeTest
  public void ConfigureBrowser() 
  {
    driver=gendrivers.ConfigureBrowser("chrome");
    driver.manage().window().maximize();//to maximize
  }
  @Test
  public void openTestMe() 
  {
	  driver.get("http://10.232.237.143:443/TestMeApp/login.htm");
	 // driver.findElement(By.id("userName")).sendKeys("Lalitha");
	  driver.get("http://10.232.237.143:443/TestMeApp/login.htm");
	  driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("Admin");
	  driver.findElement(By.xpath("//input[@type='password']")).sendKeys("password456");
	  driver.findElement(By.xpath("//input[@type='submit']")).click();
	  Assert.assertEquals(driver.getTitle(),"Admin Home");
	  driver.findElement(By.xpath("/html/body/main/div/div/div/div[2]/button")).click();
	
	  //driver.findElement(By.id("password")).sendKeys("password123");
	//  driver.findElement(By.name("Login")).click();
	//  Assert.assertEquals(driver.getTitle(),"Home");
	//  driver.findElement(By.linkText("SignOut")).click();
	  
  }

  @AfterTest
  public void closeapp() 
  {
	//  driver.close();
  }

}
