package test;

public class SignintoAmazon extends Amazon{
public SignintoAmazon() {
		super();
		// TODO Auto-generated constructor stub
	}
	 //    public SignintoAmazon(WebDriver driver) {
//		super(driver);
//		// TODO Auto-generated constructor stub
//	}
    static Methods method;
    static Elements element;
    public static Amazon amz = new Amazon();
    public static void main(String[] args) throws InterruptedException {
    	String browser = "Firefox";
    	amz.openBrowser(browser);
    	SignintoAmazon signin = new SignintoAmazon();
    	method = new Methods(driver);
    	element =new Elements(driver);
    	signin.Login("8106974413", "dileep@123");
	}
	public void Login(String strEmailorPhonenumber,String strPassword) throws InterruptedException {
		method.getTitle();
    	method.HelloSignin();
    	Thread.sleep(3000);
    	method.setEmailorPhonenumber(strEmailorPhonenumber);
    	Thread.sleep(3000);
    	method.Continue();
    	Thread.sleep(3000);
    	method.setPassword(strPassword);
    	method.clickSignin();
    	
    }
}
