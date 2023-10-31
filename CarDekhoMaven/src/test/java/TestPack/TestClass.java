package TestPack;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v112.browser.Browser;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;

public class TestClass {


	public class Testng extends Browser {
		
		private WebDriver driver;
		private CarDekhoUserLogin cardekhouserlogin ;
	    private ExtentHtmlReporter reporter;
		
		
		
		
		
		
		@BeforeTest
		@Parameters("browser")
		public void launchbrowser(String browserName)throws Exception{
			reporter=new ExtentHtmlReporter("test-output/ExtendReport/Extent.html");
			ExtentReports extend=new ExtentReports();
			extend.attachReporter(reporter);
			
			System.out.println("BeforeTest");
			
			if(browserName.equals("Edge"))
			{
				driver=launchEdge();
			}
			
		}
		@BeforeClass
		public void pom()
		{
			cardekhouserlogin=new CarDekhoUserLogin(driver);
		}
		@BeforeMethod
		public void url(){
			driver.get("https://www.cardekho.com/login");
		}
		@Test
		public void cardekho(){
			CarDekhoUserLogin cardekhouserlogin=new CarDekhoUserLogin(driver);
			cardekhouserlogin.sendlogin("abc@gmail.com");
			cardekhouserlogin.sendpassword("12345");
			cardekhouserlogin.sendfname("ram");
			cardekhouserlogin.sendlname("patil");
			cardekhouserlogin.sendpin("123456");
			cardekhouserlogin.sendmobileno("1234567898");
			cardekhouserlogin.selectstate();
			cardekhouserlogin.selectcity();
		}
		@AfterMethod
		public void afterMethod(){
			driver.close();
		}


	
		

	}

}
