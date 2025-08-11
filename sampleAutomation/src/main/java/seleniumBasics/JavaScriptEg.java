package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptEg {
	
	WebDriver driver;
	
	public void javaScriptEg() {
		
		driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		//js.executeScript("window.scrollBy(0,2000)");
		
		//js.executeScript("window.scrollBy(0,-500)");
		
		WebElement search = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		
		js.executeScript("arguments[0].click();", search);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JavaScriptEg javascripteg = new JavaScriptEg();
		
		javascripteg.javaScriptEg();

	}

}
