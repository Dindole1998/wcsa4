package methodofwebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitleMethod {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.get("\"https://opensource-demo.orangehrmlive.com/web/index.php/auth/login\"");
		String titleofwebpage = driver.getTitle();
		System.out.println("OrangHRM");
		Thread.sleep(4000);
		driver.close();


	}


}
