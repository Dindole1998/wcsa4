package qsp;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RunTimePolymorphism {
	public static void main(String[] args) throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Which Browser You want To open");
		String browserValue = sc.next();
		if(browserValue.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			WebDriver driver = new ChromeDriver();// to launch chrome browser
			driver.manage().window().maximize(); // to max the browser
			driver.get("https://www.instgram.com");// launch the web application
			Thread.sleep(6000);// to provode dealy for the script
			driver.close();// to close the browser
		} else if (browserValue.equalsIgnoreCase("firfox")) {
			System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
			FirefoxDriver driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get("https://www.instgram.com");
			Thread.sleep(6000);
			driver.close();
		}else {
			System.out.println("enter valid browser name");


		}
}

}
