package seleniumdemos1;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.openqa.selenium.OutputType;

import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;

public class Report {
	WebDriver driver;
	ExtentHtmlReporter htmlReporter;
	  ExtentReports extent;
	  ExtentTest logger;
	 
  @Test(priority=1)
  public void testRegistration() {
	  logger=extent.createTest("test registration page");
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
	  driver.findElement(By.xpath("//input[@type='submit' and @value='Register']")).click();
	 // Assert.assertTrue(true);
  }
  @Test(priority=2)
  public void testlogin() {
	  logger=extent.createTest("testing login page");
	  driver.get("http://10.232.237.143:443/TestMeApp/login.htm");
	  driver.findElement(By.id("userName")).sendKeys("goal111");
	  driver.findElement(By.id("password")).sendKeys("afffarjun@297");
	  driver.findElement(By.name("Login")).click();
	 // Assert.assertTrue(true);
  }
  @Test(priority=3)
  public void testcart() {
	 logger= extent.createTest("testing  add to cart page");
	  WebElement find=driver.findElement(By.id("myInput"));
	  Actions act = new Actions(driver);
	  act.sendKeys(find,"b").pause(1000).sendKeys("a").pause(1000).sendKeys("g").build().perform();
	  act.moveToElement(driver.findElement(By.xpath("//div[contains(text(),'Hand bag')]"))).
	  click().build().perform();
	  driver.findElement(By.xpath("//input[@type='submit']")).click();
	  driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div/div/div[2]/center/a")).click(); 
	 // Assert.assertTrue(false);
  }
  @Test(priority=4)
  public void testpayment() {
	  logger=extent.createTest("testing payment page");
	  driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/a[2]")).click();
	  driver.findElement(By.xpath("//*[@id=\"cart\"]/tfoot/tr[2]/td[5]/a")).click();
	  driver.findElement(By.xpath("/html/body/b/div/div/div[1]/div/div[2]/div[3]/div/form[2]/input")).click();
	  WebDriverWait wait = new WebDriverWait(driver,10);
	  wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//label[contains(text(),'Andhra Bank')]"))).click();
	  driver.findElement(By.xpath("//label[contains(text(),'Andhra Bank')]")).click();
	  driver.findElement(By.xpath("//*[@id=\"btn\"]")).click(); 
	  driver.findElement(By.xpath("//input[@type='text' and @name='username']")).sendKeys("123456");
	  driver.findElement(By.xpath("//input[@type='password' and @name='password']")).sendKeys("Pass@456");
	  driver.findElement(By.xpath("//input[@type='submit' and @value='LOGIN']")).click();
	  driver.findElement(By.xpath("//input[@type='password' and @value='PASSWORD']")).sendKeys("Trans@456");
	  driver.findElement(By.xpath("//input[@type='submit' and @value='PayNow']")).click();
	 // throw new SkipException("test payment is not yet updated");
  }
  @BeforeTest
  public void beforeTest() {

	    driver=gendrivers.ConfigureBrowser("chrome");
	    driver.manage().window().maximize();//to maximize
	  htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir")+"/extent-reports/"+
	    new SimpleDateFormat("hh-mm-ss-dd-MM-yyyy").format(new Date())
	    +".html");
	  htmlReporter.config().setDocumentTitle("TestMe Report");
	  htmlReporter.config().setReportName("Test end to end Test Report");
	  htmlReporter.config().setTheme(Theme.DARK);
	  extent = new  ExtentReports();
	  extent.attachReporter(htmlReporter);
	  extent.setSystemInfo("Host Name:", "TestMe Application");
	  extent.setSystemInfo("Environment:", "Selenium Automated Testing");
	  extent.setSystemInfo("Author:", "Pramod");
  }
  @AfterMethod
  public void getResult(ITestResult result) throws IOException {
	  if(result.getStatus()==ITestResult.SUCCESS) {
		  logger.log(Status.PASS,MarkupHelper.createLabel("test method is passed:"+result.getName(),ExtentColor.GREEN));
		  
	  }
	  else if(result.getStatus()==ITestResult.FAILURE) {
		  logger.log(Status.FAIL,MarkupHelper.createLabel("test method is failed:"+result.getName(),ExtentColor.BLUE));
		  TakesScreenshot capture=(TakesScreenshot)driver;
		
		  File captureToFile=capture.getScreenshotAs(OutputType.FILE);
		String imgPath= System.getProperty("user.dir")+"/extentreports/snapshots/"+result.getName()+".png";
		  FileUtils.copyFile(captureToFile, new File(imgPath));
		  logger.addScreenCaptureFromPath(imgPath);
	  }
	  else if(result.getStatus()==ITestResult.SKIP) {
		  logger.log(Status.SKIP,MarkupHelper.createLabel("test method is skipped:"+result.getName(),ExtentColor.YELLOW));
	  
  }
	  
	  
  }

  @AfterTest
  public void afterTest() {
	  extent.flush();
	  
  }

}
