package day1.browseropening;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicOps {

	public static void main(String[] args) {
		
		//step1:
		WebDriver driver=new ChromeDriver();
		//step2: to enter url use get() method
		driver.get("https://www.google.com");
		//step3: to get title of the application from the browser use getTitle()
		String title=driver.getTitle();
		String expectedTitle="Google";
		if(title.equals(expectedTitle)) {
			System.out.println("Google search page opened");
		}else {
			System.out.println("Google search page is not opened");
		}
		//step4: print title and content count
		System.out.println("Title is: "+title);
		System.out.println("Char in title is: "+title.length());
		//step5: to get application current url use getCurrentUrl()
		String currentUrl=driver.getCurrentUrl();
		System.out.println("currentUrl is: "+currentUrl);
		System.out.println("Char in currentUrl is: "+currentUrl.length());
		//step6: to close browser use close()
		driver.close();
	}
}
/*
Open chrome browser
enter google url
get the page title 
print the title and title text count in the console
get the current url from browser
print the current url and content count in the console
close the browser
*/