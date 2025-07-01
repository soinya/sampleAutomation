package seleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FindElementsEg extends Base{
	
	public void findElementsEg() {
		
		driver.navigate().to("https://selenium.qabible.in/check-box-demo.php");
		List<WebElement> ele = driver.findElements(By.xpath("//input[@class='check-box-list']"));
		
		for(WebElement a:ele) {
			a.click();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FindElementsEg findEleEG = new FindElementsEg();
		
		findEleEG.BrowserInitialization();
		
		findEleEG.findElementsEg();
	}

}
