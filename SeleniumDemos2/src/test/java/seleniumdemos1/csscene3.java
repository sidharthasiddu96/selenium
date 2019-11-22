package seleniumdemos1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class csscene3 {
	WebDriver driver;
  @Test
  public void testRegistration()
  {
	  driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	  driver.findElement(By.linkText("SignUp")).click();
	  driver.findElement(By.id("userName")).sendKeys("goal111");
	  driver.findElement(By.id("firstName")).sendKeys("prafffh");
	  driver.findElement(By.id("lastName")).sendKeys("sidffaifdg"); 
	  driver.findElement(By.id("password")).sendKeys("afffarjun@297");
	  driver.findElement(By.id("pass_confirmation")).sendKeys("afffarjun@297");
	  driver.findElement(By.xpath("/html/body/main/div/div/form/fieldset/div/div[6]/div/div/label")).click();
	  driver.findElement(By.id("emailAddress")).sendKeys("goal111@gmail.com");
	  driver.findElement(By.id("mobileNumber")).sendKeys("7890786532");
	  driver.findElement(By.xpath("/html/body/main/div/div/form/fieldset/div/div[9]/div/div/img")).click();
	  Select dropdown = new Select(driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/select[1]")));
	  dropdown.selectByIndex(7);
	  Select subdropdown = new Select(driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/select[2]")));
	  subdropdown.selectByVisibleText("1997");
	  driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[2]/td[4]/a")).click();
	  driver.findElement(By.id("address")).sendKeys("21A, bank colony,kuvempunagar mysore");
	  Select dropdown2 = new Select(driver.findElement(By.id("securityQuestion")));
	  dropdown2.selectByIndex(0);
	  driver.findElement(By.id("answer")).sendKeys("bangalore");
	// driver.findElement(By.xpath("/html/body/main/div/div/form/fieldset/div/div[13]/div/input[1]")).click();
	  driver.findElement(By.xpath("//input[@type='submit' and @value='Register']")).click();
	  
	  
	  //driver.findElement(By.id("securityQuestion")).sendKeys("");
	 // driver.findElement(By.xpath(" driver.findElement(By.xpath(\"/html/body/main/div/div/form/fieldset/div/div[9]/div/div/img")).click();
	
	  
	  
	  
  }
  @BeforeTest
  public void beforeTest() 
  {
	  
	    driver=gendrivers.ConfigureBrowser("chrome");
	    driver.manage().window().maximize();//to maximize
  }  
  

  @AfterTest
  public void closeapp() 
  {
	//  driver.close();
  }

}
