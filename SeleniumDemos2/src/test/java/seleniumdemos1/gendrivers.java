package seleniumdemos1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class gendrivers {
	
		static WebDriver driver;
	  public static WebDriver ConfigureBrowser(String browserName) {
		  if(browserName.equals("chrome"))
		  {
			  System.setProperty("webdriver.chrome.driver","C:\\Users\\pramod.sidhartha.b\\Downloads\\chromedriver_win32\\chromedriver.exe");
			  driver= new ChromeDriver();
			  return driver;
		  }
		  else if(browserName.equals("explorer"))
		  {
			  System.setProperty("webdriver.ie.driver","C:\\Users\\pramod.sidhartha.b\\Downloads\\IEDriverServer.exe");
			  driver= new InternetExplorerDriver();
			  return driver;
		  }
		  else if(browserName.equals("firefox"))
		  {
			  System.setProperty("webdriver.gecko.driver","C:\\Users\\pramod.sidhartha.b\\Downloads\\geckodriver.exe");
			  driver= new FirefoxDriver();
			  return driver;
		  }
		  return null;
	  }
	

}
