package scenarios;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class scenario4 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();	
         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
         driver.get("https://www.ebay.com/");
         driver.findElement(By.xpath("//input[@class='gh-tb ui-autocomplete-input']")).sendKeys("Apple watches");
        Thread.sleep(1000);
        WebElement dropdown = driver.findElement(By.xpath("//select[@id='gh-cat']"));
         Select sel = new Select(dropdown);
         Thread.sleep(2000);
         sel.selectByValue("281");
         Thread.sleep(1000);
         WebElement searchButton = driver.findElement(By.xpath("//input[@type='submit']"));
         searchButton.submit();
        String product10 = driver.findElement(By.xpath("(//span[@role='heading'])[10]")).getText();
         System.out.println(product10);
	}

}
