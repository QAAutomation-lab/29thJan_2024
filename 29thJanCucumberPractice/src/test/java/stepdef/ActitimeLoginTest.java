package stepdef;

import org.openqa.selenium.By;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.SeleniumUtility;

public class ActitimeLoginTest extends SeleniumUtility{
	
	@Given("user in on actitime login page")
	public void user_in_on_actitime_login_page() {	   
	   setUp("chrome", "https://online.actitime.com/acc1/login.do");
	}

	@When("user enters valid username as {string}")
	public void user_enters_valid_username_as(String username) {
	    typeInput(driver.findElement(By.id("username")), username);
	   
	}

	@And("user enters valid password as {string}")
	public void user_enters_valid_password_as(String password) {
		typeInput(driver.findElement(By.name("pwd")), password);
	   
	}

	@And("user clicks on login button")
	public void user_clicks_on_login_button() {
	    
	   clickOnElement(driver.findElement(By.id("loginButton")));
	}

	@Then("user should navigate to Actitime Home page with title {string}")
	public void user_should_navigate_to_actitime_home_page_with_title(String extectedTitle) {
	    
	   String actualTitle=getCurrentTitleOfApplication(extectedTitle);
	   Assert.assertEquals(actualTitle, extectedTitle);
	}

	@And("user close the browser")
	public void user_close_the_browser() {
	    driver.quit();	   
	}
	
	@Then("user should remain in Actitime Login page with title {string}")
	public void user_should_remain_in_Actitime_Login_page_with(String extectedTitle) {
		 String actualTitle=getCurrentTitleOfApplication(extectedTitle);
		   Assert.assertEquals(actualTitle, extectedTitle);
	}

}
