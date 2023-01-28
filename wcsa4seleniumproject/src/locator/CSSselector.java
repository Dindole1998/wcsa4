package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSselector {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://www.instagram.com/");
		  Thread.sleep(1000);
		  driver.findElement(By.name("username")).sendKeys("Prasad");
		  driver.findElement(By.name("password")).sendKeys("9763720299");
		  driver.findElement(By.cssSelector("button[class='_acan _acap _acas _']")).click();
	}

}
