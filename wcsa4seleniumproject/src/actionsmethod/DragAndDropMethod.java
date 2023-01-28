package actionsmethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropMethod {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://demo.guru99.com/test/drag_drop.html");
		  Thread.sleep(2000);
		  WebElement src = driver.findElement(By.xpath("//a[.=' BANK ']"));
		  Thread.sleep(1000);
		   WebElement target = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		   Actions act = new Actions(driver);
		   WebElement src1 = driver.findElement(By.xpath("//a[.=' 5000 ']"));
		   Thread.sleep(1000);
		   WebElement target1 = driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
		   Actions act1 = new Actions(driver);
		   act.dragAndDrop(src, target).perform(); // drag drop for bank
		   act.dragAndDrop(src1, target1).perform(); // drag drop for 5000 amount
		  
		  
}
}
