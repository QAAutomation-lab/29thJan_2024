package day7.brokenlinks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.SeleniumUtil;

public class HandlingFrame extends SeleniumUtil{

	public static void main(String[] args) {
		HandlingFrame ref=new HandlingFrame();
		ref.selectRadioAndCheckbox();
	}
	
	public void performSorting() {
		//TODO: https://jqueryui.com/sortable/ sort element from 7 to 1
	}

	public void selectRadioAndCheckbox() {
		WebDriver driver=setUp("chrome", "https://jqueryui.com/");
		driver.findElement(By.xpath("//a[text()='Checkboxradio']")).click();
		
		//identify frame first
		WebElement frme=driver.findElement(By.cssSelector(".demo-frame"));
		//move control inside the frame
		driver.switchTo().frame(frme);
		
		driver.findElement(By.xpath("//label[@for='radio-2']")).click();
		
		driver.findElement(By.xpath("//label[@for='checkbox-4']")).click();
		
		driver.findElement(By.xpath("//label[@for='checkbox-nested-4']")).click();
		
		//to get control back to main page use
		driver.switchTo().defaultContent();
		
		driver.findElement(By.cssSelector(".logo")).click();
	}
}
