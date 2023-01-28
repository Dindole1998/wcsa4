package methodofwebdriver;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.netty.util.internal.SystemPropertyUtil;

public class getWindowHandles {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("http://omayo.blogspot.com/");
		driver.findElement(By.xpath("//a[.='Open a popup window']")).click();
		String parentHandle = driver.getWindowHandle();
		System.out.println(parentHandle);//Adress of parent window
		System.out.println("-------------------------------------------------");
		Set<String> allHandles = driver.getWindowHandles();
		System.out.println(allHandles);
		for(String a:allHandles)
		{
			System.out.println(a);
		}
	}
}
