package day3.multipleElements;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example2 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		//to maximize browser window use
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Selenium");
		
		//identify all device name
		List<WebElement> suggList=driver.findElements(By.cssSelector("ul.G43f7e>li>div>div:nth-of-type(2)>*:first-child>*:first-child>span"));
	
		System.out.println(suggList.size());
		
		for(int i=0;i<suggList.size();i++) {
			//StaleElementReferenceException: you will getting this exception due to DOM reload issue
			//to avoid this re-identify the element for which you are getting this exception
			suggList=driver.findElements(By.cssSelector("ul.G43f7e>li>div>div:nth-of-type(2)>*:first-child>*:first-child>span"));
			System.out.println(suggList.get(i).getText());
		}
	}

}
