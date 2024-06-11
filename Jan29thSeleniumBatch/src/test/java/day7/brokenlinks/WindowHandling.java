package day7.brokenlinks;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utilities.SeleniumUtil;

public class WindowHandling  extends SeleniumUtil{

	public static void main(String[] args) {
		WindowHandling ref=new WindowHandling();
		ref.handleNewWindow();

	}
	
	public void handleTab() {
		/*
		*   https://erail.in/
			click on Tour Packages
			select Bharat Gourav from Category
			select Pune from Origin
			get train name and price
			go back home page
			perform following
			1. from: Pune
			2. to: Bangalore
			3. date from next month
			4. click on get trains
			print all the train numbers and name which are running on that particular date
		 */
	}
	
	public void handleNewWindow() {
		WebDriver driver=setUp("chrome", "https://etrain.info/in");
		System.out.println("Home page title: "+driver.getTitle());
		
		//get parent window id
		String homeWinId=driver.getWindowHandle();//T1
		//perform operation that opens new tab/window
		driver.findElement(By.xpath("//a[@href='https://www.linkedin.com/company/Tripozo']")).click();
		//get all windows id opened by current browser instance
		Set<String> allWinId=driver.getWindowHandles();//T1, T2
		
		/*get child window/tab id -
		 * from allWinId remove homeWinId dn use iterator to get child window id
		 */
		allWinId.remove(homeWinId);
		Iterator<String> itr=allWinId.iterator();
		String childWinId=itr.next();
		
		//now you can move from Home window to child window and perform any required operation on child window
		driver.switchTo().window(childWinId);
		System.out.println("Child page title(linkedin): "+driver.getTitle());
		//if you want to close only current window i.e: linkedin
		//driver.close();
		
		//after closing child window control won;t move to main page for that explicitly we need to move
		driver.switchTo().window(homeWinId);
		System.out.println("Home page title: "+driver.getTitle());
		
		//driver.close();
		
		//if you want to close all driver instance once
		driver.quit();
	}

}
