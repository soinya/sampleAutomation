package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class InputForm extends Base{
	
	public void enterMessage() {
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		
		WebElement enterMessage = driver.findElement(By.xpath("//input[@id='single-input-field']"));
		
		System.out.println(enterMessage.isEnabled());
		
		enterMessage.sendKeys("Hello");
				
		WebElement showMessage = driver.findElement(By.xpath("//button[@id='button-one']"));
		
		showMessage.click();
	}
	
	public void twoInputField() {
		
		WebElement valueA = driver.findElement(By.id("value-a"));
		valueA.sendKeys("25");
		
		WebElement valueB = driver.findElement(By.id("value-b"));
		valueB.sendKeys("30");
		
		WebElement getTotal = driver.findElement(By.xpath("//button[text()='Get Total']"));
		getTotal.click();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InputForm obj = new InputForm();
		
		obj.BrowserInitialization();
		
		obj.enterMessage();
		
		obj.twoInputField();

	}

}
