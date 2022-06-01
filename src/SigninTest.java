import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SigninTest extends AmazonTestBase {
	
	SignPage signpage = null;
	
	@BeforeMethod 
	public void setup() {
		
		openBrowser(browser);
		signpage = new SignPage(driver);
		driver.get("https://www.amazon.com/");
	
	}
	
	@Test
	public void testsignin() {
		signpage.HelloSignin();
	}
	
	@Test
	public void verifytitle() {
		signpage.Title();
	}
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
	
	
	

}
