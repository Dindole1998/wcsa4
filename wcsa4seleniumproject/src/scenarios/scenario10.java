package scenarios;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class scenario10 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://www.bluestone.com/");
		driver.findElement(By.xpath("//span[.='Allow']")).click();
		Thread.sleep(1000);
		WebElement chat = driver.findElement(By.xpath("//div[@id='chat-icon']"));
		Actions act = new Actions(driver);
		act.moveToElement(chat).perform();
		chat.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='name']")).sendKeys("prasad");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='chat-fc-email']")).sendKeys("prasaddindole99@gmail.com");
		driver.findElement(By.xpath("//input[@id='chat-fc-phone']")).sendKeys("9763720299");
		driver.findElement(By.xpath("//a[@class='fc-button']")).click();
		
		String output = driver.findElement(By.xpath("//div[.='Thank you!! for contacting BlueStone .']")).getText();
		System.out.println(output);
		
	}

}
