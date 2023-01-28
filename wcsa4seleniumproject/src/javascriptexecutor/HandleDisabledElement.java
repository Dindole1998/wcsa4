package javascriptexecutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;

public class HandleDisabledElement {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("file:///C:/Users/admin/Desktop/WCSA4/DisabledElement.html");
		
		//typecasting of javascriptexecutor for handle disable webelement
	 JavascriptExecutor js = (JavascriptExecutor)driver;
	 Thread.sleep(2000);
	 js.executeAsyncScript("document.getElementById('i2').value='admin'");
	
		
	}

}
