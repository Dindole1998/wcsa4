package javascriptexecutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrollup {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://www.selenium.dev/downloads/");
		
		//typecasting of javascriptexecutor for handle disable webelement
	 JavascriptExecutor js = (JavascriptExecutor)driver;
	 Thread.sleep(2000);
	 // SCROLL DOWN
	      js.executeAsyncScript("window.scrollBy(0,5000)");
	      Thread.sleep(2000);
	      js.executeAsyncScript("window.scrollBy(0,-4500)");
	      

}
}