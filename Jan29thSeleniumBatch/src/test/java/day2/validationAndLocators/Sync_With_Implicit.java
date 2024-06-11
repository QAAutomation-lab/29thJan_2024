package day2.validationAndLocators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sync_With_Implicit {

	public static void main(String[] args) {
		//open the browser
		WebDriver driver=new ChromeDriver();
		//implicit wait(default wait)
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//enter the application URL
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//identify and perform required operation
		driver.findElement(By.name("username")).sendKeys("Admin");//0-30 sec, if element is not loaded max in 30sec, dn you will get NoSuchElementException
		driver.findElement(By.name("password")).sendKeys("admin123");//0-30 sec, if element is not loaded max in 30sec, dn you will get NoSuchElementException
		driver.findElement(By.className("orangehrm-login-button")).click();//0-30 sec, if element is not loaded max in 30sec, dn you will get NoSuchElementException
	}

}
