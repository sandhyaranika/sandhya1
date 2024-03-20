package pageelements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.AbstractMethods;

public class ScrollWithArrow extends AbstractMethods
{
	WebDriver driver;

	public ScrollWithArrow(WebDriver d) {
		super(d);
		this.driver = d;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//*[@id=\"footer\"]/div[1]/div/div/div[2]")
	WebElement scrolldown;
	@FindBy(xpath="//*[@id=\"scrollUp\"]")
	WebElement up;
	public void scrolldown() throws InterruptedException
	{
		implicitlywaitmethod();
		scrolldown.click();
		Thread.sleep(3000);
		System.out.println("Verify text 'SUBSCRIPTION'");
		up.click();
		System.out.println("Automation Engineers' text is visible on screen");
		}

}
