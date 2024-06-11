package day12.testscripts;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import day12.webpagesfororangehrm.AddEmployeePage;
import day12.webpagesfororangehrm.HomePage;
import day12.webpagesfororangehrm.LoginPage;
import day12.webpagesfororangehrm.PimHomePage;
import utilities.SeleniumUtility;
public class TestOrangeHrmPim extends SeleniumUtility{
	LoginPage getLoginPage;
	HomePage getHomePage;
	PimHomePage getPimHomePage;
	AddEmployeePage getAddEmployeePage;
	WebDriver driver;
	@BeforeMethod
	public void precondition() {
		driver=setUp("chrome", "https://opensource-demo.orangehrmlive.com/");
		getLoginPage=new LoginPage(driver);
		getHomePage=new HomePage(driver);
		getPimHomePage=new PimHomePage(driver);
		getAddEmployeePage=new AddEmployeePage(driver);
		getLoginPage.loginIntoOrangeHrm("Admin", "admin123");
		getHomePage.clickOnPIM();
	}
	@Test
	public void testPimCreation() {
		getPimHomePage.clickOnAddButton();
		getAddEmployeePage.createEmployee("Mobile", "Lead", 12345);
		getHomePage.clickOnPIM();
		getPimHomePage.searchCreatedEmployee(12345);
		String acutalMsg=getPimHomePage.getSearchResultMsg();
		String expectedMsg="(1) Record Found";
		Assert.assertEquals(acutalMsg, expectedMsg);
	}
//	@Test(dependsOnMethods="testPimCreation")
//	public void testPimEdit() {
//		//TODO: 
//	}
	
	@Test(dependsOnMethods="testPimCreation")
	public void testPimDeletion() {
		getHomePage.clickOnPIM();
		getPimHomePage=new PimHomePage(driver);
		getPimHomePage.searchCreatedEmployee(12345);
		getPimHomePage.deleteCreatedEmployee();
		String acutalMsg=getPimHomePage.getSearchResultMsg();
		String expectedMsg="No Records Found";
		Assert.assertEquals(acutalMsg, expectedMsg);
	}
	@AfterMethod
	public void postcondition() {
		getHomePage.logoutFromHrm();
		tearDown();
	}
}
