package pagepackage;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Manapage {
	ChromeDriver  driver;
	@FindBy(xpath = "//*[@id=\"SiteHeader\"]/div[1]/div[1]/div[3]/div/div/a[1]")
	WebElement loginclick;
	@FindBy(xpath = "//*[@id=\"CustomerEmail\"]")
	WebElement myusername;
	@FindBy(xpath = "//*[@id=\"CustomerPassword\"]")
	WebElement mypass;
	@FindBy(xpath = "//*[@id=\"customer_login\"]/p[1]/button")
	WebElement myloginbtn;
	@FindBy(xpath = "//*[@id=\"SiteHeader\"]/div[1]/div[1]/div[1]/div[1]/a[1]")
	WebElement mysearchbtn;
	@FindBy(xpath = "//*[@id=\"HeaderSearchForm\"]/input[3]")
	WebElement searbar;
	@FindBy(xpath = "//*[@id=\"CollectionAjaxContent\"]/div[2]/div/div[2]/div[1]/div/a/div[1]/div[2]/img")
	WebElement mysoap;
	@FindBy(xpath = "//*[@id=\"AddToCartForm-template--14344861777954__main-8636238463287\"]/div[1]/button")
	WebElement mycartbtn;
	@FindBy(xpath = "//*[@id=\"CartDrawerForm\"]/div[2]/div[1]/div/div/div/div[2]/div[2]/div[1]/div[1]/button[2]")
	WebElement cartadd;
	@FindBy(xpath ="//*[@id=\"CartDrawerForm\"]/div[2]/div[2]/div[4]/button")
	WebElement checkoutbtn;
	@FindBy(xpath = "//*[@id=\"shipping-address1\"]")
	WebElement address;
	@FindBy(xpath = "//*[@id=\"TextField2\"]")
	WebElement apartment;
	@FindBy(xpath = "//*[@id=\"TextField3\"]")
	WebElement cityfield;
	@FindBy(xpath ="//*[@id=\"TextField4\"]")
	WebElement pincode;
	@FindBy(xpath = "//*[@id=\"Select1\"]")
	WebElement statefield;
	@FindBy(xpath = "//*[@id=\"TextField5\"]")
	WebElement phoneno;
	@FindBy(xpath = "//*[@id=\"CartDrawerForm\"]/div[1]/div/div[2]/button")
	WebElement cartclose;
	@FindBy(xpath = "//*[@id=\"SiteHeader\"]/div[1]/div[1]/div[3]/div/div/a[1]")
	WebElement logout;
	@FindBy(xpath = "//*[@id=\"MainContent\"]/div/header/a")
	WebElement logoutbtn;
	
	
	
	public Manapage(ChromeDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public void loginbutton()
	{
		loginclick.click();
	}
	public void loginpage(String uname,String pass)
	
	{
		myusername.sendKeys(uname);
		mypass.sendKeys(pass);
		
	}
	public void login()
	{
		myloginbtn.click();
	}
	
	public void search()
	{
		mysearchbtn.click();
	}
  public void searchpro(String value) throws InterruptedException
  
  {
	  Thread.sleep(2000);
	  searbar.sendKeys(value,Keys.ENTER);
  }
  public void product() throws InterruptedException
  {
	  Thread.sleep(2000);
	  mysoap.click();
	  
  }
  public void addcart() throws InterruptedException
  {
	  mycartbtn.click();
	  Thread.sleep(2000);
  }
  
  public void cartaddbtn()
  {
	  cartadd.click();
  }
  public void checkout() throws InterruptedException
  {
	  Thread.sleep(2000);
	  checkoutbtn.click();
  }
  public void addresrch(String value)
  {
	  address.sendKeys(value,Keys.ENTER); 
	  }
  
  public void apartmnt(String value)
  {
	  apartment.sendKeys(value);
  }
  
  public void city(String value)
  {
	  cityfield.sendKeys(value); 
  }
  
  public void phone(String value)
  {
	  phoneno.sendKeys(value);
  }
  public void statevalue() throws InterruptedException
  {
	 
	  Select state=new Select(statefield);
	  Thread.sleep(2000);
	  state.selectByValue("KL");
  }
  public void pin(String value) throws InterruptedException
  {
	  pincode.sendKeys(value);
	  Thread.sleep(3000);
  }
  
  public void cartclosebtn ()
  {
	  cartclose.click();
	  }
 
  
  public void logout() throws InterruptedException
  {
	  Thread.sleep(2000);
	  logout.click();
  }
 
  public void logoutpage() throws InterruptedException
  {
	  Thread.sleep(2000);
	  logoutbtn.click();
  }
}
