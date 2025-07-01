package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropDowns extends Base{
	
	public void handlingDropDowns() {
		driver.navigate().to("https://selenium.qabible.in/select-input.php");
		
		WebElement ele = driver.findElement(By.xpath("//select[@id='single-input-field']"));
		
		Select select = new Select(ele);
		
		//select.selectByIndex(2);
		
		//select.selectByValue("Green");
		
		select.selectByVisibleText("Red");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HandlingDropDowns hDropDwns = new HandlingDropDowns();
		
		hDropDwns.BrowserInitialization();
		
		hDropDwns.handlingDropDowns();

	}

}
