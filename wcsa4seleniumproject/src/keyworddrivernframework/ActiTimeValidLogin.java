package keyworddrivernframework;

import java.io.FileInputStream;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeValidLogin {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		Flib flib = new Flib();
		String url = flib.readpropertyData("./data/config.properties","Url");

		String username = flib.readpropertyData("./data/config.properties", "Username");
		String password = flib.readpropertyData("./data/config.properties", "Password");

		driver.get(url);
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("pwd")).sendKeys(password);
		Thread.sleep(1000);
		driver.findElement(By.id("loginButton")).click();
	}
}
