package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NameLocator1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 WebDriver  driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("file:///C:/Users/admin/Desktop/WCSA4/Checkbox.html");
		 Thread.sleep(1000);
		 driver.findElement(By.name("n1")).click(); // for selectinng 'A'
		 Thread.sleep(2000);
		 driver.findElement(By.name("n2")).click(); // for selectinng 'B'
		 Thread.sleep(3000);
		 driver.findElement(By.name("n3")).click(); // for selectinng 'C'
		 Thread.sleep(4000);
		 driver.findElement(By.name("n4")).click(); // for selectinng 'D'
		 
		 
		     
			
	}

}
