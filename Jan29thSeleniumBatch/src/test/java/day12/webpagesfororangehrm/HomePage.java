package day12.webpagesfororangehrm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.SeleniumUtility;

public class HomePage extends SeleniumUtility {

	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}	
	@FindBy(css=".oxd-userdropdown")
	private WebElement userProfileIcon;
	
	@FindBy(xpath="//a[text()='Logout']")
	private WebElement logoutLink;
	
	@FindBy(css="ul.oxd-main-menu>li:nth-of-type(2) span")
	private WebElement pimLink;
	
	public WebElement getUserProfileIcon() {
		return userProfileIcon;
	}

	public WebElement getLogoutLink() {
		return logoutLink;
	}

	public WebElement getPimLink() {
		return pimLink;
	}

	public void clickOnPIM() {
		clickOnElement(pimLink);
	}
	
	public void logoutFromHrm() {
		clickOnElement(userProfileIcon);
		clickOnElement(logoutLink);
	}
}
