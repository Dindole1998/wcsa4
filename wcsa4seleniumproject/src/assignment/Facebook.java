package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://accounts.google.com/");
		 Thread.sleep(2000);
		 driver.findElement(By.name("identifier")).sendKeys("aniketnikam0299@gmail.com");
		 Thread.sleep(2000);
		// driver.findElement(By.("VfPpkd-RLmnJb")).click();
		 //driver.findElement(By.name("password")).sendKeys("Aniket@123");
		 //driver.findElement(By.tagName("span")).click();
		 
		// Thread.sleep(1000);
		 //driver.findElement(By.name("password")).sendKeys("9763720299");
		 //Thread.sleep(1000);
		 //driver.findElement(By.className("_ab8w  _ab94 _ab99 _ab9f _ab9m _ab9p  _abak _abb8 _abbq _abb- _abcm")).click();
		 //driver.close();
	}

}
