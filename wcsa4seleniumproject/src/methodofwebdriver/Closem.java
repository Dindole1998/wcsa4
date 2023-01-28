package methodofwebdriver;

import org.openqa.selenium.By;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Closem {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		    FirefoxDriver driver = new FirefoxDriver();
		    driver.manage().window().maximize();
		    driver.get("http://omayo.blogspot.com/");
		    driver.findElement(By.xpath("//a[.='Open a popup window']")).click();
		    Thread.sleep(7000);
		    driver.close();
		    
	}

}
