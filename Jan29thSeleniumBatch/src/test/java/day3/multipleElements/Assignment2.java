package day3.multipleElements;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		//to maximize browser window use
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://sampleapp.tricentis.com/101/app.php");
		
		WebElement drop=driver.findElement(By.id("make"));
		Select s1=new Select(drop);
		
		List<String> actualMakeList=new ArrayList<String>();
		
		for(int i=1;i< s1.getOptions().size();i++) {
			actualMakeList.add(s1.getOptions().get(i).getText());
		}
		List<String> expectedMakeList=new ArrayList<String>(actualMakeList);
		
		Collections.sort(actualMakeList);
		
		System.out.println(actualMakeList.equals(expectedMakeList));

	}

}
/*
open browser and enter url as https://sampleapp.tricentis.com/101/app.php

validate all dropdown for
	- default selection
	- print option count
	- validate Make, Number of Seats and Fuel Type dropdown options are on ascending order
	- Select any option and validate new selecting is reflecting or not
also validate Request Demo button
	- its text
	- Button color
	- Text color
	- Text size
	- text family
*/