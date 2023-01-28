package synchrinization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTime {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));//implicit wait
		  driver.get("http://admin-pc/login.do"); // to launch the actitime
		  
            String actualLoginPageTitle = driver.getTitle();	
            if(actualLoginPageTitle.equals(" actiTIME - Login"))
            {
            	System.out.println("Login Page Title is match:Test Case is passed!!!");
            }
            else
            {
            	System.out.println("Login Page Title is not match:Test Case is fail");
            }
            driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
  		  driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
  		 driver.findElement(By.xpath("//a[.='Login']")).click();
  		 Thread.sleep(7000);
             String actualHomePageTitle = driver.getTitle();
            // System.out.println(actualHomePageTitle);
             
             if(actualHomePageTitle.equals("actiTIME - Enter Time-Track"))
             {
            	 System.out.println("Home Page Title is match:Test Case is passed!!!");
             }
             else 
             {
            	 System.out.println("Home Page Title is not match:  Test Case Is not passed!!!");
            }
             
	}
}
