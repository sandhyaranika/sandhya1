package pageelements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.AbstractMethods;

public class BrandPage extends AbstractMethods
{
	WebDriver driver;

	public BrandPage(WebDriver d) {
		super(d);
		this.driver = d;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[2]/a")
	WebElement pro;
	@FindBy(xpath="/html/body/section[2]/div[1]/div/div[1]/div[1]/div[3]/div/ul/li[1]/a")
	WebElement brand;
	@FindBy(xpath="/html/body/section/div/div[2]/div[1]/div[1]/div[2]/div/ul/li[2]/a")
	WebElement newbrand;
	
	public void brandpage() throws InterruptedException 
	{
		implicitlywaitmethod();
		pro.click();
		System.out.println("Brands are visible on left side bar");
		Thread.sleep(3000);
		brand.click();
		System.out.println("user is navigated to brand page and brand products are displayed");
		Thread.sleep(3000);
		newbrand.click();
		System.out.println("user is navigated to that brand page and can see products");
		
	}
}
