package popups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUp {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("file:///C:/Users/admin/Desktop/WCSA4/Button1.html");
		WebElement button = driver.findElement(By.xpath("//button[@type='button']"));
		button.click();
		// now switch your control to alert popup
		Alert al = driver.switchTo().alert();

		//to accept the popup
		Thread.sleep(1000);
		//al.accept();

		// dismiss alert popup
		//al.dismiss();

		//to get the text of alert popup
			String textofalert = al.getText();
		System.out.println(textofalert);

		//al.sendKeys("admin");

	}

}
