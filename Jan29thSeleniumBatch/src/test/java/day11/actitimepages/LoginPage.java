package day11.actitimepages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.SeleniumUtility;

public class LoginPage extends SeleniumUtility{

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	/*Identify required element, like- username, password login*/
	@FindBy(id="username")
	private WebElement userNameInputField;
	
	@FindBy(name="pwd")
	private WebElement passwordInputField;
	
	@FindBy(id="loginButton")
	private WebElement loginButton;

	public WebElement getUserNameInputField() {
		return userNameInputField;
	}

	public WebElement getPasswordInputField() {
		return passwordInputField;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}
	
	public void loginIntoActitime(String username,String password) {
		typeInput(userNameInputField, username);
		typeInput(passwordInputField, password);
		clickOnElement(loginButton);
	}
}
