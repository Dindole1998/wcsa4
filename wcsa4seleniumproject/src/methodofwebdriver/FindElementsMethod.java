package methodofwebdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsMethod {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");

		driver.switchTo().activeElement().sendKeys("Poha");
		Thread.sleep(1000);
		List<WebElement> suggestion = driver.findElements(By.xpath("//div[@class='wM6W7d']"));
		for(int i=0;i<suggestion.size();i++)
		{
		  WebElement options = suggestion.get(i);
			String opt = options.getText();
			Thread.sleep(2000);
			System.out.println(opt);
		}

	}

}












//div[@class='wM6W7d']