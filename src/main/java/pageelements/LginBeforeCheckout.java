package pageelements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.AbstractMethods;

public class LginBeforeCheckout extends AbstractMethods 
{
	WebDriver driver;
	
	public LginBeforeCheckout(WebDriver d) {
		super(d);
		this.driver = d;
		PageFactory.initElements(driver, this);
		}
	@FindBy(xpath="//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a")
	WebElement login;
	@FindBy(xpath="//*[@id=\"form\"]/div/div/div[1]/div/form/input[2]")
	WebElement email;
	@FindBy(xpath="//*[@id=\"form\"]/div/div/div[1]/div/form/input[3]")
	WebElement pass1;
	@FindBy(xpath="//*[@id=\"form\"]/div/div/div[1]/div/form/button")
	WebElement submit;
	
	public void loginbeforecheckout() throws InterruptedException 
	{
		
		implicitlywaitmethod();
		login.click();
		email.sendKeys("amithashagale84@gmail.com");
		pass1.sendKeys("Sandhya@123");
		submit.click();
		System.out.println("'Logged in as username' is visible");
		Thread.sleep(3000);
		AddProductCart ap=new AddProductCart(driver);
		Thread.sleep(3000);
		ap.addcarts();
		Thread.sleep(3000);
		ap.addcart();
		Thread.sleep(3000);
		RegisterWhileCheckOut rw=new RegisterWhileCheckOut(driver);
		rw.placeorder();
		rw.deleteacc();
	}
	
	
}
