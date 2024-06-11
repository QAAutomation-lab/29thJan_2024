package day2.validationAndLocators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		//to maximize browser window use
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.saucedemo.com/");
		
		String usernames=driver.findElement(By.id("login_credentials")).getText();
		String[] usernameList=usernames.split("\n");

		driver.findElement(By.id("user-name")).sendKeys(usernameList[1]);
	}

}
/*
Perform login logout from
	https://demowebshop.tricentis.com/
		tester01@vomoto.com / Abc@12345
	https://demo.vtiger.com/vtigercrm/index.php
		admin/admin

Read username and password from the application screen, dn login logout
	https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
		Admin/admin123
	https://www.saucedemo.com/
		standard_user/secret_sauce



*/