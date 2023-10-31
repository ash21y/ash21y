package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class UserLogin {
	
	//variable private
		@FindBy(xpath="//input[@id='emailId']") private WebElement EmailId;
		@FindBy(xpath="//input[@id='password']")   private WebElement Password;
		@FindBy(xpath="//input[@title='Enter Your First Name.']") private WebElement FirstName;
		
		@FindBy(xpath="//input[@id='lastName']") private WebElement LastName;
		
		@FindBy(xpath="//select[@id='state']") private WebElement State;
		
	   @FindBy(xpath="//select[@id='city']") private WebElement City;
		
		@FindBy(xpath="//input[@id='pinCode']") private WebElement PinCode;
		
		@FindBy(xpath="//input[@id='mobileNo']")  private WebElement MobNo;


		private WebDriver driver;
		
		//constructor Public
		 public UserLogin(WebDriver driver)
		 {
			 PageFactory.initElements(driver, this);
			 this.driver=driver;
		 }
		//Method public
		 
		 public void sendlogin(String login)
		 {
			 EmailId.sendKeys(login);
		 }
		 public void sendpassword(String password)
		 {
			 Password.sendKeys(password);
		 }
		 public void sendfname(String fname)
		 {
			FirstName .sendKeys(fname);
		 }
		 public void sendlname(String lname)
		 {
			LastName .sendKeys(lname);
		 }
		 public void selectstate () {
			 Select s=new Select(State);
			s.selectByVisibleText("Maharashtra");
		 }
		 public void selectcity () {
			 Select s=new Select(City);
			s.selectByVisibleText("Ahmednagar");
		 }
		

		 
		 public void sendpin(String pin)
		 {
			PinCode .sendKeys(pin);
		 }
		 //////////
		 public void sendmobileno(String mobileno)
		 {
			MobNo.sendKeys(mobileno);
		 }
		 
		 
		
		 
		

	}


