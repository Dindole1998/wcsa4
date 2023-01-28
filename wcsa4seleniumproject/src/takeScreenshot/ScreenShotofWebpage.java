package takeScreenshot;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class ScreenShotofWebpage {

	// directly creating object of browser specific class
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://www.bluestone.com/jewellery/watch+band.html");
		File src = driver.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenShots/ScreenShot1.jpg");
		com.google.common.io.
		Files.copy(src, dest);

	}

}
