package StepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHRMLogin {

	WebDriver driver = null;
	
	@Given("Browser is up and running")
	public void browser() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		System.out.println("Browser setup");
	}

	
	@And("URL is available")
	public void url() throws InterruptedException {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
//		Thread.sleep(3000);
		System.out.println("URL found");
	}

	@When("user enters uname and pword")
	public void credentails() {
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		System.out.println("Credentails entered");
	}

	@Then("user lands to the homwpage of OrangeHRM application")
	public void homepage() {
		driver.getPageSource().contains("Dashboard");
		System.out.println("Homepage");
		driver.close();
		driver.quit();
	}

}
