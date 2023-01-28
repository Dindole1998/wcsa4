package assignment;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import methodofwebelement.ClickMethod;

public class MultipleDropDownInspect {
public static void main(String[] args) throws AWTException, InterruptedException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
  driver.manage().window().maximize();
  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
   driver.get("file:///C:/Users/admin/Desktop/WCSA4/Multi%20Select%20Dropdown3.html");
    Actions act = new Actions(driver);
    act.contextClick().perform();
    
    Robot robot = new Robot();
    for(int i=1;i<9;i++)
    {
    	robot.keyPress(KeyEvent.VK_DOWN);
    	Thread.sleep(2000);
    	 robot.keyRelease(KeyEvent.VK_DOWN);
    }
    robot.keyPress(KeyEvent.VK_ENTER);
    robot.keyRelease(KeyEvent.VK_ENTER);
    
   
    
    
}
}


