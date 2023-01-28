package testNGpack;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo {
  @Test
  public void demo() {
   //System.out.println("This is method of demo class");
   Reporter.log("This is method of demo",true);
  }
  @Test
  public void demo1()
  {
	  Reporter.log("This is demo1 method",true);
  }
  @Test
  public void demo2()
  {
	  int a=78;
	  int b=0;
	  int c=a/b;
	  Reporter.log("This is demo2 method",true);
  }
}
