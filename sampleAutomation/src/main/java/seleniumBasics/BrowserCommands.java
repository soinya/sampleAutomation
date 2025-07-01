package seleniumBasics;

public class BrowserCommands extends Base{

	public void browserCommands() {
		String title = driver.getTitle();
		
		System.out.println("Title: "+title);
		
		String url = driver.getCurrentUrl();
		
		System.out.println("URL: "+url);
		
		String pageSource = driver.getPageSource();
		
		System.out.println("Page Source: "+pageSource);
		
		//String = driver.getClass();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BrowserCommands obj = new BrowserCommands();
		
		obj.BrowserInitialization();
		
		obj.browserCommands();
	}

}
