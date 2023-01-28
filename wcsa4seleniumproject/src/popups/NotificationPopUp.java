package popups;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NotificationPopUp {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeOptions  Co= new ChromeOptions();
		// maximize the browser without using manage method
		Co.addArguments("-start-maximized");

		
		WebDriver driver=new ChromeDriver(Co);

		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));

		driver.get("https://www.olx.in/");
		Thread.sleep(2000);
		Co.addArguments("--disable-notifications");

		
		

	}
}         