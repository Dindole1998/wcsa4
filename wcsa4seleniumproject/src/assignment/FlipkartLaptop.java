package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartLaptop {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.flipkart.com/");
		 driver.findElement(By.xpath("//button[.='✕']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("Hp Laptop");
		 Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[.='Core i7']/preceding-sibling::div[@class='_24_Dny']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[.='HP']/preceding-sibling::div[@class='_24_Dny']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[.='Windows 10']/preceding-sibling::div[@class='_24_Dny']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[.='4★ & above']/preceding-sibling::div[@class='_24_Dny']")).click();
			
			
		 
		 
		
	}

}









