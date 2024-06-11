package day1.browseropening;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ObjectIdentification {

	public static void main(String[] args) {
		//step1:
		WebDriver driver=new ChromeDriver();
		//step2:
		driver.get("https://www.saucedemo.com/");
		//step3:
			WebElement userNameInputField=driver.findElement(By.id("user-name"));
				//delete existing text if any
			userNameInputField.clear();
				//type username
			userNameInputField.sendKeys("standard_user");
		//step4:
			WebElement passwordInputField=driver.findElement(By.name("password"));
				//delete existing text if any
			passwordInputField.clear();
				//type username
			passwordInputField.sendKeys("secret_sauce");
		//step5:
			WebElement loginButton=driver.findElement(By.className("submit-button"));
				//clikc on the element
			loginButton.click();
	}
}
/*
Open browser
enter application url-https://www.saucedemo.com/
enter username as "standard_user"
enter password as "secret_sauce"
click in login button
close browser
*/
/*
Object Identification:
	findElement(By): this method will help us to locate/identify the element/object from the application
					 its return type is "WebElement"
					 this method take "By" class as an parameter, which is a predefined class having static method
					 known as locator
					 	id("")
					 	name("")
					 	linkText("")
					 	partialLinkText("")
					 	tagName("")
					 	className("")
					 	cssSelector("")
					 	xpath("")
					 	
	WebElement element=driver.findElement(By.id(""));
	
	once the element is identified, you can perform required operation on it
	- type text ---------------> sendKeys("");
	- click     ---------------> click();
	- delete existing text ----> clear();
	
	element.clear();
	element.sendKeys("admin");
	element.click();
*/