package stepdefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDef {
	
	WebDriver driver = Hooks.driver;
	
	@Given("I have launched the application")
	public void i_have_launched_the_application() {
	    // Write code here that turns the phrase above into concrete actions
	
		driver.get("https://www.simplilearn.com");
		System.out.println("Launched Browser successfully");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
	}

	@When("I enter the correct username and password.")
	public void i_enter_the_correct_username_and_password() {
	    // Write code here that turns the phrase above into concrete actions
		WebElement UserName = driver.findElement(By.className("email"));
		UserName.sendKeys("Xyz@abc.com");
		
		WebElement UserPass = driver.findElement(By.id("password"));
		UserPass.sendKeys("Test@1234");
	}

	@Then("I should land on the home page")
	public void i_should_land_on_the_home_page() {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@When("I enter the incorrect uername and password")
	public void i_enter_the_incorrect_uername_and_password() {
	    // Write code here that turns the phrase above into concrete actions
		WebElement UserName = driver.findElement(By.className("email"));
		UserName.sendKeys("Xyz@abc.com");
		
		WebElement UserPass = driver.findElement(By.id("password"));
		UserPass.sendKeys("Test@1234"); 
	}

	@Then("I should get the error message {string}")
	public void i_should_get_the_error_message(String string) {
	    // Write code here that turns the phrase above into concrete actions

		WebElement Errormsg = driver.findElement(By.id("msg_box"));
		String ActError = Errormsg.getText();
		String ExpError = "The email or password you have entered is invalid.";
		Assert.assertEquals(ExpError,ActError);
	}
	
	@And("I click on Login Link")
	public void i_click_on_Login_Link() {
	    // Write code here that turns the phrase above into concrete actions
		WebElement LoginLink = driver.findElement(By.linkText("Log in"));
		LoginLink.click();
	}

	@When("I click on Login Button")
	public void i_click_on_Login_Button() {
	    // Write code here that turns the phrase above into concrete actions
		WebElement LoginBtn = driver.findElement(By.name("btn_login"));
		LoginBtn.click();
	}
	
	@When("I enter the username as {string} and password as {string}")
	public void i_enter_the_username_as_and_password_as(String UserNameVal, String UserPassVal) {
	    // Write code here that turns the phrase above into concrete actions
		WebElement UserName = driver.findElement(By.className("email"));
		UserName.sendKeys(UserNameVal);
		
		WebElement UserPass = driver.findElement(By.id("password"));
		UserPass.sendKeys(UserPassVal);
	}
	
}
