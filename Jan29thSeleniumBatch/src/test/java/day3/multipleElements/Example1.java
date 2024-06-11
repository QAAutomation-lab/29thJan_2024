package day3.multipleElements;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		//to maximize browser window use
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.demoblaze.com/");
		//identify all device name
		List<WebElement> deviceList=driver.findElements(By.cssSelector("#tbodyid>div>div>div>h4>a"));
		
		
		System.out.println("Total devices: "+deviceList.size());
		for(int i=0;i<deviceList.size();i++) {
//			WebElement element=deviceList.get(i);
//			String deviceName=element.getText();
//			System.out.println("Device name is: "+deviceName);
				//or
			System.out.println("Device name is: "+deviceList.get(i).getText());
			//TODO: also print device price
		}
	}

}
