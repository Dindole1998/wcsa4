package mock;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkartByApplyingFilterLaptopPrice {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Hp laptops");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Core i7']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Brand']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='HP']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//div[text()='Operating System']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Windows 10']")).click();
		Thread.sleep(2000);

	    driver.findElement(By.xpath("//div[text()='4★ & above']")).click();
		Thread.sleep(2000);
		
		String priceOfLapto = driver.findElement(By.xpath("//div[@class='_4rR01T']/ancestor::div[@class='_3pLy-c row']//div[@class='_30jeq3 _1_WHN1']")).getText();
		
		System.out.println(priceOfLapto+":is the price of laptop");
	}

	}

