package day2.validationAndLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sync_Without_Implicit {

	public static void main(String[] args) {
		//open the browser
		WebDriver driver=new ChromeDriver();
		//enter the application URL
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//		//first identify, store in WebElement then perform required operation
//		WebElement userNameInputField=driver.findElement(By.name("username"));
//		userNameInputField.sendKeys("Admin");
//		//first identify, store in WebElement then perform required operation				
//		WebElement passwordInputField=driver.findElement(By.name("password"));
//		passwordInputField.sendKeys("admin123");
//		//first identify, store in WebElement then perform required operation
//		WebElement loginButton=driver.findElement(By.className("orangehrm-login-button"));
//		loginButton.click();

		//or identify and perform required operation
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.className("orangehrm-login-button")).click();
	}

}
