package frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameByIndex {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/admin/Desktop/WCSA4/Frame2.html");
		driver.switchTo().frame(0);
		WebElement usn = driver.findElement(By.id("i1"));
		usn.sendKeys("Admin");

		driver.switchTo().defaultContent();// default content is used the control to the child frame to parent frame
		WebElement pass = driver.findElement(By.id("id1"));
		pass.sendKeys("manager");


	}
}

