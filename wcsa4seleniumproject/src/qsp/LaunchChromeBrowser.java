package qsp;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChromeBrowser {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver(); // Launch The Chrome Browser
		driver.manage().window().maximize();// maximize the window of browser
		driver.get("https://www.instgram.com");
	}

}
