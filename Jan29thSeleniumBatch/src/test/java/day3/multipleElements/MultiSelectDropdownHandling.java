package day3.multipleElements;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectDropdownHandling {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		//to maximize browser window use
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://omayo.blogspot.com/");
		//identify the required dropdown list
		WebElement dropdown=driver.findElement(By.id("multiselect1"));
		//Create an instance of Select class and pass identified dropdown instance to its constructor
		Select select=new Select(dropdown);
		//you can perform any required operation on dropdown using select class instance
		System.out.println("Is my dropdown allow multiple selection ? "+select.isMultiple());
		
		System.out.println("Option count in dropdown: "+select.getOptions().size());
		
		select.selectByIndex(2);
		System.out.println("Selected option from index 2: "+select.getFirstSelectedOption().getText());
		
		select.selectByValue("swiftx");
		System.out.println("Selected option using value as 'swiftx' : "+select.getFirstSelectedOption().getText());
		
		select.selectByVisibleText("Audi");
		System.out.println("Selected option using visible text as 'Audi' : "+select.getFirstSelectedOption().getText());
	
		System.out.println("Selected option count is: "+select.getAllSelectedOptions().size());
		
		select.deselectAll();
		
	}

}
