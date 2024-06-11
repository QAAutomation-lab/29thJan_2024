package utilities;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumUtil {

	public static WebDriver driver=null;
	public static WebDriverWait wait=null;
	
	public WebDriver setUp(String browserName,String appUrl) {		
		if(browserName.equalsIgnoreCase("chrome")) {
			driver=new ChromeDriver();
		}else if(browserName.equalsIgnoreCase("firefox")) {
			driver=new FirefoxDriver();
		}else if(browserName.equalsIgnoreCase("edge")) {
			driver=new EdgeDriver();
		}		
		//to maximize browser window use
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//explicit wait WebDriverWait
		wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		driver.get(appUrl);
		return driver;
	}
	
	public void setSleep(long time) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
