package StepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import ele_Function.Element_Functions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class IQNavigator {

	WebDriver driver;
	Element_Functions EleFunction;

	@Given("Brwoser is up")
	public void browser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		System.out.println("Chrome broswer is all set to go");

	}

	@And("url works")
	public void url() {
		driver.get(
				"https://augustus.iqnavigator.com/security/login?service=https://augustus.iqnavigator.com/falcon&locale=en_IN");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4000));
		System.out.println("URL is up and running");
	}

	@When("^user login with (.*) and (.*)$")
	public void credentials(String usnm, String pwd) throws Exception {
		EleFunction = new Element_Functions(driver);
		EleFunction.usnam(usnm);
		EleFunction.powd(pwd);
		Thread.sleep(2000);
	}

	@And("cicks on login button")
	public void login() throws Exception {
		EleFunction.lgin();
//		Thread.sleep(4000);
	}

	@Then("LIC homepage should be displayed")
	public void hompage() throws Exception {
		String ele = driver.getPageSource();
		if (ele.contains("Launch")) {
			Thread.sleep(4000);
			System.out.println("Home Page displayed");
			driver.findElement(By.xpath("//a[@id='logoutLink']")).click();
			System.out.println("Test Completed");
		}

		String ele1 = driver.getPageSource();
		if (ele1.contains("The username and password you entered is incorrect or does not exist.")) {
			System.out.println("Invalid Credentials");
			System.out.println("Test incompleted");
		}

		driver.close();
		driver.quit();

	}

}
