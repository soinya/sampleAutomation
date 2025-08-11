package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class LoginPage1 {

	WebDriver driver;

	public LoginPage1(WebDriver driver) {

		this.driver = driver;

	}

	By username = By.xpath("//input[@id='loginform-username']");

	By password = By.xpath("//input[@id='loginform-password']");

	By loginBtn = By.xpath("//button[text()='Login']");

	public void enterUserNameAndPassword(String userName, String passWord) {
		driver.findElement(username).sendKeys(userName);
		driver.findElement(password).sendKeys(passWord);
	}

	public void clickOnLoginButton() {
		driver.findElement(loginBtn).click();
	}

}
