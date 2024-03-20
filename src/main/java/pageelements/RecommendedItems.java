package pageelements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.AbstractMethods;

public class RecommendedItems extends AbstractMethods
{

	public RecommendedItems(WebDriver d) {
		super(d);
		this.driver = d;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//*[@id=\"recommended-item-carousel\"]/div/div[1]/div[1]/div/div/div")
	WebElement scroldown;
	@FindBy(xpath="//*[@id=\"recommended-item-carousel\"]/div/div[1]/div[1]/div/div/div/a")
	WebElement addcart;
	@FindBy(xpath="//*[@id=\"cartModal\"]/div/div/div[2]/p[2]/a")
	WebElement viewcart;
	
	public void recommendedcart() 
	{
		implicitlywaitmethod();
		scroldown.click();
		System.out.println("'RECOMMENDED ITEMS' are visible");
		addcart.click();
		viewcart.click();
		System.out.println("product is displayed in cart page");
}

}
