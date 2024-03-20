package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest 
{
public WebDriver driver;
	
	public WebDriver intialisebrowser() {
		
		driver = new ChromeDriver();
		return driver;
	}
	
	
}
