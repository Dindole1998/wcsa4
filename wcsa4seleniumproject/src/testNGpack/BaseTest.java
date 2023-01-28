package testNGpack;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BaseTest {
	static WebDriver driver;
  @ BeforeMethod
  public void setUp() {
	  if(browserValue.equals("chrome"))
	  System.setProperty("webdriver.chroome.driver","./drivers/chromedriver.exe");
	   driver=new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	   driver.get(url);
  }
  
  ele if(browserValue.equals("firefox"))
  {
	  System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
	   driver=new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	   driver.get(url);
  }
  else
  {
	  Reporter.log("enter valid browser value",true);
  }
  
}
@AfterMethod
