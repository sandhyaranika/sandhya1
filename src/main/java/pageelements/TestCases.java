package pageelements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.AbstractMethods;

public class TestCases extends AbstractMethods
{
	WebDriver driver;

	public TestCases(WebDriver d)
	{
		super(d);
		this.driver = d;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[5]/a")
	WebElement testcase;
public void testform()
{
	implicitlywaitmethod();
	testcase.click();
	System.out.println("user is navigated to test cases page successfully");
}
}
