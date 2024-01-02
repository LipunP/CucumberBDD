//package StepDefinitions;
//
//import java.time.Duration;
//import java.util.List;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import io.cucumber.datatable.DataTable;
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import io.github.bonigarcia.wdm.WebDriverManager;
//
//public class OrangeHRMLogin {
//
//	WebDriver driver = null;
//	
//	@Given("Browser is up and running")
//	public void browser() {
//		
//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();
//		System.out.println("Browser setup");
//	}
//
//	
//	@And("URL is available")
//	public void url() throws InterruptedException {
//		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
////		Thread.sleep(3000);
//		System.out.println("URL found");
//	}
//
//	@When("^user enters (.*) and (.*)$")
//	public void credentails(String uname, String pword) throws InterruptedException {
//		
//		driver.findElement(By.name("username")).sendKeys(uname);
//		driver.findElement(By.name("password")).sendKeys(pword);
//		driver.findElement(By.xpath("//button[@type='submit']")).click();
//		System.out.println("Credentails entered");
//		
//		Thread.sleep(4000);
//	}
//
//	@Then("user lands to the homwpage of OrangeHRM application")
//	public void homepage() {
//		String ele1 = driver.getPageSource();
//		if (ele1.contains("Dashboard"))
//		System.out.println("Dashboard");
//		
//		String ele = driver.getPageSource();
//		if (ele.contains("Invalid credentials"))
//		System.out.println("Invalid credentials");
//		
//		driver.close();
//		driver.quit();
//	}
//
//}
