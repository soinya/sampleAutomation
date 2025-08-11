package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver driver) {

		this.driver = driver;

		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//input[@id='loginform-username']")
	private WebElement username;// to locate elements

	@FindBy(xpath = "//input[@id='loginform-password']")
	WebElement password;

	@FindBy(xpath = "//button[text()='Login']")
	WebElement loginBtn;

	public void enterUserNameAndPassword(String usernameFiled, String passwordField) {
		username.sendKeys(usernameFiled);
		password.sendKeys(passwordField);
	}
	
	public void clickOnLoginButton() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(loginBtn));
		loginBtn.click();
	}

}
