package day11.actitimescripts;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import day11.actitimepages.HomePage;
import day11.actitimepages.LoginPage;
import utilities.SeleniumUtility;

public class TestLoginPage extends SeleniumUtility{

	WebDriver driver;
	LoginPage getLoginPage;
	HomePage getHomePage;
	@BeforeMethod
	public void precondition() {
		driver=setUp("chrome", "https://online.actitime.com/acc1/login.do");
		//initialize all required web pages
		getLoginPage=new LoginPage(driver);
		getHomePage=new HomePage(driver);		
	}
	@Test
	public void testLoginWithValidData() {
		getLoginPage.loginIntoActitime("admin01", "admin01");
		String expectedTitle="actiTIME - Licenses";
		String actualTitle=getCurrentTitleOfApplication(expectedTitle);
		Assert.assertEquals(actualTitle, expectedTitle);		
	}
	
	@Test
	public void testLoginLogoutWithValidData() {
		getLoginPage.loginIntoActitime("admin01", "admin01");
		getHomePage.logoutFromActitime();
		String expectedTitle="actiTIME - Login";
		String actualTitle=getCurrentTitleOfApplication(expectedTitle);
		Assert.assertEquals(actualTitle, expectedTitle);		
	}
	
	@AfterMethod
	public void postcondition() {
		driver.quit();
	}
}
