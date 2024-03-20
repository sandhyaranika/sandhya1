package pageelements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.AbstractMethods;

public class RegisterWithExistingMail extends AbstractMethods
{
    WebDriver driver;
	public RegisterWithExistingMail(WebDriver d) {
		super(d);
		this.driver = d;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a")
	WebElement login;
	@FindBy(xpath="//*[@id=\"form\"]/div/div/div[3]/div/form/input[3]")
	WebElement email;
	@FindBy(xpath="//*[@id=\"form\"]/div/div/div[3]/div/form/input[2]")
	WebElement name;
	@FindBy(xpath="//*[@id=\"form\"]/div/div/div[3]/div/form/button")
			WebElement submit;
	
	public void existingemail() throws InterruptedException
	{
		implicitlywaitmethod();
		login.click();
		System.out.println("Verify 'New User Signup!' is visible");
		email.sendKeys("amithashagale84@gmail.com");
		name.sendKeys("Sandhya@123");
		submit.click();
		System.out.println("Verify error 'Email Address already exist!' is visible");
		
	}

}
