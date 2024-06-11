package day7.brokenlinks;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.SeleniumUtil;

public class ActiveElementExample extends SeleniumUtil{

	public static void main(String[] args) {
		ActiveElementExample ref=new ActiveElementExample();
		ref.loginIntoActitime();
	}
	
	public void loginIntoActitime() {
		WebDriver driver=setUp("chrome", "https://online.actitime.com/acc1/login.do");
		/*
		 * validate mouse pointer is present in username input field
				or
			validate focus is on username input field
		 */
		WebElement element=driver.switchTo().activeElement();
		System.out.println("is focus on Username input field? "+element.getAttribute("placeholder").equals("Username"));
		//type admin01 in active element and press tab button move control to password field
		element.sendKeys("admin01",Keys.TAB);
		driver.switchTo().activeElement().sendKeys("admin01",Keys.ENTER);
	}	
	
	public void testTricentis() {
		//TODO: https://demowebshop.tricentis.com/login try same in this application tester01@vomoto.com/Abc@12345
	}
}
