package methodofwebdriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assingment {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(1000);
		Dimension targetSize = new Dimension(450, 230);
		driver.manage().window().setSize(targetSize);
		Thread.sleep(1000);
		Point targetPosition = new Point(30,250);
		driver.manage().window().setPosition(targetPosition);

	}

}
