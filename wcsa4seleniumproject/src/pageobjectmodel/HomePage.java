package pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePage {

	@FindBy(xpath = "//a[.='Logout']") private WebElement LogoutLink;
	@FindBy(id = "SubmitTTButton") private WebElement SaveLeaveTime;
	@FindBy(name = "usersSelector.selectedUser") private WebElement EnterTimeTrackDropDown;
	@FindBy(xpath = "//div[.='Users']") private WebElement users;

	// initialization
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}



	// utilization
	public WebElement getLogoutLink() {
		return LogoutLink;
	}

	public WebElement getSaveLeaveTime() {
		return SaveLeaveTime;
	}

	public WebElement getEnterTimeTrackDropDown() {
		return EnterTimeTrackDropDown;
	}

	public WebElement getUsers() {
		return users;
	}




	// Operational Methods For HomePage

	public void logOut()
	{
		LogoutLink.click();
	}
	public void clickOnSaveLeaveTime()
	{
		SaveLeaveTime.click();
	}
	public void clickOnEnterTimetrackDropdown()
	{
		EnterTimeTrackDropDown.click();
	}
	public void clickOnUsers()
	{
		users.click();
	}

	public void selectUser(int index)
	{
		Select sel = new Select(EnterTimeTrackDropDown);
		sel.selectByIndex(1);
	}


}
