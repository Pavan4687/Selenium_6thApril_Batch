package step_definition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Test_Steps {
	WebDriver driver;
	
	
	@Given("User is on Home Page")
	public void user_is_on_Home_Page() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kkalyan\\eclipse-workspace\\com.Testing\\driver\\chromedriver.exe");

		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		 driver.navigate().to("https://www.magicbricks.com/");
	    System.out.println("I am on Home Page");
	}

	@When("User Navigate to LogIn Page")
	public void user_Navigate_to_LogIn_Page() {
		System.out.println("I am on login Page");
	}

	@When("User enters UserName and Password")
	public void user_enters_UserName_and_Password() {
		System.out.println("I am on Home Page");
	}

	@Then("Message displayed Login Successfully")
	public void message_displayed_Login_Successfully() {
		System.out.println("Message displayed Login Successfully");
	}

	@When("User Logout from the Application")
	public void user_Logout_from_the_Application() {
		System.out.println("I logged out");
	}

	@Then("Message displayed Logout Successfully")
	public void message_displayed_Logout_Successfully() {
		System.out.println("I am on home page after logged out");
	}

}
