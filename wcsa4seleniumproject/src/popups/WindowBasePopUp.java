package popups;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowBasePopUp {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://127.0.0.1/login.do");
		Thread.sleep(1000);
		driver.findElement(By.name("username")).sendKeys("admin");
		Thread.sleep(1000);
		driver.findElement(By.name("pwd")).sendKeys("manager");
		Thread.sleep(1000);
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@class='content administration']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[.='Logo & Color Scheme']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//td[@class='aligned_radio_button_cell'])[2]")).click();
		Thread.sleep(1000);
		WebElement dclick = driver.findElement(By.name("formCustomInterfaceLogo.logo"));
		Actions click = new Actions(driver);
		click.doubleClick(dclick).perform();
		
		Runtime.getRuntime().exec("./autoit/VBS1.exe");
		Thread.sleep(2000);
		Runtime.getRuntime().exec("./autoit/VBS1.exe");
		









	}

}
