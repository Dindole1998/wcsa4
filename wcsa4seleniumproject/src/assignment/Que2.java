package assignment;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Que2 {
	//How to close parent and child window without using quite() method?
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	driver.get("http://omayo.blogspot.com/");
	driver.findElement(By.xpath("//a[.='Open a popup window']")).click();
      Set<String> allHandles = driver.getWindowHandles();
      Thread.sleep(2000);
      for(String Wh:allHandles)
      {
    	  driver.switchTo().window(Wh).close();
      }
    	  
		}
	}
