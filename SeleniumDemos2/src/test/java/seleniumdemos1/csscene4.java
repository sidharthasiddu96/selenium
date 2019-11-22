package seleniumdemos1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;

public class csscene4 {
	WebDriver driver;
  @Test
  public void login() {
	  driver.get("http://10.232.237.143:443/TestMeApp/login.htm");
	  driver.findElement(By.id("userName")).sendKeys("goal111");
	  driver.findElement(By.id("password")).sendKeys("afffarjun@297");
	  driver.findElement(By.name("Login")).click();
	  
  }
  @BeforeTest
  public void beforeTest() {

	    driver=gendrivers.ConfigureBrowser("chrome");
	    driver.manage().window().maximize();//to maximize
  }

  @AfterTest
  public void afterTest() {
  }

}
