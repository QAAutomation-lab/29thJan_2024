package day3.multipleElements;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CustomDropdownHandling {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		//to maximize browser window use
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://thompsonsj.com/bootstrap-select-dropdown/");
		
		driver.findElement(By.cssSelector(".btn.btn-primary.dropdown-toggle")).click();
		
		List<WebElement> countryList=driver.findElements(By.cssSelector(".dropdown-menu.show>div>a"));
		
		System.out.println("Country count is: "+countryList.size());
		
		for(WebElement element:countryList) {
			System.out.println(element.getText());
		}
		countryList.get(2).click();
	}

}
