package TestAutomation_Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestAuto_login {

	@FindBy(id = "username")
	WebElement txt_username;

	@FindBy(id = "password")
	WebElement txt_password;

	@FindBy(xpath = "//button[@type='submit']")
	WebElement submit;
	
	WebDriver driver;
	
	public TestAuto_login(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this); 
//		this indicates this class and initElement initiate the web elements
	}

	public void username(String usrnm) {

		txt_username.sendKeys(usrnm);
	}

	public void password(String psword) {

		txt_password.sendKeys(psword);
	}

	public void submt() {

		submit.click();;
	}

}
