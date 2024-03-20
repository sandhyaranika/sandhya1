package pageelements;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.AbstractMethods;

public class ProductQuantity  extends AbstractMethods
{
	WebDriver driver;

	public ProductQuantity(WebDriver d) {
		super(d);
		this.driver = d;
		PageFactory.initElements(driver, this);
	}
	//@FindBy(xpath="//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[2]/a")
	//WebElement products;
	@FindBy(xpath="/html/body/section[2]/div[1]/div/div[2]/div[1]/div[2]/div/div[2]/ul/li/a")
	WebElement click_view;
	@FindBy(xpath="//*[@id=\"quantity\"]")
	WebElement increase_product;
	@FindBy(xpath="/html/body/section/div/div/div[2]/div[2]/div[2]/div/span/button")
	WebElement add;
	@FindBy(xpath="//*[@id=\"cartModal\"]/div/div/div[2]/p[2]/a/u")
	WebElement viewcart;
	
	public void quantityincrease()
	{
		implicitlywaitmethod();
		//products.click();
		click_view.click();
		System.out.println("Verify product detail is opened");
		
		increase_product.sendKeys(Keys.CONTROL + "a");
		increase_product.sendKeys(Keys.DELETE);
		increase_product.sendKeys("4");
		add.click();
		viewcart.click();
		System.out.println("Verify that product is displayed in cart page with exact quantity");

		

	}

}
