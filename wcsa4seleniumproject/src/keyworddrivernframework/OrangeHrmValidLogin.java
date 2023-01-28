package keyworddrivernframework;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHrmValidLogin {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		Flib flib = new Flib();
		String url = flib.readpropertyData("./data/hrmconfig.properties","Url");

		String username = flib.readpropertyData("./data/hrmconfig.properties","Username");
		Thread.sleep(2000);
		String password = flib.readpropertyData("./data/hrmconfig.properties","Password");

		driver.get(url);
		driver.findElement(By.name("username")).sendKeys(username);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(password);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();

	}

}
