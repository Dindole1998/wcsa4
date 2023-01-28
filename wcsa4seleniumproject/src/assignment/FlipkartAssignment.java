package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartAssignment {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.flipkart.com/");
          Thread.sleep(2000);
          driver.findElement(By.xpath("//a[@class='class']")).click();
          Thread.sleep(4000);
          driver.findElement(By.xpath("//button[.='✕']")).click();
          Thread.sleep(2000);

}
}

//div[.='SAMSUNG Galaxy F13 (Waterfall Blue, 64 GB)']/ancestor::div[@class='_3pLy-c row']/descendant::div[@class='_30jeq3 _1_WHN1']