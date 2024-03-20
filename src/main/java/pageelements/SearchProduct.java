package pageelements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.AbstractMethods;

public class SearchProduct extends AbstractMethods 
{

	public SearchProduct(WebDriver d) {
		super(d);
		this.driver = d;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[2]/a")
	WebElement products;
	@FindBy(xpath="//*[@id=\"search_product\"]")
	WebElement search;
	@FindBy(xpath="//*[@id=\"submit_search\"]")
	WebElement search_button;
	
	public void searchproduct()
	{
		implicitlywaitmethod();
		products.click();
		System.out.println("Verify user is navigated to ALL PRODUCTS page successfully");
		search.sendKeys("women");
		search_button.click();
		System.out.println("Verify 'SEARCHED PRODUCTS' is visible");

	}
	

}
