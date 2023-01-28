package mockscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class hplaptop {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		 driver.findElement(By.xpath("//button[.='✕']")).click();
	    driver.findElement(By.name("q")).sendKeys("Laptop");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//div[.='Core i7']/preceding-sibling::div[@class='_24_Dny']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[@class='_2gmUFU _3V8rao'and(.='Brand')]")).click();
       Thread.sleep(3000);
        driver.findElement(By.xpath("//div[.='HP']/preceding-sibling::div[@class='_24_Dny']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@class='_2gmUFU _3V8rao'and(.='Operating System')]")).click();
		Thread.sleep(4000);		
		driver.findElement(By.xpath("//div[.='4★ & above']")).click();
		Thread.sleep(2000);
        String PriceofLaptop = driver.findElement(By.xpath("//div[.='₹1,04,900']")).getText();
        System.out.println(PriceofLaptop);
        //String PriceOfLaptop = driver.findElement(By.xpath("//div[@class='_4rR01T']/ancestor::div[@class='_3pLy-c row']/descendant::div[@class='_30jeq3 _1_WHN1']")).getText();
    
	}

}
