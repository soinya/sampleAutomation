package demoProject;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.LoginPage1;

public class LoginPageTest extends Base {
	
	  @Test
	  public void verifyLoginWithInvaidCredentials() {
			 LoginPage loginpage = new LoginPage(driver);
			  loginpage.enterUserNameAndPassword("bshd", "2346");
			  loginpage.clickOnLoginButton();
		  
	}
  @Test
  public void verifyLoginWithValidCredentials() {
	  //UserName
	/*  driver.findElement(By.xpath("//input[@id='loginform-username']")).sendKeys("carol");
	  
	  //Password
	  driver.findElement(By.xpath("//input[@id='loginform-password']")).sendKeys("1q2w3e4r");
	  
	  //RememberMe
	  driver.findElement(By.xpath("//input[@id='loginform-rememberme']")).click();
	  
	  //Login Button
	  driver.findElement(By.xpath("//button[text()='Login']")).click();*/
	  
	 LoginPage loginpage = new LoginPage(driver);
	  //LoginPage1 loginpage = new LoginPage1(driver);
	  loginpage.enterUserNameAndPassword("carol", "1q2w3e4r");
	  loginpage.clickOnLoginButton();
  }
  
  @Test
  @Parameters({"userName","password"})
  public void verifyLoginWithInvaidUsername(String userName, String password) {
		 LoginPage loginpage = new LoginPage(driver);
		  loginpage.enterUserNameAndPassword(userName,password);
		  loginpage.clickOnLoginButton();
	  
  }
  
  @Test(dataProvider = "credentials")
  public void verifyLoginWithInvaidPassword(String userName, String password) {
		 LoginPage loginpage = new LoginPage(driver);
		  loginpage.enterUserNameAndPassword(userName,password);
		  loginpage.clickOnLoginButton();
	  
}
  
  @DataProvider(name="credentials")

  public Object[][] testdata()
  {
	  Object data[][]= {{"carol", "1q2w3e4r"},{"bshd", "2346"},{"carol", "2346"},{"car", "1q2w3e4r"}};
	  return data;
  }
}
