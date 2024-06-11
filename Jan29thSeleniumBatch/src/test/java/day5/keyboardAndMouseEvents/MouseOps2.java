package day5.keyboardAndMouseEvents;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utilities.SeleniumUtil;

public class MouseOps2 {

	public static void main(String[] args) {
		//creating instance of SeleniumUtil to access all reusable functions
		SeleniumUtil util=new SeleniumUtil();
		//calling setUp() to initialize browser with basic requirement
		WebDriver driver=util.setUp("chrome", "https://online.actitime.com/acc1/login.do");
		
		WebElement usernameInputField=driver.findElement(By.id("username"));
		//type username as admin01
		usernameInputField.sendKeys("admin01");
		//use Actions class to select the content
		Actions action=new Actions(driver);
		action.moveToElement(usernameInputField).doubleClick().build().perform();
		
		//Copy using Keys class
		usernameInputField.sendKeys(Keys.chord(Keys.CONTROL,"c"));
		
		//type copied text into password input field and press enter button
		driver.findElement(By.name("pwd")).sendKeys(Keys.chord(Keys.CONTROL,"v"),Keys.ENTER);
	}

}
