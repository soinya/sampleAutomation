package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Locators extends Base{
	
	public void idLocator() {
		
		WebElement messagefield = driver.findElement(By.id("single-input-field"));
		
		WebElement valueA = driver.findElement(By.id("placeholder"));
		
		WebElement valueB = driver.findElement(By.id("value-b"));
		
		WebElement showMsg = driver.findElement(By.id("button-one"));
		
		WebElement getTotal = driver.findElement(By.id("button-two"));
		
	}
	
	public void nameLocator() {
		
		WebElement desc = driver.findElement(By.name("description"));
		
	}
	
	public void classNameLocator() {
		WebElement msg = driver.findElement(By.className("form-control"));
		WebElement showmsg = driver.findElement(By.className("btn btn-primary"));
	}
	
	public void tagNameLocator() {
		WebElement msg = driver.findElement(By.tagName("input"));
		WebElement showmsg = driver.findElement(By.tagName("button"));
	}
	
	public void linkTextLocator() {
		WebElement checkBoxDemo = driver.findElement(By.linkText("Checkbox Demo"));
		WebElement selectInput = driver.findElement(By.linkText("Select Input"));
	}
	
	public void partialLinkTextLocator() {
		WebElement checkBoxDemo = driver.findElement(By.linkText("Checkbox"));
		WebElement selectInput = driver.findElement(By.linkText("Select"));
	}
	
	public void cssLocator() {
		//driver.findElement(By.cssSelector(“<tagname>#<id value>”));
		WebElement ele1 = driver.findElement(By.cssSelector("input#single-input-field"));
		
		//driver.findElement(By.cssSelector(“<tagname>.<class value>”));
		WebElement ele2 = driver.findElement(By.cssSelector("input.form-control"));
		
		//driver.findElement(By.cssSelector(“<tagname>[href=’<href value>’]”));
		WebElement ele3 = driver.findElement(By.cssSelector("input[id='single-input-field']"));
		
		//driver.findElement(By.cssSelector(“<tagname>#<id value>[href=’<href value>’]”));
		WebElement ele4 = driver.findElement(By.cssSelector("input#single-input-field[type='single-input-field']"));
		
	}

	public void absoluteXpath() {
		WebElement ele = driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[1]/div/div[2]/form/div[1]/input"));
	}
	
	public void relativeXpath() {
		WebElement ele = driver.findElement(By.xpath("//input[@id='single-input-field']"));
		
		//contains
		WebElement ele1 = driver.findElement(By.xpath("//input[contains(@id,'single')]"));
		
		//textMethod
		WebElement ele2 = driver.findElement(By.xpath("//button[text()='Show Message']"));
		
		//Index
		WebElement ele3 = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locators obj = new Locators();
		
		obj.BrowserInitialization();

	}

}
