package pageelements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.AbstractMethods;

public class RemoveFromCart extends AbstractMethods
{
	WebDriver driver;

	
	public RemoveFromCart(WebDriver d) 
	{
		super(d);
		this.driver = d;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[3]/a")
	WebElement cart;
	@FindBy(xpath="//*[@id=\"product-1\"]/td[6]/a")
	WebElement del;
	
	public void removecart() throws InterruptedException 
	{
	implicitlywaitmethod();
	AddProductCart ap=new AddProductCart(driver);
	Thread.sleep(3000);
	ap.addcarts();
	Thread.sleep(3000);
	ap.addcart();
	System.out.println("Verify that cart page is displayed");
	del.click();
	System.out.println("Verify that product is removed from the cart");
		
	}

}
