package qsp;

import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFirefoxBrowser {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();// Launch The firfox Browser
		driver.manage().window().maximize(); //maximize the window of browser
		driver.get("https://www.instgram.com");
		
	}

}
