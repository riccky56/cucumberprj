package stepDefinations;

import io.cucumber.java.en.*;
import org.openqa.selenium.chrome.*;
import java.time.Duration;
import org.junit.Assert;
import org.openqa.selenium.*;


// Class declaration that groups the related example logic in one place.
public class Steps {
	// Create or store the browser driver used to control the web session.
	WebDriver driver = new ChromeDriver();
	@Given("the user is on login page")
	// Method definition that performs a specific part of the program workflow.
	public void the_user_is_on_login_page() {
	  driver = new ChromeDriver();
	  driver.get("https://www.saucedemo.com/v1/");
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.manage().window().maximize();
	  	} 

	@When("the user enters email as {string} and password as {string}")
	// Method definition that performs a specific part of the program workflow.
	public void the_user_enters_valid_credentials_username_password(String user, String pswd) {
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(user);
		driver.findElement(By.xpath("//input[@id = 'password']")).sendKeys(pswd);
		
	}

	@When("the user clicks on Login button")
	// Method definition that performs a specific part of the program workflow.
	public void the_user_clicks_on_login_button() {
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
	    
	}

	@Then("the user should be redirected to the My Account page")
	// Method definition that performs a specific part of the program workflow.
	public void the_user_should_be_redirected_to_the_my_account_page() {
		// Store text data that will be processed by the program logic.
		String expectedTitle = "Swag Labs";
		// Store text data that will be processed by the program logic.
		String actualTitle = driver.getTitle();
		// Display information to the console for the user.
		System.out.println(actualTitle);

		Assert.assertEquals(actualTitle,expectedTitle);
	}

	@Then("the user should see a welcome message")
	// Method definition that performs a specific part of the program workflow.
	public void the_user_should_see_a_welcome_message() {
		boolean status= driver.findElement(By.xpath("//div[@class='product_label']")).isDisplayed();
		
		Assert.assertEquals(status, true);
		driver.close();
	   
	} 

}
