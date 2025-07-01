package seleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HWFindElements extends Base{
	
	public void hwFindElements() {
		
		//driver.findElement(By.linkText("INPUT FORM")).click();
		
		driver.findElement(By.partialLinkText("INPUT")).click();
		List<WebElement> ele = driver.findElements(By.xpath("//input[@class='form-control']"));
		
		for(WebElement a: ele) {
			a.sendKeys("Hello World");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HWFindElements fndEle = new HWFindElements();
		
		fndEle.BrowserInitialization();
		
		fndEle.hwFindElements();

	}

}
