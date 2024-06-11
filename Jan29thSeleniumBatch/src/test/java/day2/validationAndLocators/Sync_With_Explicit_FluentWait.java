package day2.validationAndLocators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Sync_With_Explicit_FluentWait {

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
		String expectedHomePageTitle="actiTIME - Enter Time-Track";
		
		//explicit wait-FluentWait
		Wait<WebDriver> wait=new FluentWait<WebDriver>(driver)
							.withTimeout(Duration.ofSeconds(20))//max timeout
							.pollingEvery(Duration.ofSeconds(5))//retry time
							.ignoring(NoSuchElementException.class);//to avoid exception in case you get while retry
		
		
		wait.until(ExpectedConditions.titleIs(expectedHomePageTitle));
		System.out.println("************** AFTER LOGIN, HOME PAGE TITLE IS *************\n\t\t"+driver.getTitle());
		System.out.println("is login successful? "+driver.getTitle().equals(expectedHomePageTitle));
		
		//wait for logout link to be displayed
		wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Logout")));
		driver.findElement(By.linkText("Logout")).click();
	}

}
