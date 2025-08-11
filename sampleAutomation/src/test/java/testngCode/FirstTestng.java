package testngCode;

import org.testng.annotations.Test;

public class FirstTestng {
  @Test(priority =2)
  public void f() {
	  
	  System.out.println("Hello world");
  }
  
  @Test(priority =1)
  
  public void test() {
	  System.out.println("test");
  }
}
