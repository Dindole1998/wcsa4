package pageobjectmodel;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StealRefException {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get(" http://127.0.0.1/login.do;jsessionid=39dsipraglm9p ");
		 WebElement username = driver.findElement(By.name("username"));
		 WebElement password = driver.findElement(By.name("pwd"));
		 
		 username.sendKeys("admin");
		 System.out.println(username);
		 Thread.sleep(2000);
		 driver.navigate().refresh();
		 username.sendKeys("admin");
		 System.out.println(username);
		

	}
}
