package methodofwebdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements2Method {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");

		driver.switchTo().activeElement().sendKeys("Poha");
		Thread.sleep(1000);
		List<WebElement> suggestion = driver.findElements(By.xpath("//div[@class='wM6W7d']"));// if we do the mistake in xpath we get empty lis
		for(WebElement suggest:suggestion)
		{
			String opt = suggest.getText();
			Thread.sleep(2000);
			System.out.println(opt);
		}
	}

}
