package pageelements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import utilities.AbstractMethods;

public class CartAfter extends AbstractMethods 
{
	WebDriver driver;
	public LoginPageDetails lp;

	public CartAfter(WebDriver d) {
		super(d);
		this.driver = d;
		PageFactory.initElements(driver, this);
	}
	public void cartafterlogin() throws InterruptedException
	{
		implicitlywaitmethod();
		Thread.sleep(3000);
		SearchProduct sd=new SearchProduct(driver);
		sd.searchproduct();
		Thread.sleep(3000);
		AddProductCart ap=new AddProductCart(driver);
		ap.addcart();
		Thread.sleep(3000);
		LoginPageDetails lp=new LoginPageDetails(driver);
		lp.logindetailspage();
		System.out.println("products are visible in cart after login as well");
		
	}

}
