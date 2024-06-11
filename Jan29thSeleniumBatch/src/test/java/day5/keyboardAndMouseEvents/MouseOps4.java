package day5.keyboardAndMouseEvents;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utilities.SeleniumUtil;

public class MouseOps4 {

	public static void main(String[] args) {
		//creating instance of SeleniumUtil to access all reusable functions
		SeleniumUtil util=new SeleniumUtil();
		//calling setUp() to initialize browser with basic requirement
		WebDriver driver=util.setUp("chrome", "https://jqueryui.com/droppable/");
		
		//to switch control from main page to inner page(iFrame)
		driver.switchTo().frame(0);
		
		//Create an instance of actions class
		Actions action=new Actions(driver);
		//now using Actions class reference you can perform any mouse related operation
		
		WebElement src=driver.findElement(By.id("draggable"));
		
		WebElement target=driver.findElement(By.id("droppable"));
		
		action.dragAndDrop(src, target).build().perform();
	}

}
