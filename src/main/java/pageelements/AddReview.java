package pageelements;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.AbstractMethods;

public class AddReview extends AbstractMethods
{

	public AddReview(WebDriver d)
	{
		super(d);
		this.driver = d;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[2]/a")
	WebElement product;
	@FindBy(xpath="/html/body/section[2]/div[1]/div/div[2]/div/div[2]/div/div[2]/ul/li/a")
	WebElement view;
	@FindBy(xpath="//*[@id=\"name\"]")
	WebElement name1;
	@FindBy(xpath="//*[@id=\"email\"]")
	WebElement mail;
	@FindBy(xpath="//*[@id=\"review\"]")
	WebElement review;
	@FindBy(xpath="//*[@id=\"button-review\"]")
	WebElement submit;
	
	public void addreview() throws InterruptedException
	{
		implicitlywaitmethod();
		product.click();
		Thread.sleep(3000);
		 JavascriptExecutor js=(JavascriptExecutor)driver;
		 js.executeScript("window.scrollBy(0, 500)");
		view.click();
		Thread.sleep(3000);
		name1.sendKeys("Amitha");
		mail.sendKeys("amithashagale@gmail.com");
		review.sendKeys("Good product");
		 JavascriptExecutor js1=(JavascriptExecutor)driver;
		    js1.executeScript("window.scrollBy(0, 100)");
		submit.click();
		System.out.println("'Thank you for your review.'");
		
	}
}
