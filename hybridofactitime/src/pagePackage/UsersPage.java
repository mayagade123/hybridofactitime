package pagePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UsersPage {
@FindBy(linkText="Users") private WebElement Userstab;
@FindBy(xpath="//input[@value='Create New User']") private WebElement createNewuserButton;


public UsersPage(WebDriver driver)
{
	PageFactory.initElements(driver,this);
}

//utilization
public WebElement getUserstab() {
	return Userstab;
}


public WebElement getCreateNewuserButton() {
	return createNewuserButton;
}




}
