package day6.jsexamples;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.SeleniumUtil;

public class ScreenshotExample {

	public static void main(String[] args) throws IOException {
		SeleniumUtil s1=new SeleniumUtil();
		WebDriver driver=s1.setUp("chrome", "https://demo.automationtesting.in/Register.html");
		
		driver.findElement(By.cssSelector(".ui-autocomplete-multiselect")).click();
		
		List<WebElement> langList=driver.findElements(By.cssSelector(".ui-autocomplete.ui-widget-content>li>a"));
		
		//type cast browser instance into TakeScreenShot interface
		TakesScreenshot ts=(TakesScreenshot)driver;
		//get screenshot 
		File screenshot=ts.getScreenshotAs(OutputType.FILE);
		//save screenshot into the required location
		FileUtils.copyFile(screenshot, new File(".\\screenshots\\Language.png"));
		
		for(WebElement element: langList) {
			System.out.println(element.getText());
		}

		langList.get(2).click();
		//get screenshot 
		File screenshot2=ts.getScreenshotAs(OutputType.FILE);
		//save screenshot into the required location
		FileUtils.copyFile(screenshot2, new File(".\\screenshots\\Language2.png"));
	}

}
/*
fill all the required data in to this application https://demo.automationtesting.in/Register.html
using property


*/