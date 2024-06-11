package day2.validationAndLocators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sync_Without_Explicit {

	public static void main(String[] args) {
		//open the browser
		WebDriver driver=new ChromeDriver();
		//implicit wait(default wait)
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//enter the application URL
		driver.get("https://online.actitime.com/acc1/login.do");
		System.out.println("************** LOGIN PAGE TITLE IS *************\n\t\t"+driver.getTitle());
		//identify and perform required operation
		driver.findElement(By.id("username")).sendKeys("admin01");//0-30 sec, if element is not loaded max in 30sec, dn you will get NoSuchElementException
		driver.findElement(By.name("pwd")).sendKeys("admin01");//0-30 sec, if element is not loaded max in 30sec, dn you will get NoSuchElementException
		driver.findElement(By.id("loginButton")).click();//0-30 sec, if element is not loaded max in 30sec, dn you will get NoSuchElementException
		System.out.println("************** AFTER LOGIN, HOME PAGE TITLE IS *************\n\t\t"+driver.getTitle());
	}

}
