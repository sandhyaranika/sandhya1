package pageelements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.AbstractMethods;

public class LoginWithIncorrectDetails extends AbstractMethods
{
	WebDriver driver;

	public LoginWithIncorrectDetails(WebDriver d) {
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
	
	public void loginwithincorrectdetails()
	{
		implicitlywaitmethod();
		loginpage.click();
		login_Email.sendKeys("litha20@gmail.com");
		password_login.sendKeys("sfgh123");
		login_button.click();
		System.out.println("Your email or password is incorrect!' is visible");
	}
	

}
