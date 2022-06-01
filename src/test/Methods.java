package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Methods extends Amazon{
    public static WebDriver driver;
	public Methods(WebDriver driver) {
		Methods.driver = driver;
 //super(driver);
		// TODO Auto-generated constructor stub
	}
        public void HelloSignin() {
        	try {
        		WebElement HelloSignin = driver.findElement(By.xpath("//*[@class='layoutToolbarPadding']/a[2]/div/span"));

        	     HelloSignin.click();
        	}catch(Exception e) {
                 System.out.print("exception in HelloSignin ");                
        	}
        	
        }
        	
		public void setEmailorPhonenumber(String strEmailorPhonenumber){
              try {
            	  WebElement EmailorPhonenumber = driver.findElement(By.id("ap_email"));

                	EmailorPhonenumber.sendKeys(strEmailorPhonenumber);
                }catch(Exception e) {
                    System.out.print("exception in setEmailorPhonenumber ");                
            	}
             
	    }
		
        public void Continue() {
        	try {
        		WebElement Continue = driver.findElement(By.id("continue"));

        		Continue.click();
            }catch(Exception e) {
                System.out.print("exception in Continue ");                
        	}
        	
        }

	    public void setPassword(String strPassword){
	    	try {
	    		WebElement Password = driver.findElement(By.id("ap_password"));

	    		  Password.sendKeys(strPassword);
            }catch(Exception e) {
                System.out.print("exception in setPassword ");                
        	}
	    	
  }
	    public void clickSignin(){
	    	try {
	    		WebElement SigninButton = driver.findElement(By.id("signInSubmit"));

	    		SigninButton.click();
          }catch(Exception e) {
              System.out.print("exception in clickSignin");                
      	}

	    }  

	    public String getTitle(){
	    	String text ="";
	    	try {
	    		WebElement TitleText = driver.findElement(By.id("nav-logo-sprites"));

	    		 text=TitleText.getText();
          }catch(Exception e) {
              System.out.print("exception in getTitle");                
      	}

	    return text;

	    }
}


