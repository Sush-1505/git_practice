package com.wooden_street.base;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class base_class {

	public static RemoteWebDriver driver;
	public static void openBrowser(String browserName) {
		
		if(browserName.equalsIgnoreCase("chrome")) {
			driver=new ChromeDriver();
			System.out.println("Browser is opened");
		}
		else if(browserName.equalsIgnoreCase("firefox")){
			driver=new FirefoxDriver();
			System.out.println("Browser is opened");
		}
		else if(browserName.equalsIgnoreCase("Safari")) {
			driver=new SafariDriver();
			System.out.println("Browser is opened");
		}
		else {
			throw new Error("Invalid Browser Name "+browserName);
		}
		
		driver.manage().window().maximize();
	}
	
	public static void closeBrowser() {
		driver.quit();
	}
	
	public static void launchUrl(String url) {

		driver.get(url);
	}

}
