package scenarios;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Scenario7 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://www.bluestone.com/");
		driver.findElement(By.xpath("//span[.='Allow']")).click();
		WebElement alljewe= driver.findElement(By.xpath("//a[@title='Jewellery']"));
		Actions act = new Actions(driver);
		act.moveToElement(alljewe).perform();
		driver.findElement(By.xpath("//span[.='Kadas']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//img[@class='hc img-responsive center-block'])[1]")).click();
		Thread.sleep(1000);
		//WebElement dropdown = driver.findElement(By.xpath("//span[@class='icon-ion-android-arrow-dropdown']"));
		//Select sel = new Select(dropdown);
		//Thread.sleep(2000);
		//sel.selectByVisibleText("2-4(2 4/16\")");
		WebElement buynowbutton = driver.findElement(By.xpath("(//input[@type='submit'])[1]"));
		Thread.sleep(2000);
		buynowbutton.submit();




	}

}
