package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagNameLocator1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("file:///C:/Users/admin/Desktop/WCSA4/Checkbox.html");
		 Thread.sleep(1000);
		 driver.findElement(By.tagName("input")).click();// To select Single Check Box
		 

}
}
