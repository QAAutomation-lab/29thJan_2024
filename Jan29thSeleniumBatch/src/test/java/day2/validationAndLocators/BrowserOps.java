package day2.validationAndLocators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserOps {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		//to maximize browser window use
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//to minimize browser window use
		driver.manage().window().minimize();
		//to set browser window based on our need
		driver.manage().window().setSize(new Dimension(500, 400));
		//to maximize browser window use
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		System.out.println("************ WELCOME PAGE TITLE IS\n\t\t "+driver.getTitle());
		driver.findElement(By.linkText("Log in")).click();
		System.out.println("************ LOGIN PAGE TITLE IS\n\t\t "+driver.getTitle());
		//if you want to go back to Welcome page again
		driver.navigate().back();
		System.out.println("************ After coming back,WELCOME PAGE TITLE IS\n\t\t "+driver.getTitle());
		//if you want to come back to login page again
		driver.navigate().forward();
		System.out.println("************ After coming back,LOGIN PAGE TITLE IS\n\t\t "+driver.getTitle());
		//reload or refresh
		driver.navigate().refresh();
		//if you want to move to another page
		driver.navigate().to("https://demowebshop.tricentis.com/books");

	}

}
