package TestAutomation_logout;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestAuto_Logout {

	@FindBy(xpath = "//i[@class='icon-2x icon-signout']")
	WebElement lgout;
	
	WebDriver driver;
	public TestAuto_Logout(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this); 
//		this indicates this class and initElement initiate the web elements
	}
	
	public void logout()
	{
		lgout.click();
	}
}
