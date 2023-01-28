package dataDrivenFrameWork;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeValidLogin {
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://admin-pc/login.do");
		
		Flib flib = new Flib();
		String username = flib.readExcelData("./data/ActiTimeTestData.xlsx","validdata", 1, 0);
		String password = flib.readExcelData("./data/ActiTimeTestData.xlsx", "validdata", 1, 1);

		driver.findElement(By.name("username")).sendKeys("admin");
		Thread.sleep(1000);
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
	}


}
