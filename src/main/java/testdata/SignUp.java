package testdata;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageelements.AddProductCart;
import pageelements.AddReview;
import pageelements.AdressDetails;
import pageelements.BrandPage;
import pageelements.CartAfter;
import pageelements.ContactForm;
import pageelements.DownloadInvoice;
import pageelements.LginBeforeCheckout;
import pageelements.LogOutPage;
import pageelements.LoginPageDetails;
import pageelements.LoginWithIncorrectDetails;
import pageelements.ProductDetailsPage;
import pageelements.ProductQuantity;
import pageelements.RecommendedItems;
import pageelements.RegisterBeforeCheckout;
import pageelements.RegisterPage;
import pageelements.RegisterWhileCheckOut;
import pageelements.RegisterWithExistingMail;
import pageelements.RemoveFromCart;
import pageelements.ScrollUpWithoutArrow;
import pageelements.ScrollWithArrow;
import pageelements.SearchProduct;
import pageelements.SignUpPage;
import pageelements.SubscriptionCartPage;
import pageelements.SubscriptionHomePage;
import pageelements.TestCases;
import pageelements.ViewCatagory;

public class SignUp 
{
	WebDriver driver;
	RegisterPage rp;
	SignUpPage sp;
	LoginPageDetails lp;
	LoginWithIncorrectDetails ld;
	LogOutPage lu;
	RegisterWithExistingMail re;
	ContactForm cf;
	TestCases tc;
	ProductDetailsPage pd;
	SearchProduct sd;
	SubscriptionHomePage sh;
	SubscriptionCartPage sc;
	AddProductCart ap;
	ProductQuantity pq;
	RegisterWhileCheckOut rw;
	RegisterBeforeCheckout rb;
	LginBeforeCheckout lb;
	RemoveFromCart rf;
	ViewCatagory vc;
	BrandPage bp;
	CartAfter ca;
	AddReview ar;
	RecommendedItems rt;
	AdressDetails ad;
	DownloadInvoice di;
	ScrollWithArrow swi;
	ScrollUpWithoutArrow sup;
	
	
	@BeforeTest
	public WebDriver intialisebrowser() {

		driver = new ChromeDriver();
		return driver;
	}
	@Test
	public void Launchapplication() throws IOException, InterruptedException
	{
	  driver = intialisebrowser(); 
		  Thread.sleep(2000);
		  driver.get("http://automationexercise.com");
		  driver.manage().window().maximize();
		  System.out.println("Home page is successfully visibled"); 
		  }
	
	/*@Test(priority = 1)
	public void signuppage() throws IOException, InterruptedException {
		driver = intialisebrowser();
		Thread.sleep(2000);
		driver.get("http://automationexercise.com");
		driver.manage().window().maximize();
		System.out.println("Home page is successfully visibled");
		Excel xs = new Excel();
		String Name = xs.Get_Username(1, 0).toString();
		String Email = xs.Get_password(1, 1).toString();
		sp=new SignUpPage(driver);
		sp.enterSignupdetails(Name, Email);
	}*/


	/*@Test(priority = 2)
	public void Register() throws IOException,InterruptedException 
	{ 
		rp = new RegisterPage(driver);
		rp.register();
		//rp.logout();
		 }*/
	
	/*@Test(priority = 3)
	public void LoginPageDetails()throws IOException,InterruptedException 
	{
		lp=new LoginPageDetails(driver);
		lp.logindetailspage();
		lp.delaccount();
	}*/
	
	//@Test(priority = 4)
	/*public void LoginWithIncorrectDetails()throws IOException,InterruptedException 
	{
		ld=new LoginWithIncorrectDetails(driver);
		ld.loginwithincorrectdetails();
	}*/
	//@Test(priority = 5)
	/*public void LogOutPage()throws IOException,InterruptedException 
	{
		lu=new LogOutPage(driver);
		lu.login();
		
	}*/
	//@Test(priority = 6)
	/*public void RegisterWithExistingMail()throws IOException,InterruptedException 
	{
		re=new RegisterWithExistingMail(driver);
		re.existingemail();
	}*/
	
