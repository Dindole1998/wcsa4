package methodofwebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetPageSourceMethod {
         public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			  WebDriver driver =new ChromeDriver();
			  driver.manage().window().maximize();
			  driver.get("file:///C:/Users/admin/Desktop/WCSA4/Checkbox.html");
			      String SourceCode = driver.getTitle();
			      Thread.sleep(1000);
			      System.out.println(SourceCode);
		}
}
