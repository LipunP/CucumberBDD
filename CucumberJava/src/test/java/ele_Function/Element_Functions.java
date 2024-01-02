package ele_Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Element_Functions {

	WebDriver driver;
	By text_id = By.id("username");
	By text_pwd = By.id("password");
	By btn_login = By.xpath("//input[@id='loginButton']");
	
	public Element_Functions(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void usnam(String usnm)
	{
		driver.findElement(text_id).sendKeys(usnm);
	}
	
	public void powd(String pwd)
	{
		driver.findElement(text_pwd).sendKeys(pwd);
	}
	
	public void lgin()
	{
		driver.findElement(btn_login).click();
	}
	
}
