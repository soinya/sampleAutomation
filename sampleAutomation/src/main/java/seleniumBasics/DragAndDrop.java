package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop extends Base{
	
	public void dragAndDrop() {
		
		driver.navigate().to("https://selenium.qabible.in/drag-drop.php");
		
		WebElement draggable1 = driver.findElement(By.xpath("//span[text()='Draggable n°1']"));
		
		Actions actions = new Actions(driver);
		
		//actions.moveToElement(draggable1).doubleClick().perform();
		//actions.moveToElement(draggable1).click().perform();
		//actions.doubleClick(draggable1).perform();
		
		WebElement dropzone = driver.findElement(By.xpath("//div[@id='mydropzone']"));
		
		actions.dragAndDrop(draggable1, dropzone).build().perform();
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DragAndDrop dragAndDrop = new DragAndDrop();
		
		dragAndDrop.BrowserInitialization();
		
		dragAndDrop.dragAndDrop();
	}

}
