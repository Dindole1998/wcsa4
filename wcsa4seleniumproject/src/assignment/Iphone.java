package assignment;

import java.awt.AWTException;
import java.awt.RenderingHints.Key;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iphone {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.flipkart.com/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[.='✕']")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("q")).sendKeys("Iphone red");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[.='APPLE iPhone 11 (Red, 64 GB)']")).click();	
		Thread.sleep(1000);
		String parentHandle = driver.getWindowHandle();

		Set<String> allHandles = driver.getWindowHandles();
		for(String wh:allHandles)
		{
			if(!parentHandle.equals(allHandles))
			{
				driver.switchTo().window(wh);
			}
		}
		driver.findElement(By.xpath("(//div[@class='_2C41yO'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='_1fGeJ5 PP89tw']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='_36yFo0']")).sendKeys("411033");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='_2P_LDn']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//div[@class='_10vWcL td-FUv WDiNrH']/descendant::div[.='Remove']")).click();
		WebElement removeButton = driver.findElement(By.xpath("//div[.='Remove']"));
		Point point = removeButton.getLocation();
		int xaxis = point.getX();
		int yaxis = point.getY();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		System.out.println(xaxis);
		System.out.println(yaxis);
		js.executeScript("window.scrollBy(369,613)");
		Thread.sleep(1000);
		 driver.findElement(By.xpath("//div[.='Remove']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='_3dsJAO _24d-qY FhkMJZ']")).click();


	}


}

