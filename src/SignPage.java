import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignPage extends AmazonTestBase{
	WebDriver driver = null;
	public SignPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(id="nav-logo-sprites")
	WebElement TitleText;
	public void Title() {
		TitleText.isDisplayed();
	}
	
	@FindBy(xpath="//*[@class='layoutToolbarPadding']/a[2]/div/span")
    WebElement HellloSignin;
	public void HelloSignin(){
		HellloSignin.click();
	}
	
	
	

}
