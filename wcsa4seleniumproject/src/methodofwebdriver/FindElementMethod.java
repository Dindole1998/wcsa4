package methodofwebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementMethod {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://admin-pc/login.do");

		WebElement usernameTextBox = driver.findElement(By.name("username"));
		usernameTextBox.sendKeys("admin");
		System.out.println(usernameTextBox);
		//Adress Of Webelement=[[ChromeDriver: chrome on WINDOWS (3fe5793d5e3e7586abbc2b67dba7fabd)] -> name: username]		 
		Thread.sleep(1000);
		WebElement passwordTextBox = driver.findElement(By.name("pwd"));
		passwordTextBox.sendKeys("manager");
		System.out.println(passwordTextBox);
		Thread.sleep(1000);
		//adress for webelement [[ChromeDriver: chrome on WINDOWS (73e1b593d27e071a62d7a56a14ec1530)] -> name: pwd]
		WebElement LoginButton = driver.findElement(By.id("loginButton"));
		LoginButton.click();
		System.out.println(LoginButton);
		//Adress OF WEBELEMENT=[[ChromeDriver: chrome on WINDOWS (8d80556e1a811cf19b7d9d298bf48d83)] -> id: loginButton]		  
		WebElement LogoutButton = driver.findElement(By.xpath("//a[.='Logout']"));
		LoginButton.click();
		System.out.println(LogoutButton);

	}

}
