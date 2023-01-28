package testNGparallelExecution;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNg4 {
  @Test
  public void today() {
	  long threadId = Thread.currentThread().getId();
	  Reporter.log("today method"+threadId+"is the thread",true);
  }
  @Test
  public void tomarrow() {
	  long threadId = Thread.currentThread().getId();
	  Reporter.log("tomarrow method"+threadId+"is the thread",true);
}
  
  
  
  
  
}
