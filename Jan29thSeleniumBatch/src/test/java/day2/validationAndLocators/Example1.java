package day2.validationAndLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://online.actitime.com/acc1/login.do");
		
		WebElement usernameInputField=driver.findElement(By.id("username"));
		System.out.println("Presence of username input field: "+usernameInputField.isDisplayed());
		System.out.println("username input field is editable or not: "+usernameInputField.isEnabled());
		System.out.println("Default text of username input: "+usernameInputField.getAttribute("placeholder"));
		
		WebElement checkBox=driver.findElement(By.id("keepLoggedInCheckBox"));
		System.out.println("Presence of checkbox: "+checkBox.isDisplayed());
		System.out.println("Checkbox is clickable or not? "+checkBox.isEnabled());
		System.out.println("Is checkbox selected by default? "+checkBox.isSelected());
		checkBox.click();
		System.out.println("After selection, Is checkbox selected by default? "+checkBox.isSelected());
		
		WebElement keepLoggedInLabel=driver.findElement(By.id("keepLoggedInLabel"));
		System.out.println("is keepLoggedInLabel displayed or not? "+keepLoggedInLabel.isDisplayed());
		System.out.println("Text of keepLoggedInLabel is: "+keepLoggedInLabel.getText());
		
		WebElement loginButton=driver.findElement(By.id("loginButton"));
		//presence - isDisplayed()		
		//clickable - isEnabled()
		//button name - getText()
		System.out.println("button name: "+loginButton.getText());
	}
}
/*
Once you identify the element, if you want to validate the element then use below method-

visibility/presence ---> isDisplay() -->boolean true/false
editable/functional/clickable ---> isEnabled() -->boolean true/false
selected ----> isSelected() -->boolean true/false

attribute value ---> getAttribute("attributename") --->String
innertext ---------> getText() ---->String

getCssValue()
getLocation()
Sync
Locator

username 
	present or not
	editable or not
	by default it should have "Username"
	
checkbox
	present or not
	clickable or not
	by default select or not
	
Keep me logged in
	present or not
	its name should be "present or not"
*/