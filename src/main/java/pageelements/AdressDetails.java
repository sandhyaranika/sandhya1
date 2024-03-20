package pageelements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.AbstractMethods;

public class AdressDetails extends AbstractMethods {
    public	WebDriver driver;
	public RegisterBeforeCheckout rb;

	public AdressDetails(WebDriver d) {
		super(d);
		this.driver = d;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//*[@id=\"do_action\"]/div[1]/div/div/a")
	WebElement checkout;
	@FindBy(xpath="//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[5]/a")
	WebElement del;
	@FindBy(xpath="//*[@id=\"form\"]/div/div/div/div/a")
	WebElement cont;


public void adressdetails() throws InterruptedException 
{
	implicitlywaitmethod();
	Thread.sleep(3000);
	RegisterBeforeCheckout rb  =new RegisterBeforeCheckout(driver);
	rb.beforecheckout();
	checkout.click();
	System.out.println("Deliver and Billing Address are same in registration of account");
    del.click();
	cont.click();
	
}
}  