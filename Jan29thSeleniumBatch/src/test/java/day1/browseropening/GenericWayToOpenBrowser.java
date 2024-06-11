package day1.browseropening;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GenericWayToOpenBrowser {

	public static void main(String[] args) {
		
		WebDriver driver1=new ChromeDriver();//example of runtime poly
		
		WebDriver driver2=new FirefoxDriver();
		
		WebDriver driver3=new EdgeDriver();
	}

}
