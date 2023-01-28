
package methodofwebdriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class GetMethodFirfox {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		 FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	     String titleofwebpage = driver.getTitle();
		System.out.println("Instagram");
		driver.close();

	}

}
