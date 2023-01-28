package popups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmationPopUp {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("file:///C:/Users/admin/Desktop/WCSA4/ConfirmationPopUp.html");
		WebElement button = driver.findElement(By.xpath("//button[@type='button']"));
		button.click();
		Alert al = driver.switchTo().alert();
		//al.dismiss();
		Thread.sleep(2000);
		// accepting popup
		al.accept();
		
        String textofconfirm = al.getText();
        System.out.println(textofconfirm);
	}
}
