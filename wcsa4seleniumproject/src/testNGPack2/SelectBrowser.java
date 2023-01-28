package testNGPack2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SelectBrowser {
	WebDriver driver;
	
	@Test
	 @Parameters("browserValue", "url")
   public void openBrowser(String browserValue,String url)
  {
	  
	  if(browserValue.equals("Chrome"))
	  
	  System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get(url);
	}
	else if(browserValue.equals("Chrome"))
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get(url);
	}
	else
	{
		  
	}
 
}
