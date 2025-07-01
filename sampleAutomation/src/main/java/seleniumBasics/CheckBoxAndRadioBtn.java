package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CheckBoxAndRadioBtn extends Base{
	
	public void checkBoxDemo() {
		//driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		driver.navigate().to("https://selenium.qabible.in/check-box-demo.php");
		
		WebElement singleCB = driver.findElement(By.xpath("//input[@id='gridCheck']"));
		
		System.out.println(singleCB.isSelected());
		singleCB.click();
		
		//System.out.println(singleCB.isSelected());
	}
	
	public void radioBtn() {
		driver.navigate().to("https://selenium.qabible.in/radio-button-demo.php");
		
		WebElement rbdFemale= driver.findElement(By.xpath("//input[@id='inlineRadio2']"));
		
		rbdFemale.click();
		
		WebElement showbtn = driver.findElement(By.id("button-one"));
		
		showbtn.click();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CheckBoxAndRadioBtn obj = new CheckBoxAndRadioBtn();
		
		obj.BrowserInitialization();
		
		obj.checkBoxDemo();
		
		//obj.radioBtn();
	}

}
