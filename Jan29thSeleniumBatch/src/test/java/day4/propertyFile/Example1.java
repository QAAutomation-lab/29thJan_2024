package day4.propertyFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1 {

	public static void main(String[] args) throws IOException {
		//to read data from property file first initialize it
		FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\testdata\\AppData.properties");
		Properties prop=new Properties();
		prop.load(fis);
		
		WebDriver driver=new ChromeDriver();
		//to maximize browser window use
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));		
		driver.get(prop.getProperty("appUrl"));
		
		driver.findElement(By.id("username")).sendKeys(prop.getProperty("username"));
		driver.findElement(By.name("pwd")).sendKeys(prop.getProperty("password"));
	}

}
