package pageelements;

import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.AbstractMethods;

public class ContactForm extends AbstractMethods

{
	WebDriver driver;
	
	public ContactForm(WebDriver d) {
		super(d);
		this.driver = d;
		PageFactory.initElements(driver, this);
    }
	@FindBy(xpath = "//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[8]/a")
	WebElement Contactus;

	@FindBy(xpath = "(//input[@type='text'])[1]")
	WebElement name;

	@FindBy(xpath = "(//input[@type='email'])[1]")
	WebElement enteremail;

	@FindBy(xpath = "(//input[@type='text'])[2]")
	WebElement subject;

	@FindBy(xpath = "//textarea[@name='message']")
	WebElement message;

	@FindBy(name = "upload_file")
	WebElement uploadFileInput;

	@FindBy(xpath = "//input[@type='submit']")
	WebElement submitbutton;

	@FindBy(css = ".status.alert.alert-success")
	WebElement alertSuccess;

	@FindBy(xpath = "//a[@class='btn btn-success']")
	WebElement homePageButton;

	public void fillForm() {
		implicitlywaitmethod();
		Contactus.click();
		System.out.println("Verify 'GET IN TOUCH' is visible");
		enteremail.sendKeys("mohitha70@gmail.com");
		name.sendKeys("Krish");
		subject.sendKeys("Test");
		message.sendKeys("Hello");
		uploadFileInput.sendKeys("C:\\Users\\ashwi_8oalke6\\OneDrive\\Pictures\\Screenshots");
		submitbutton.sendKeys(Keys.ENTER);
	}

	public void okButtonClick() {	
		Alert alert = driver.switchTo().alert();
		alert.accept();
		System.out.println("Your details have been submitted successfully.' is visible");
		homePageButton.click();
		System.out.println("verify that landed to home page successfully");
	}

}

	
