package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.testng.annotations.Test;

//import com.beust.jcommander.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon {
	public static WebDriver driver;

	//public static void main(String[] args) throws InterruptedException{
	//String browser = "Firefox";
	//openBrowser(browser);
//	}
	public void openBrowser(String browser) {
		try {
			if (browser.equals("chrome")) {
				// System.setProperty("webdriver.gecko.driver","D:\\selenium
				// driver\\geckodriver.exe");
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
			} else if (browser.equalsIgnoreCase("Firefox")) {
//                System.setProperty("webdriver.chrome.driver", "D:\\selenium driver\\chromedriver.exe");
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
			}
		} catch (WebDriverException e) {
			System.out.println(e.getMessage());
		}
	}

	{
		driver.get("https://www.amazon.com/");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
//		SignintoAmazon signin = new SignintoAmazon(driver);
//		try {
//		signin.Login("8106974413", "dileep@123");
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}
}

// TODO Auto-generated method stub

// System.setProperty("webdriver.gecko.driver","C:\\geckodriver-v0.30.0-win64\\geckodriver.exe");
// WebDriver driver = new FirefoxDriver();
