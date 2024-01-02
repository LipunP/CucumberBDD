package StepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import TestAutomation_Login.TestAuto_login;
import TestAutomation_logout.TestAuto_Logout;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestAuto_PF {

	WebDriver driver;
	TestAuto_login tlogin;
	TestAuto_Logout lgout;

	@Given("Browser is up")
	public void browser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		System.out.println("Browser setup done");
	}

	@And("URL is available")
	public void url() {
		driver.get("https://practice.expandtesting.com/login");
		driver.manage().window().maximize();
		System.out.println("URL is available");
	}

	@When("^user provides (.*) and (.*)$")
	public void credentials(String usrnm, String psword) throws InterruptedException {
		tlogin = new TestAuto_login(driver);
		tlogin.username(usrnm);
		tlogin.password(psword);
		tlogin.submt();
		Thread.sleep(2000);
	}

	@Then("Homepage should be displayed")
	public void home() throws InterruptedException {
		
		String content = driver.getPageSource();
		if (content.contains("Secure Area")) {
			System.out.println("Welcome to the Secure Area. When you are done click logout below.");
			lgout = new TestAuto_Logout(driver);
			lgout.logout();
			System.out.println("Logged out");
		}
		
		String content1 = driver.getPageSource();
		if (content1.contains("invalid")) {
			System.out.println("Your credentials are invalid");
		}

		Thread.sleep(2000);
		driver.close();
		driver.quit();
	}

}
