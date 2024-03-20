package pageelements;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.AbstractMethods;

public class RegisterPage extends AbstractMethods {
	WebDriver driver;
	public RegisterPage(WebDriver d) {
		super(d);
		this.driver = d;
		PageFactory.initElements(driver, this);
		
	}
	//@FindBy(xpath="//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a")
	//WebElement signUp ;
	@FindBy(id="password")
	WebElement pass;
	@FindBy(xpath="//*[@id=\"days\"]/option[9]")
	WebElement day;
	@FindBy(xpath="//*[@id=\"months\"]/option[3]")
	WebElement month;
	@FindBy(xpath="//*[@id=\"years\"]/option[29]")
    WebElement year;
	@FindBy(id="newsletter")
	WebElement news;
	@FindBy(id="optin")
	WebElement opt;
	@FindBy(id="first_name")
	WebElement firstname;
	@FindBy(id="last_name")
	WebElement lastname;
	@FindBy(id="address1")
	WebElement adress;
	@FindBy(id="company")
	WebElement comp;
	@FindBy(xpath="//*[@id=\"state\"]")
	WebElement state1;
	@FindBy(xpath="//*[@id=\"city\"]")
	WebElement city1;
	@FindBy(xpath="//*[@id=\"zipcode\"]")
	WebElement code;
	@FindBy(xpath="//*[@id=\"mobile_number\"]")
	WebElement mobileno;
	@FindBy(xpath="//*[@id=\"form\"]/div/div/div/div[1]/form/button")
	WebElement createaccount;
	@FindBy(xpath = "(//a[@href='/'])[3]")
	WebElement continu;

	/*@FindBy(xpath = "//a[@href='/delete_account']")
	WebElement deleteaccount;
	
	@FindBy(xpath = "(//a[@href='/'])[3]")
	WebElement continuebtn;*/
	
	public void register() {
		implicitlywaitmethod();
		//signUp.click();
		System.out.println("'ENTER ACCOUNT INFORMATION' is visible");
		pass.sendKeys("Sandhya@123");

		WebElement E1 = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/div[1]/form/div[3]/label"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", E1);
		day.click();
		month.click();
		year.click();
		firstname.sendKeys("sand");
		lastname.sendKeys("rani");
		WebElement E2 = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/div[1]/form/p[3]/label"));
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("arguments[0].scrollIntoView();", E2);
		
	comp.sendKeys("Excelr");
	adress.sendKeys("Bangalore");
	state1.sendKeys("Karnataka");
	city1.sendKeys("Bangalore");
	
	WebElement E3 = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/div[1]/form/p[8]/label"));
	JavascriptExecutor js2 = (JavascriptExecutor) driver;
	js2.executeScript("arguments[0].scrollIntoView();", E3);

    code.sendKeys("599062");
    mobileno.sendKeys("9901723321");
    createaccount.click();	
    continu.click();

  
	}
   
  /* public void logout()
   {
   System.out.println("'Logged in as username' is visible");
		deleteaccount.click();

		System.out.println("'ACCOUNT DELETED!' is visible ");
		continuebtn.click();*/

	}

	

