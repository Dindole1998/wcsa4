package pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {


	@FindBy(name = "username") private WebElement UsernameTB;
	@FindBy(name = "pwd") private WebElement PasswordTb;
	@FindBy(id = "loginButton") private WebElement Loginbutton;
	@FindBy(name = "remember") private WebElement CheckBox;
	@FindBy(xpath = "//a[.='Actimind Inc.']") private WebElement ActimindLink;
	@FindBy(id = "licenseLink") private WebElement licenseLink;


	//Initialization

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);

	}

	// Utilization

	public WebElement getUsernameTB() {
		return UsernameTB;
	}

	public WebElement getPasswordTb() {
		return PasswordTb;
	}

	public WebElement getLoginbutton() {
		return Loginbutton;
	}

	public WebElement getCheckBox() {
		return CheckBox;
	}

	public WebElement getActimindLink() {
		return ActimindLink;
	}

	public WebElement getLicenseLink() {
		return licenseLink;
	}

	
	
	//Operational Method for valid login
	
	public void actiTimeValidLogin(String validUsername,String validPassword) throws InterruptedException
	{
		UsernameTB.sendKeys("validUsername");
		Thread.sleep(2000);
		PasswordTb.sendKeys("validPassword");
		Thread.sleep(1000);
		Loginbutton.click();
	}
	public void actiTimeInvalidLogin(String invalidUsername,String invalidPassword) throws InterruptedException
    {
    	UsernameTB.sendKeys(invalidUsername);
    	Thread.sleep(2000);
    	PasswordTb.sendKeys(invalidPassword);
    	Thread.sleep(1000);
    	Loginbutton.click();
    	Thread.sleep(1000);
    	UsernameTB.clear();
    }
	





}
