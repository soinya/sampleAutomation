package seleniumBasics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AlertFind extends Base{
	
	public void alertFind() {
		
		driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
		
		WebElement clickMe = driver.findElement(By.xpath("//button[@class='btn btn-success']"));
		clickMe.click();
		
		driver.switchTo().alert().accept();
		
	}
	
	public void confirmBox() {
		
		driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
		
		//Click Me
		driver.findElement(By.xpath("//button[@class='btn btn-warning']")).click();
		
		driver.switchTo().alert().dismiss();
		
		
	}
	
	public void promtBox() {
		
		driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
		
		
		driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
		
		driver.switchTo().alert().sendKeys("Soniya George");
		
		driver.switchTo().alert().accept();
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AlertFind alertfind = new AlertFind();
		
		alertfind.BrowserInitialization();
		
		//alertfind.alertFind();
		
		//alertfind.confirmBox();
		
		alertfind.promtBox();

	}

}
