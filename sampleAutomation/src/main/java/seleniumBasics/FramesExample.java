package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FramesExample extends Base {
	
	public void frames() {
		
		driver.navigate().to("https://demo.guru99.com/test/guru99home/");
		
		WebElement iframe = driver.findElement(By.xpath("//iframe[@id='a077aa5e']"));
		driver.switchTo().frame(iframe);
		
		WebElement ele1 = driver.findElement(By.xpath("//img[@src='Jmeter720.png']"));
		ele1.click();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FramesExample framesexample = new FramesExample();
		
		framesexample.BrowserInitialization();
		framesexample.frames();
		

	}

}
