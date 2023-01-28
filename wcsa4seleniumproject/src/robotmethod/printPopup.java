package robotmethod;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class printPopup {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	driver.get("https://www.selenium.dev/downloads/"); //https://www.selenium.dev/
	         Robot robot = new Robot();
	         // to generate print popup
	         robot.keyPress(KeyEvent.VK_CONTROL);
	         robot.keyPress(KeyEvent.VK_P);
	         Thread.sleep(1000);
	         robot.keyRelease(KeyEvent.VK_ENTER);
	         robot.keyRelease(KeyEvent.VK_P);
	         // TO SWITCH THE CONTROLE TO CANCEL
	         Thread.sleep(2000);
	         robot.keyPress(KeyEvent.VK_TAB);
	         robot.keyRelease(KeyEvent.VK_TAB);
	         // to hit the enter button
	         Thread.sleep(2000);
	         robot.keyPress(KeyEvent.VK_ENTER);
	         robot.keyRelease(KeyEvent.VK_ENTER);	
	}
}