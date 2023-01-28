package scenarios;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scenario3 {
	public static void main(String[] args) throws InterruptedException {
         System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
         WebDriver driver=new ChromeDriver();	
         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
          driver.navigate().to("https://jqueryui.com/droppable/");
          Thread.sleep(2000);
          WebElement drag = driver.findElement(By.xpath("//div[@id='draggable']"));
         Thread.sleep(2000);
          WebElement droptarget = driver.findElement(By.xpath("//div[@id='droppable']"));
           Actions act = new Actions(driver);
           Thread.sleep(2000);
           act.dragAndDrop(drag, droptarget).perform();
        
             WebElement drop = driver.findElement(By.xpath("//p[.='Dropped!']"));
             String cssproperty = drop.getCssValue("#fffa90");
             System.out.println(cssproperty);
           
          
         
	}

}
