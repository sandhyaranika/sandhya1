package pageelements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.AbstractMethods;

public class ViewCatagory extends AbstractMethods
{
	WebDriver driver;

	public ViewCatagory(WebDriver d) 
	{
		super(d);
		this.driver = d;
		PageFactory.initElements(driver, this);
	}
		@FindBy(xpath="//*[@id=\"accordian\"]/div[1]/div[1]/h4/a/span/i")
	    WebElement ad1;
		@FindBy(xpath="//*[@id=\"Women\"]/div/ul/li[1]/a")
		WebElement d1;
		@FindBy(xpath="//*[@id=\"accordian\"]/div[2]/div[1]/h4/a/span/i")
		WebElement m2;
		@FindBy(xpath="//*[@id=\"Men\"]/div/ul/li[1]/a")
		WebElement m3;
		
		public void viewcatagory()throws InterruptedException
		{
			implicitlywaitmethod();
			ad1.click();
			Thread.sleep(3000);
			d1.click();
			System.out.println("confirm text 'WOMEN - TOPS PRODUCTS'");
			Thread.sleep(3000);
			m2.click();
			Thread.sleep(3000);
			m3.click();
			System.out.println("user is navigated to that category page");

		}
	}
