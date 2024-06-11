package day5.keyboardAndMouseEvents;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.SeleniumUtil;

public class KeyboardExample2 {

	public static void main(String[] args) {
		//creating instance of SeleniumUtil to access all reusable functions
		SeleniumUtil util=new SeleniumUtil();
		//calling setUp() to initialize browser with basic requirement
		WebDriver driver=util.setUp("chrome", "https://www.google.com");
		
		driver.findElement(By.name("q")).sendKeys("Selemium",Keys.F5);
	
	}

}
