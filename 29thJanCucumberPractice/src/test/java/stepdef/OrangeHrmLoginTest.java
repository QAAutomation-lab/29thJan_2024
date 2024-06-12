package stepdef;

import org.openqa.selenium.By;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.SeleniumUtility;

public class OrangeHrmLoginTest extends SeleniumUtility{

	@Given("user in on OrangeHRM login page")
	public void user_in_on_orange_hrm_login_page() {
	    setUp("chrome", "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	    
	}

	@When("^user enters valid username as (.+) in the OrangeHRM login$")
	public void user_enters_valid_username_as_admin_in_the_orange_hrm_login(String username) {
	    
	    typeInput(driver.findElement(By.name("username")), username);
	}

	@And("^user enters valid password as (.+) in the OrangeHRM login$")
	public void user_enters_valid_password_as_admin123_in_the_orange_hrm_login(String password) {
	    
		typeInput(driver.findElement(By.name("password")), password);
	}

	@And("user clicks on login button in the OrangeHRM login")
	public void user_clicks_on_login_button_in_the_orange_hrm_login() {
	    
	    clickOnElement(driver.findElement(By.cssSelector(".orangehrm-login-button")));
	}

	@Then("^user should nagivate to required page with url having (.+) in the OrangeHRM$")
	public void user_should_nagivate_to_required_page_with_url_having_dashboard_in_the_orange_hrm(String title) {
	    
	    String actualcUrl=getCurrentUrlOfApplication();
	    Assert.assertTrue(actualcUrl.contains(title));
	}

}
