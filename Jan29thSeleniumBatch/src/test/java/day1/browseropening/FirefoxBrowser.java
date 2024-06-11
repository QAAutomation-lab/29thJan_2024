package day1.browseropening;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowser {

	public static void main(String[] args) {
		//to open chrome browser create an instance of EdgeDriver class
		EdgeDriver edriver=new EdgeDriver();

	}
}
/*
 * on each run selenium opens new browser, it won't work on already opened browser
 * Browser opened by selenium, won't be having-
 * 	- history
 * 	- cookies
 *  - plugins
 */
