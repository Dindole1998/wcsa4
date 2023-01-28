package methodofwebdriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getWindowHandle {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("http://omayo.blogspot.com/");
		driver.findElement(By.xpath("//a[.='Open a popup window']")).click();
          String parentHandle = driver.getWindowHandle();
          System.out.println(parentHandle);//Adress of parent window
          //CONSOLE OUTPU
          //CDwindow-D6B4E3830083B1101B804B252F89650B= IT WILL RETURN THE ADRESS OF Parent window
	
	
	}

}
