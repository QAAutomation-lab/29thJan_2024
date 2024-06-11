package day2.validationAndLocators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CssValueAndCord {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		//to maximize browser window use
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://online.actitime.com/acc1/login.do");
		
		driver.findElement(By.id("loginButton")).click();
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		
		wait.until(ExpectedConditions.textToBe(By.className("errormsg"), "Username or Password is invalid. Please try again."));
		
		/*
		 * to get coordinate of any element user getLocation() which will return Point class Object
		 * Using Point class object you can easily get x or y coordinates of any element
		 */
		WebElement errorMsg=driver.findElement(By.className("errormsg"));
		Point errorPt=errorMsg.getLocation();
		int error_x=errorPt.getX();
		int error_y=errorPt.getY();
		System.out.println("Error msg x cord is: "+error_x);
		System.out.println("Error msg y cord is: "+error_y);
		
		
		WebElement usernameInputField=driver.findElement(By.id("username"));
		Point usernamePt=usernameInputField.getLocation();
		int username_x=usernamePt.getX();
		int username_y=usernamePt.getY();
		System.out.println("username x cord is: "+username_x);
		System.out.println("username y cord is: "+username_y);
		
		System.out.println("Is error msg getting displayed above username input field? "+(error_y<username_y));
		
		/*
		 * to check color or font-family or font-size, we need to use getCssValue(String), in this method 
		 * we need provide required CSS attribute name and based on the name it will return CSS attribute value
		 * 
		 */
		System.out.println("error msg color code(in RGBA format): "+errorMsg.getCssValue("color"));
		System.out.println("error msg font size: "+errorMsg.getCssValue("font-size"));
		System.out.println("error msg font family: "+errorMsg.getCssValue("font-family"));
		
	}

}
/*
 * open browser
 * enter application url
 * click on login button
	 * check error msg is getting displayed above username input field
	 * check error msg color and font size 
 */
