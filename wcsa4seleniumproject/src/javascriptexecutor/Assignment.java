package javascriptexecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;

public class Assignment {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("file:///C:/Users/admin/Desktop/WCSA4/LP.html");
		 WebElement username = driver.findElement(By.id("i1"));
		 WebElement password = driver.findElement(By.id("i2"));
		 
		 JavascriptExecutor js = (JavascriptExecutor)driver;
		 if(username.isEnabled())
		 {
			 username.sendKeys("admin");
			 System.out.println("if block executed");
		 }
		 else
		{
			 js.executeScript("document.getElementById('i1').value='admin'");
			 System.out.println("else block executed");
		 }
		 Thread.sleep(2000);
		 
		 if(password.isEnabled())
		 {
		      password.sendKeys("manager");
		      System.out.println("if block executed");
		 }
		 else
		 {
			 js.executeAsyncScript("document.getElementById('i2').vlaue='manaher'");
			 System.out.println("else block executed");
		 }
		 
	
	
	
	}

}
