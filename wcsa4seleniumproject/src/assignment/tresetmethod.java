package assignment;

import java.time.Duration;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class tresetmethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	  driver.get("file:///C:/Users/admin/Desktop/WCSA4/Multi%20Select%20Dropdown3.html");
	  
	  WebElement dropDownElement = driver.findElement(By.id("menu"));
	              Select sel = new Select(dropDownElement);
	              // to get option
          List<WebElement> alloptions = sel.getOptions();
                      TreeSet<String> T = new TreeSet<String>();
       // HashSet<String> s = new HashSet<String>();
          for(int i=0;i<alloptions.size();i++)
          {
        	  WebElement opts = alloptions.get(i);
        	 String values = opts.getText();
        	 T.add(values);
          }
          for(String Option:T)
          {
        	  System.out.println(Option);
          }
}

}