package assignment;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RobotAssignment2 {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
         driver.get("https://www.bluestone.com/");
          driver.findElement(By.xpath("//span[.='Allow']")).click();
          Thread.sleep(2000);
         WebElement target = driver.findElement(By.name("//a[@title='Watch Jewellery']"));
         Actions act = new Actions(driver);
         act.moveToElement(target).perform();
         Thread.sleep(2000);
         driver.findElement(By.xpath("//a[@title='Band']")).click();
         
         WebElement clickandHold = driver.findElement(By.xpath("//div[.='Filter by']"));
         for(int i=0;i<=2;i++)
         {
        	 act.clickAndHold(clickandHold).perform();
         }
         Robot robot = new Robot();
         
         robot.keyPress(KeyEvent.VK_CONTROL);
         robot.keyPress(KeyEvent.VK_C);
         
         robot.keyRelease(KeyEvent.VK_CONTROL);
         robot.keyRelease(KeyEvent.VK_C);
         Thread.sleep(2000);
         WebElement searchbox = driver.findElement(By.id("search_query_top_elastic_search"));
         searchbox.click();
         
         robot.keyPress(KeyEvent.VK_CONTROL);
         robot.keyPress(KeyEvent.VK_V);
         
         robot.keyRelease(KeyEvent.VK_CONTROL);
         robot.keyRelease(KeyEvent.VK_V);
  	}
	
}
