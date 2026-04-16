package seleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class RunSeleniumOnAlreadyOpenBrowser { 
	
	@Test
	public void openBrowser() throws InterruptedException {
//		ChromeOptions options = new ChromeOptions();
//		options.setExperimentalOption("debuggerAddress", "localhost:9222");
//
//		WebDriver driver = new ChromeDriver(options);
//		driver.manage().window().maximize();
//		driver.get("https://www.amazon.in");
//		Thread.sleep(2000);
//        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Laptop");
//        Thread.sleep(2000);
//        System.out.println("Program run succesfully");
//	driver.quit();
		
		
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("debuggerAddress", "localhost:9222");

		WebDriver driver = new ChromeDriver(options);

		driver.get("https://www.amazon.in");

		Thread.sleep(2000);

		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Laptop");

		Thread.sleep(2000);

		System.out.println("Program run successfully");
	}
}

//Open Command prompt and give below command after run selenium code
//"C:\Program Files (x86)\Google\Chrome\Application\chrome.exe" --remote-debugging-port=9222 --user-data-dir="C:\chrome-debug"



