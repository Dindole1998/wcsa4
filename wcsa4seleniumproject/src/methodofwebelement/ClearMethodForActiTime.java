package methodofwebelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearMethodForActiTime {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
		driver.get("http://127.0.0.1/login.do;jsessionid=39dsipraglm9p");
		
		WebElement UsernameTextBox = driver.findElement(By.name("username"));
		UsernameTextBox.sendKeys("Admin");
		Thread.sleep(2000);
		UsernameTextBox.clear();
		WebElement PasswordTextBox = driver.findElement(By.name("pwd"));
		PasswordTextBox.sendKeys("manager");
		Thread.sleep(2000);
		PasswordTextBox.clear();
		

}
}
//label[contains(text(),'Keep me logged in unless I log out')]