package takeScreenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.google.common.io.Files;

public class ScreenShotOfImage {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 EventFiringWebDriver eft = new EventFiringWebDriver(driver); //4TH Type
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	driver.get("https://www.google.com/search?rlz=1C1RXQR_enIN1011IN1011&q=Avatar+movie+poster&tbm=isch&chips=q:avatar+movie+poster,g_1:wallpaper:HWJhSRNkKc4%3D&usg=AI4_-kRY_Crjn7hAiCa5N3avSeTXSV7JSQ&sa=X&ved=2ahUKEwjG9tifjZ78AhWVXHwKHdaVD4YQgIoDKAR6BAgJECA&biw=629&bih=657&dpr=1#imgrc=8s7g_z9ruDKUaM");
	    File src = eft.getScreenshotAs(OutputType.FILE);
	     File dest = new File("./screenShots/Avtar.png");
	     Files.copy(src, dest);
	 
	}

}
