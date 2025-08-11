package testngCode;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class Annotations {
  @Test
  public void testMethod1() {
	  
	  System.out.println("testMethod1");
  }
  
  @Test
  public void testMethod2() {
	  
	  System.out.println("testMethod2");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("beforeMethod");
  }

  @AfterMethod
  public void afterMethod() {
	  
	  System.out.println("afterMethod");
  }

}
