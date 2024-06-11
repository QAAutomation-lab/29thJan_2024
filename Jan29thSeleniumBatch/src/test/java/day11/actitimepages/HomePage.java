package day11.actitimepages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.SeleniumUtility;

public class HomePage extends SeleniumUtility{
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	/*Identify required element like- TaskTab,Logout*/
	@FindBy(css=".navTable tr>td.navItem>a")
	private List<WebElement> mainTabs;
	
	@FindBy(xpath="//a[text()='Logout']")
	private WebElement logoutLink;

	public List<WebElement> getmainTabs() {
		return mainTabs;
	}

	public WebElement getLogoutLink() {
		return logoutLink;
	}
	
	public void logoutFromActitime() {
		clickOnElement(logoutLink);
	}
	
	public void clickOnRequiredTab(int index) {
		clickOnElement(mainTabs.get(index));
	}
}
