package scenarios;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scenario8 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://www.bluestone.com/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[.='Allow']")).click();
		Thread.sleep(2000);
		WebElement alljewellery = driver.findElement(By.xpath("//a[@title='Jewellery']"));
		Actions act = new Actions(driver);
		act.moveToElement(alljewellery).perform();
		driver.findElement(By.xpath("//a[@title='Kadas']")).click();
		





	}

}
