package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OrangehrmAutomateActionandRobot {
	public static void main(String[] args) throws InterruptedException {
	     System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	     WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	WebElement clickandhold = driver.findElement(By.xpath("//p[.='Username : Admin']"));
	 Actions act = new Actions(driver);
	 act.clickAndHold(clickandhold).perform();
	
	
	
	
	
	
	
	}

}