	/*@Test(priority = 7)
	public void ContactForm()throws IOException,InterruptedException 
	{
		ContactForm cf=new ContactForm(driver);
		cf.fillForm();
		cf.okButtonClick();
	}*/
	/*@Test(priority = 8)
	public void TestCases()throws IOException,InterruptedException 
	{
		tc=new TestCases(driver);
		tc.testform();*/
	//}
	/*@Test(priority =9)
	public void ProductDetailsPage()throws IOException,InterruptedException 
	{
	pd=new ProductDetailsPage(driver);
	pd.productForm();
	}*/
	
	/*@Test(priority =10)
	public void search()throws IOException,InterruptedException 
	{
		sd=new SearchProduct(driver);
		sd.searchproduct();*/
	//}
	
	/*@Test(priority =11)
	public void SubscriptionHomePage()throws IOException,InterruptedException 
	{
		sh=new SubscriptionHomePage(driver);
		sh.clicksubs();
	}*/
	/*@Test(priority =12)
	public void subscart()throws IOException,InterruptedException 
	{
		sc=new SubscriptionCartPage(driver);
		sc.subCartpage();
	}*/
	/*@Test(priority =13)
	public void AddProduct()throws IOException,InterruptedException
	{
		ap=new AddProductCart(driver);
		ap.addcart();
		
	}*/
	
	/*@Test(priority =14)
	public void ProductQuantity()throws IOException,InterruptedException
	{
		pq=new ProductQuantity(driver);
		pq.quantityincrease();
	}*/
	
	/*@Test(priority=15)
	public void RegisterWhileCheckOut()throws IOException,InterruptedException
	{
		rw=new RegisterWhileCheckOut(driver);
		rw.whileCheckout();
		rw.placeorder();
		rw.deleteacc();
	}*/
	
	/*@Test(priority=16)
	public void RegisterBeforeCheckout()throws IOException,InterruptedException
	{
		 rb=new RegisterBeforeCheckout(driver);
		 rb.beforecheckout();
		 rb.proceed();*/
	//}
	/*@Test(priority=17)
	public void LginBeforeCheckout()throws IOException,InterruptedException
	{
		LginBeforeCheckout	lb=new LginBeforeCheckout(driver);
		lb.loginbeforecheckout();
		
	}*/
	/*@Test(priority=18)
	public void RemoveFromCart()throws IOException,InterruptedException
	{
		RemoveFromCart rf=new RemoveFromCart(driver);
		rf.removecart();
	}*/
	/*@Test(priority=19)
	public void ViewCatagory() throws InterruptedException 
	{
		ViewCatagory vc=new ViewCatagory(driver);
		vc.viewcatagory();
	}*/
	
	/*@Test(priority=20)
	public void BrandPage() throws InterruptedException 
	{
		BrandPage bp=new BrandPage(driver);
		bp.brandpage();
	}*/
	
	/*@Test(priority=21)
	public void CartAfter() throws InterruptedException
	{
		CartAfter ca =new CartAfter(driver);
		ca.cartafterlogin();
	}*/
	/*@Test(priority=22)
	public void AddReview() throws InterruptedException 
	{
		AddReview ar=new AddReview(driver);
		ar.addreview();
	}*/
	/*@Test(priority=23)
	public void RecommendedItems()  throws InterruptedException 
	{
		RecommendedItems rt=new RecommendedItems(driver);
		rt.recommendedcart();
	}*/
	
	/*@Test(priority=24)
	public void AdressDetails() throws InterruptedException
	{
		AdressDetails ad=new AdressDetails(driver);
		ad.adressdetails();
	}*/
	
	/*@Test(priority=25)
	public void DownloadInvoice() throws InterruptedException 
	{
		DownloadInvoice di=new DownloadInvoice(driver);
		di.downloadinvoice();
	}*/
	

	/*@Test(priority=26)
	public void ScrollWithArrow() throws InterruptedException 
	{
		ScrollWithArrow swi=new ScrollWithArrow(driver);
		swi.scrolldown();
	}*/
	
	@Test(priority=27)
	public void ScrollUpWithoutArrow() throws InterruptedException 
	{
		ScrollUpWithoutArrow sup=new ScrollUpWithoutArrow(driver);
		sup.scrolup();
	}
	
	
	
	}
