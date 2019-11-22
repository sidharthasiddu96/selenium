package seleniumdemos1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class aboutus {
	WebDriver driver;
  @Test
  public void testaboutus() {
	  driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	  Actions act = new Actions(driver);
	  act.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'AboutUs')]"))).
	  moveToElement(driver.findElement(By.xpath("//span[contains(text(),'Our\n" + 
	  		"												Offices')]"))).
	  moveToElement(driver.findElement(By.xpath("//span[contains(text(),'Bangalore')]"))).
	  click().build().perform()	;  
  }
  @BeforeTest
  public void ConfigureBrowser() 
  {
    driver=gendrivers.ConfigureBrowser("chrome");
    driver.manage().window().maximize();//to maximize
  }
  @AfterTest
  public void closeapp() 
  {
	// driver.close();
  }

}
