package keyworddrivernframework;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
/*/
public class BaseTest {

	static WebDriver driver;
	public  void openBrowser() throws IOException {
		
		Flib flib = new Flib();
		
		String browserValue = flib.readpropertyData("./data/config.properties","Browser");
		String url = flib.readpropertyData("./data/config.properties","Url");
		
		if(browserValue.equals("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			 driver=new ChromeDriver();
			 
			 driver.manage().window().maximize();
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			 driver.get(url);
		}
		else if(browserValue.equals("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
			 driver=new FirefoxDriver();
			 
			 driver.manage().window().maximize();
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			 driver.get(url);
		}
		else
		{
			System.out.println("Enter Valid browser value");
		}
		
	}
}
/*/
public class BaseTest implements IAutoConstant {

	static WebDriver driver;
	public  void openBrowser() throws IOException {
		
		Flib flib = new Flib();
		
		String browserValue = flib.readpropertyData(PROP_PATH,"Browser");
		String url = flib.readpropertyData(PROP_PATH,"Url");
		
		if(browserValue.equals("Chrome"))
		{
			System.setProperty(CHROME_KEY,CHROME_VALUE);
			 driver=new ChromeDriver();
			 
			 driver.manage().window().maximize();
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			 driver.get(url);
		}
		else if(browserValue.equals("Firefox"))
		{
			System.setProperty(FIREFOX_KEY,FIREFOX_VALUE);
			 driver=new FirefoxDriver();
			 
			 driver.manage().window().maximize();
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			 driver.get(url);
		}
		else
		{
			System.out.println("Enter Valid browser value");
		}
		
	}
	public void closeBrowser()
	{
		driver.quit();
	}
}
	
	
	
	
	
	
