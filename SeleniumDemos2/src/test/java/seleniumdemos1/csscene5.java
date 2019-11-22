package seleniumdemos1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;

public class csscene5 {
	WebDriver driver;
  @Test
  public void addcart() {
	  driver.get("http://10.232.237.143:443/TestMeApp/login.htm");
	  driver.findElement(By.id("userName")).sendKeys("goal111");
	  driver.findElement(By.id("password")).sendKeys("afffarjun@297");
	  driver.findElement(By.name("Login")).click();
	  WebElement find=driver.findElement(By.id("myInput"));
	  Actions act = new Actions(driver);
	  act.sendKeys(find,"b").pause(1000).sendKeys("a").pause(1000).sendKeys("g").build().perform();
	  act.moveToElement(driver.findElement(By.xpath("//div[contains(text(),'Hand bag')]"))).
	  click().build().perform();
	  driver.findElement(By.xpath("//input[@type='submit']")).click();
	  driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div/div/div[2]/center/a")).click();
	  driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/a[2]")).click();
	  driver.findElement(By.xpath("//*[@id=\"cart\"]/tfoot/tr[2]/td[5]/a")).click();
	  driver.findElement(By.xpath("/html/body/b/div/div/div[1]/div/div[2]/div[3]/div/form[2]/input")).click();
	//  driver.findElement(By.xpath("//input[@type='radio' and @name=radio1 and @value='Andhra Bank']")).click();
	 // driver.findElement(By.linkText("CONTINUE")).click();
	  WebDriverWait wait = new WebDriverWait(driver,10);
	  wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//label[contains(text(),'Andhra Bank')]"))).click();
	 // driver.findElement(By.xpath("//*[@id=\"swit\"]/div[1]/div/label/i")).click();
	 driver.findElement(By.xpath("//label[contains(text(),'Andhra Bank')]")).click();
	  driver.findElement(By.xpath("//*[@id=\"btn\"]")).click();
	// driver.findElement(By.id("userName")).sendKeys("123456");
	//  driver.findElement(By.id("password")).sendKeys("Pass@456");
	//  driver.findElement(By.name("Login")).click();
	  
	   driver.findElement(By.xpath("//input[@type='text' and @name='username']")).sendKeys("123456");
	   driver.findElement(By.xpath("//input[@type='password' and @name='password']")).sendKeys("Pass@456");
	   driver.findElement(By.xpath("//input[@type='submit' and @value='LOGIN']")).click();
	   driver.findElement(By.xpath("//input[@type='password' and @value='PASSWORD']")).sendKeys("Trans@456");
	   driver.findElement(By.xpath("//input[@type='submit' and @value='PayNow']")).click();
	  
	  
	  
	  
	  
	  
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
