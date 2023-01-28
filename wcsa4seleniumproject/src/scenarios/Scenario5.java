package scenarios;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import net.bytebuddy.implementation.bytecode.constant.DefaultValue;

public class Scenario5 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));	
		driver.get("https://www.bluestone.com/");
		driver.findElement(By.xpath("//span[.='Allow']")).click();
		WebElement target = driver.findElement(By.xpath("//a[.='Rings ']"));
		Actions act = new Actions(driver);
		act.moveToElement(target).build().perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@title='Diamond Rings'])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[.='Price']")).click();
		List<WebElement> price = driver.findElements(By.xpath("//span[@class='new-price']"));
		for(int i=1;i<price.size();i++)
		{
			WebElement Value = price.get(i);
			String PriceList = Value.getText();
		Thread.sleep(2000);
		System.out.println(PriceList);//price list by default
		}
		driver.findElement(By.xpath("//span[.=' Popular ']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[.='Price Low to High ']")).click();
		List<WebElement> LowtoHigh = driver.findElements(By.xpath("//span[@class='new-price']"));
		System.out.println("price list from LowtoHigh");
		for(int i=1;i<LowtoHigh.size();i++)
		{
			WebElement value1= LowtoHigh.get(i);
			String priceList = value1.getText();
			Thread.sleep(1000);
			System.out.println(priceList);// price list from LowtoHigh
		}
		//List<WebElement> ;
		//if(PriceList==LowtoHigh);
		//{
			
	//	}
		driver.close();
	
	
	
	
	
	}
}
