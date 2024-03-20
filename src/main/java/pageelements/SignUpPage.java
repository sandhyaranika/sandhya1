package pageelements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.AbstractMethods;

public class SignUpPage extends AbstractMethods
{
	WebDriver driver;

	public SignUpPage(WebDriver d) {
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
		
		public void enterSignupdetails(String Name, String Email) throws InterruptedException {
			implicitlywaitmethod();	
			login.click();
			System.out.println("'New User Signup!' is visible");
			name.sendKeys(Name);
			email.sendKeys(Email);
			submit.click();
			
		}

	}


