package pageelements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.AbstractMethods;

public class AddProductCart extends AbstractMethods
{
	WebDriver driver;

	public AddProductCart(WebDriver d) {
		super(d);
		this.driver = d;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[2]/a")
	WebElement products;
	
	@FindBy(xpath="/html/body/section[2]/div[1]/div/div[2]/div/div[2]/div/div[1]/div[1]/a")
	WebElement first_product;
	@FindBy(xpath="//*[@id=\"cartModal\"]/div/div/div[3]/button")
	WebElement continue_shopping;
	
	@FindBy(xpath="/html/body/section[2]/div[1]/div/div[2]/div[1]/div[3]/div/div[1]/div[1]/a")
	WebElement second_product;
	
	@FindBy(xpath="//*[@id=\"cartModal\"]/div/div/div[2]/p[2]/a/u")
	WebElement view_cart;
	
	public void addcarts() throws InterruptedException
	{
		implicitlywaitmethod();
		products.click();
	}
	
	public void addcart() throws InterruptedException
	{
		
		first_product.click();
		Thread.sleep(3000);
		 continue_shopping.click();
		 Thread.sleep(3000);
		 second_product.click();
		 Thread.sleep(3000);
		 view_cart.click();
		System.out.println("Verify their prices, quantity and total price");
	}

	}


