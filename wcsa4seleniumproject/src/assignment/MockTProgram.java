package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MockTProgram {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.flipkart.com/");
		 driver.findElement(By.xpath("//button[.='✕']")).click();
		 driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Laptop");
		 driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//div[.='Core i7']")).click();
		 Thread.sleep(2000);
	driver.findElement(By.xpath("//div[.='Core i7']/preceding-sibling::div[@class='_24_Dny']")).click();
	Thread.sleep(3000);
		 driver.findElement(By.xpath("//div[@class='_2gmUFU _3V8rao'and(.='Brand')]")).click();
	Thread.sleep(2000);
		 driver.findElement(By.xpath("//div[.='HP']/preceding-sibling::div[@class='_24_Dny']")).click();
		 Thread.sleep(4000);
		 driver.findElement(By.xpath("//div[@class='_2gmUFU _3V8rao'and(.='Operating System')]")).click();
		 Thread.sleep(4000);
		 driver.findElement(By.xpath("//div[.='Windows 10']/preceding-sibling::div[@class='_24_Dny']")).click();
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//div[.='4★ & above']")).click();	
		 Thread.sleep(2000);
	  String price = driver.findElement(By.xpath("//div[@class='_4rR01T']/../following-sibling::div[@class='col col-5-12 nlI3QM']/ancestor::div[@class='_3pLy-c row']")).getText();
		 Thread.sleep(4000);
		 System.out.println(price+"is the price of Hp Lpatop");
		 
		 
		 
		 
		 
		 
		 
		
	}

}
