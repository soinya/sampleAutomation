package seleniumBasics;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowHandling {
	
	WebDriver driver;
	
	public void multipleWindowHandling() {
		
		driver = new ChromeDriver();
		
		driver.get("https://webdriveruniversity.com/");
		
		driver.manage().window().maximize();
		
		//Click Contact us
		WebElement contactUs = driver.findElement(By.xpath("//h1[text()='CONTACT US']"));
		contactUs.click();
		
		//Click Login Portal
		WebElement loginPortal =driver.findElement(By.xpath("//h1[text()='LOGIN PORTAL']"));
		loginPortal.click();
		
		String Parent = driver.getWindowHandle();
		System.out.println("Parent: "+Parent);
		
		Set<String> ChildWindow = driver.getWindowHandles();
		
		System.out.println("Child Windows:");
		
		String title= "";
		
		for(String cWindow: ChildWindow) {
			
			if(!cWindow.equals(Parent)) {
		
			System.out.println(cWindow);
			
			driver.switchTo().window(cWindow);
			
			title = driver.getTitle();
			System.out.println("Title: "+title);
			
			}
		
		
		if(title.equals("WebDriver | Contact Us")) {
			
			//FirstName
			driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys("Soniya");
			
		}
		
		if(title.equals("WebDriver | Login Portal")) {
			
			//UserName
			driver.findElement(By.xpath("//input[@id='text']")).sendKeys("Soniya");
			
		}
		
		driver.switchTo().window(Parent);
		
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MultipleWindowHandling mwh = new MultipleWindowHandling();
		
		mwh.multipleWindowHandling();

	}

}
