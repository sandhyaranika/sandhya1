package pageelements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.AbstractMethods;

public class RegisterWhileCheckOut extends AbstractMethods
{
	public WebDriver driver;
	public RegisterPage rp;
	public SignUpPage sp;

	public RegisterWhileCheckOut(WebDriver d) {
		super(d);
		this.driver = d;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[3]/a")
	WebElement cart12;
	
	@FindBy(xpath="//*[@id=\"do_action\"]/div[1]/div/div/a")
	WebElement check_1;
	
	@FindBy(xpath="//*[@id=\"checkoutModal\"]/div/div/div[2]/p[2]/a/u")
	WebElement login1;
	
	@FindBy(xpath="//*[@id=\"form\"]/div/div/div[3]/div/form/input[2]")
	WebElement name1;
	
	@FindBy(xpath="//*[@id=\"form\"]/div/div/div[3]/div/form/input[3]")
	WebElement mail1;
	
	@FindBy(xpath="//*[@id=\"form\"]/div/div/div[3]/div/form/button")
	WebElement signup1;
	
	@FindBy(xpath="//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[3]/a")
	WebElement cart02;
	
	@FindBy(xpath="//*[@id=\"do_action\"]/div[1]/div/div/a")
	WebElement checkout2;
	
	@FindBy(xpath="//*[@id=\"ordermsg\"]/textarea")
	WebElement textarea;
	
	@FindBy(xpath="//*[@id=\"cart_items\"]/div/div[7]/a")
	WebElement placeorder;
	
	@FindBy(xpath="//*[@id=\"payment-form\"]/div[1]/div/input")
	WebElement cardname;
	
	@FindBy(xpath="//*[@id=\"payment-form\"]/div[2]/div/input")
	WebElement cardno;
	
	@FindBy(xpath="//*[@id=\"payment-form\"]/div[3]/div[1]/input")
	WebElement cvv;
	
	@FindBy(xpath="//*[@id=\"payment-form\"]/div[3]/div[2]/input")
	WebElement month;
	
	@FindBy(xpath="//*[@id=\"payment-form\"]/div[3]/div[3]/input")
	WebElement year;
	
	@FindBy(xpath="//*[@id=\"submit\"]")
	WebElement order;
	
	@FindBy(xpath="//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[5]/a")
	WebElement delacc;
	
	@FindBy(xpath="//*[@id=\"form\"]/div/div/div/div/a")
	WebElement cont;
	
	
	public void whileCheckout() throws InterruptedException 
	{
		implicitlywaitmethod();
		Thread.sleep(3000);
		AddProductCart ap=new AddProductCart(driver);
		Thread.sleep(3000);
		ap.addcarts();
		Thread.sleep(3000);
		ap.addcart();
		
		cart12.click();
		Thread.sleep(3000);
		check_1.click();
		Thread.sleep(3000);
		login1.click();
		Thread.sleep(3000);
		name1.sendKeys("sandhya");
		mail1.sendKeys("devika123345@gmail.com");
		signup1.click();
		
	RegisterPage rp=new RegisterPage(driver);
		rp.register();
		
	}
	public void placeorder() 
	{
		cart02.click();
		checkout2.click();
		textarea.sendKeys("good product");
		placeorder.click();
		cardname.sendKeys("sandhya");
		cardno.sendKeys("5346789634657");
		cvv.sendKeys("123");
		month.sendKeys("02");
		year.sendKeys("2025");
		order.click();
		System.out.println("'Your order has been placed successfully!'");
}
	public void deleteacc() {
		delacc.click();
		System.out.println("Verify 'ACCOUNT DELETED!' and click 'Continue' button");
		cont.click();
	}

}
