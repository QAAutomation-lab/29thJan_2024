package day1.browseropening;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser {

	public static void main(String[] args) {
		//to open chrome browser create an instance of ChromeDriver class
		ChromeDriver cdriver=new ChromeDriver();//ctrl+shft+o

	}
}
/*
 * on each run selenium opens new browser, it won't work on already opened browser
 * Browser opened by selenium, won't be having-
 * 	- history
 * 	- cookies
 *  - plugins
 */
