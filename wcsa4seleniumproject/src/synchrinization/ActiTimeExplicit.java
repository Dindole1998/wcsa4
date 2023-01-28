package synchrinization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActiTimeExplicit {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));//implicit wait
		  driver.get("http://admin-pc/login.do"); // to launch the actitime
		      
		  WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));// syntax is different
		  Boolean check = wait.until(ExpectedConditions.titleContains("Login"));
		  System.out.println(check); 
		 // String actulLoginPageTitle = driver.getTitle();
		  //System.out.println("actul Login Page Title: Test Case is Passed");
		 driver.findElement(By.name("username")).sendKeys("admin");
		 driver.findElement(By.name("pwd")).sendKeys("manager");
		 Boolean check2 = wait.until(ExpectedConditions.titleContains("chrome"));
		 System.out.println(check2);
		       
	}
}
