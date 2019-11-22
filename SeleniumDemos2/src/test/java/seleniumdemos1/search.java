package seleniumdemos1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class search {
	WebDriver driver;
	
  @Test
  public void searchbar() {
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		WebElement find=driver.findElement(By.id("myInput"));
		  Actions act = new Actions(driver);
		  act.sendKeys(find,"b").pause(1000).sendKeys("a").pause(1000).sendKeys("g").build().perform();
		  act.moveToElement(driver.findElement(By.xpath("//div[contains(text(),'Hand bag')]"))).
		  click().build().perform();
		  driver.findElement(By.xpath("//input[@type='submit']")).click();
		  driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div/div/div[2]/center/a")).click();
  }
  @BeforeTest
  public void ConfigureBrowser() 
  {
    driver=gendrivers.ConfigureBrowser("chrome");
    driver.manage().window().maximize();//to maximize
  }

  @AfterTest
  public void afterTest() {
	// driver.close();
  }

}
