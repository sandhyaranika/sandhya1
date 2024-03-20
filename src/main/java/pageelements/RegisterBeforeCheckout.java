package pageelements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.AbstractMethods;

public class RegisterBeforeCheckout extends AbstractMethods 
{
	WebDriver driver;
	public RegisterPage rp;
	

	
	public RegisterBeforeCheckout(WebDriver d) 
	{
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
	@FindBy(xpath="/html/body/section[2]/div[1]/div/div[2]/div[1]/div[2]/div/div[1]/div[1]/a")
	WebElement cart03;
	@FindBy(xpath="//*[@id=\"cartModal\"]/div/div/div[2]/p[2]/a")
	WebElement viewcart;
	
	
    public void beforecheckout() throws InterruptedException 
    {
    	implicitlywaitmethod();
    	login.click();
    	email.sendKeys("aksa234@gmail.com");
    	name.sendKeys("sandhya");
    	submit.click();
    	RegisterPage rp=new RegisterPage(driver);
		rp.register();
		System.out.println("Logged name is visible");
		Thread.sleep(2000);
		cart03.click();
		Thread.sleep(2000);
		viewcart.click();
    }
		
		public void proceed() 
		{
			RegisterWhileCheckOut rw=new RegisterWhileCheckOut(driver);
			rw.placeorder();
			System.out.println("'Your order has been placed successfully!'");
			rw.deleteacc();
			System.out.println("Verify 'ACCOUNT DELETED!' and click 'Continue' button");
			
		}

    	
    }

    
