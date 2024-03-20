package pageelements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.AbstractMethods;

public class DownloadInvoice  extends AbstractMethods
{
	public WebDriver driver;
	public RegisterWhileCheckOut rw;

	public DownloadInvoice(WebDriver d) {
		super(d);
		this.driver = d;
		PageFactory.initElements(driver, this);
		}
	@FindBy(xpath="//*[@id=\"form\"]/div/div/div/a")
	WebElement download;
	@FindBy(xpath="//*[@id=\"form\"]/div/div/div/div/a")
	WebElement cont;
	
	
	public void downloadinvoice() throws InterruptedException
	{
		implicitlywaitmethod();
		Thread.sleep(2000);
		
		RegisterWhileCheckOut rw=new RegisterWhileCheckOut(driver);
		Thread.sleep(3000);
		
		rw.whileCheckout();
		Thread.sleep(3000);
		rw.placeorder();
		Thread.sleep(3000);
		download.click();
		Thread.sleep(3000);
		cont.click();
		Thread.sleep(3000);
		rw.deleteacc();
		
		
	}

}
