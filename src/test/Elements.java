package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.PageFactory;

public class Elements extends Amazon {
	//WebDriver driver;

	public Elements(WebDriver driver) {
		PageFactory.initElements(driver, this);
		//this.driver = driver;
	}

//	@FindBy(className="nav-line-1 nav-progressive-content")
//  WebElement HelloSignin;
//	@FindBy(id="ap_email")
//	WebElement EmailorPhonenumber;
//	@FindBy(id="continue")
//	WebElement Continue;
//	@FindBy(id="ap_password")
//	WebElement Password;
//	@FindBy(id="signInSubmit")
//	WebElement SigninButton;
//	@FindBy(id="nav-logo-sprites")
//	WebElement TitleText;
	WebElement HelloSignin = driver.findElement(By.xpath("//*[@class='layoutToolbarPadding']/a[2]/div/span"));
	WebElement EmailorPhonenumber = driver.findElement(By.id("ap_email"));
	WebElement Continue = driver.findElement(By.id("continue"));
	WebElement Password = driver.findElement(By.id("ap_password"));
	WebElement SigninButton = driver.findElement(By.id("signInSubmit"));
	WebElement TitleText = driver.findElement(By.id("nav-logo-sprites"));

}