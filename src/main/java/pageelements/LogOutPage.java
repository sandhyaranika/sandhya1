package pageelements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.AbstractMethods;

public class LogOutPage extends AbstractMethods
{
	WebDriver driver;

	public LogOutPage(WebDriver d) {
		super(d);
		this.driver = d;
		PageFactory.initElements(driver, this);
		}
	
	@FindBy(xpath="//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a")
	WebElement loginpage;
	@FindBy(xpath="//*[@id=\"form\"]/div/div/div[1]/div/form/input[2]")
	WebElement login_Email;
	@FindBy(xpath="//*[@id=\"form\"]/div/div/div[1]/div/form/input[3]")
	WebElement password_login;
	@FindBy(xpath="//*[@id=\"form\"]/div/div/div[1]/div/form/button")
	WebElement login_button;
	@FindBy(xpath="//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a")
	WebElement logout;
	
	public void login()
	{
		implicitlywaitmethod();
		loginpage.click();
		System.out.println("Verify 'New User Signup!' is visible");
		login_Email.sendKeys("amithashagale84@gmail.com");
		password_login.sendKeys("Sandhya@123");
		login_button.click();
		System.out.println("Verify that 'Logged in as username' is visible");
		logout.click();
		driver.navigate().to("http://automationexercise.com");
		System.out.println("Verify that user is navigated to login page");

		
	}

}
