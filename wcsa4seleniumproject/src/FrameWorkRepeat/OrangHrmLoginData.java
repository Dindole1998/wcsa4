package FrameWorkRepeat;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangHrmLoginData {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	
		FileLib fib = new FileLib();
		String username = fib.readExcel("./data/Orangehrm.xlsx","HRMV", 1, 0);
		String password = fib.readExcel("./data/Orangehrm.xlsx","HRMV", 1, 1);
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("admin@123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		










	}

}
