package seleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	
	WebDriver driver;

	public void BrowserInitialization() {
		 driver = new ChromeDriver();
		 driver.get("https://selenium.qabible.in/index.php");
		 driver.manage().window().maximize();
	}
	
	public void quitAndClose() {
		//driver.close();
		driver.quit();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Base obj = new Base();
		
		obj.BrowserInitialization();

		obj.quitAndClose();
	}

}
