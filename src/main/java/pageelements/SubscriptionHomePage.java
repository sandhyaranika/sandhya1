package pageelements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.AbstractMethods;

public class SubscriptionHomePage extends AbstractMethods
{
	WebDriver driver;

	public SubscriptionHomePage(WebDriver d) {
			super(d);
			this.driver = d;
			PageFactory.initElements(driver, this);
			}
		@FindBy(xpath="//*[@id=\"footer\"]/div[1]/div/div/div[2]")
		WebElement footer;
		@FindBy(xpath="//*[@id=\"susbscribe_email\"]")
		WebElement email;
		@FindBy(xpath="//*[@id=\"subscribe\"]/i")
		WebElement arrow;
		public void clicksubs()
		{
			implicitlywaitmethod();
			footer.click();
			System.out.println("Verify text 'SUBSCRIPTION'");
			email.sendKeys("amithashagale84@gmail.com");
			arrow.click();
			System.out.println("'You have been successfully subscribed!' is visible");
}

}
