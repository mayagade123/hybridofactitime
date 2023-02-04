package pagePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePage {
	@FindBy(xpath="//a[text()='Create new tasks']") private WebElement createNewTaskLink;
	@FindBy(xpath="//a[text()='Logout']") private WebElement logoutLink;
	@FindBy(xpath="//span[text()='Insert existing tasks']") private WebElement insertExistingTask;
	
	
	
	//initialization
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}


	//utilization
	public WebElement getCreateNewTaskLink() {
		return createNewTaskLink;
	}



	public WebElement getLogoutLink() {
		return logoutLink;
	}



	public WebElement getInsertExistingTask() {
		return insertExistingTask;
	}
	
	// logout method
	
	public void logOutmethod()
	{
		logoutLink.click();
	}
	

	

}
