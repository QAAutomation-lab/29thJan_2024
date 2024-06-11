package day5.keyboardAndMouseEvents;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utilities.SeleniumUtil;

public class MouseOps1 {

	public static void main(String[] args) {
		//creating instance of SeleniumUtil to access all reusable functions
		SeleniumUtil util=new SeleniumUtil();
		//calling setUp() to initialize browser with basic requirement
		WebDriver driver=util.setUp("chrome", "https://demo.automationtesting.in/Register.html");
		
		List<WebElement> menuList=driver.findElements(By.cssSelector(".navbar-nav>li>a"));
		
		//Create an instance of actions class
		Actions action=new Actions(driver);
		//now using Actions class reference you can perform any mouse related operation
//		action.moveToElement(menuList.get(2)).perform();
//		util.setSleep(2000);
//		//hover based on coordinates
//		action.moveToElement(menuList.get(2),100,0).perform();
		
		for(int i=0;i<menuList.size();i++) {
			action.moveToElement(menuList.get(i)).perform();
		}
		
		
	}

}
