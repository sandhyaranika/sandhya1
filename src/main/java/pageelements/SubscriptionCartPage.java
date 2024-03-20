package pageelements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.AbstractMethods;

public class SubscriptionCartPage extends  AbstractMethods
{

	public SubscriptionCartPage(WebDriver d) {
		super(d);
		this.driver = d;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[3]/a/i")
	WebElement cart;
	@FindBy(xpath="//*[@id=\"footer\"]/div[2]/div/div")
	WebElement cart_footer;
	@FindBy(xpath="//*[@id=\"susbscribe_email\"]")
	WebElement cart_email;
	@FindBy(xpath="//*[@id=\"subscribe\"]/i")
	WebElement cart_arrow;
	
	public void subCartpage() {
		implicitlywaitmethod();
		cart.click();
		cart_footer.click();
		System.out.println("Verify text 'SUBSCRIPTION'");
		cart_email.sendKeys("amithashagale84@gmail.com");
		cart_arrow.click();
		System.out.println("'You have been successfully subscribed!' is visible");
	}


}
