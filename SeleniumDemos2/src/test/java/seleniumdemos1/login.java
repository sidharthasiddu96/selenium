package seleniumdemos1;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;

public class login {
	WebDriver driver;
	
  @Test(dataProvider = "dp")
  public void f(String un, String pwd) {
	  driver.get("http://10.232.237.143:443/TestMeApp/login.htm");
	  driver.findElement(By.id("userName")).sendKeys(un);
	  driver.findElement(By.id("password")).sendKeys(pwd);
	  driver.findElement(By.name("Login")).click();
  }

  @DataProvider
  public Object[][] dp() throws IOException {
	  Object[][] data=excelReader.readData();
	  return data;

    };
  
  @BeforeTest
  public void ConfigureBrowser() 
  {
    driver=gendrivers.ConfigureBrowser("chrome");
    driver.manage().window().maximize();//to maximize
  }
  @AfterTest
  public void afterTest() {
  }

}
