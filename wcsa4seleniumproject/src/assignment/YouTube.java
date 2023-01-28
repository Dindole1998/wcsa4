package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class YouTube {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://www.youtube.com/");
	 Thread.sleep(2000);
	 
	 List<WebElement> name = driver.findElements(By.xpath("//div[@class='style-scope ytd-rich-shelf-renderer']"));
	  for(int i=0;i<name.size();i++)
			 {
			  WebElement video = name.get(i);
				 String v = video.getText();
				 Thread.sleep(2000);
				 System.out.println(v);
			 }
	  List<WebElement> view = driver.findElements(By.xpath("//span[@class='inline-metadata-item style-scope ytd-video-meta-block']"));
	  for(int  j=0;j<view.size();j++)
		 {
		     WebElement no = view.get(j);
		    String number = no.getText();
		    Thread.sleep(10000);
		    System.out.println(number);
		    
		 }
}
}

