package day13.testscripts;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import day13.webpages.checkoutCompletePage;
import day13.webpages.checkoutStepOnePage;
import day13.webpages.checkoutStepTwoPage;
import day13.webpages.swagLabCartPage;
import day13.webpages.swagLabHomePage;
import day13.webpages.swagLabLoginPage;
import utilities.SeleniumUtility;

public class swagLabLoginValidationNShop extends SeleniumUtility{
	
	swagLabLoginPage getswagLabLoginPage;
	swagLabHomePage getSwagLabHomePage;
	swagLabCartPage getswagLabCartPage;
	checkoutStepOnePage getcheckoutStepOnePage;
	checkoutStepTwoPage getcheckoutStepTwoPage;
	checkoutCompletePage getcheckoutCompletePage;
	String app_ULR=null;
	@BeforeTest
	public void precondition()
	{	
		app_ULR=properties.getProperty("appUrl");
		driver=setUp("chrome", app_ULR);
		getswagLabLoginPage=new swagLabLoginPage(driver);
		getSwagLabHomePage =new swagLabHomePage(driver);
		getswagLabCartPage =new swagLabCartPage(driver);
		getcheckoutStepOnePage = new checkoutStepOnePage(driver);
		getcheckoutStepTwoPage=new checkoutStepTwoPage(driver);
		getcheckoutCompletePage=new checkoutCompletePage(driver);	
	}
	
	@Test(priority=1)
	public void testLoginLogout()
	{
		getswagLabLoginPage.LoginSwagLab(properties.getProperty("username"), properties.getProperty("password"));
		//getSwagLabHomePage.addToCart();
		getSwagLabHomePage.logoutFromApplication();
		String actUrl=getCurrentUrlOfApplication();
		Assert.assertEquals(actUrl,app_ULR,"LoginLogOut Unsuccessful or URL CHANGED!");
	}
	@Test(priority=2)
	public void testcart()
	{
		//add product and validate cart
	}
	
	@Test(priority=3)
	public void testCheckoutOverview()
	{
		//validate product price in checkout page
	}
	
	
	@Test(priority=4)
	public void testShoppingOnSwagLab()
	{
		getswagLabLoginPage.LoginSwagLab("standard_user", "secret_sauce");		
		getSwagLabHomePage.addToCart();
		getswagLabCartPage.performCheckout();
		getcheckoutStepOnePage.enterDetailsForCheckout("soham", "khunte", "411022");
		getcheckoutStepTwoPage.purchasedHistory();
		String expMsgAfterSuccessChkout ="Thank you for your order!";
		String actualMsg=getcheckoutCompletePage.getSuccessMsg();
		Assert.assertEquals(actualMsg, expMsgAfterSuccessChkout);
	}
	
	@AfterTest
	public void tearDown()
	{
		getSwagLabHomePage.logoutFromApplication();
		tearDown();
	}
	
	

}
