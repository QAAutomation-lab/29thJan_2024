package day7.brokenlinks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utilities.SeleniumUtil;

public class HandlingJSPopups extends SeleniumUtil{

	public static void main(String[] args) {
		HandlingJSPopups ref=new HandlingJSPopups();
		//ref.handleAlertPopup();
		//ref.handleConfirmPopup();
		ref.handlePromptPopup();
	}
	
	public void handlePromptPopup() {
		WebDriver driver=setUp("chrome", "https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		//1st move control inside frame as try it button present inside frame
		driver.switchTo().frame("iframeResult");
		
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		
		System.out.println("Popup msg: "+driver.switchTo().alert().getText());
		driver.switchTo().alert().sendKeys("Pune");
		//driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();
		
		String buttonPressed=driver.findElement(By.id("demo")).getText();
		System.out.println(buttonPressed);
	}
	
	
	public void handleConfirmPopup() {
		WebDriver driver=setUp("chrome", "https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		//1st move control inside frame as try it button present inside frame
		driver.switchTo().frame("iframeResult");
		
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		
		System.out.println("Popup msg: "+driver.switchTo().alert().getText());
		
		//driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();
		
		String buttonPressed=driver.findElement(By.id("demo")).getText();
		System.out.println(buttonPressed);
	}
	
	public void handleAlertPopup() {
		WebDriver driver=setUp("chrome", "https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
		//1st move control inside frame as try it button present inside frame
		driver.switchTo().frame("iframeResult");
		
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		
		System.out.println("Popup msg: "+driver.switchTo().alert().getText());
		
		driver.switchTo().alert().accept();
	}

}
