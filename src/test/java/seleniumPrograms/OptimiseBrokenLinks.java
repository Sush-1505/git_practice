package seleniumPrograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class OptimiseBrokenLinks {

	public static void main(String[] args) {

		 RemoteWebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://practice.expandtesting.com/dynamic-table");

	        // Get all headers
	        List<WebElement> headers = driver.findElements(By.xpath("//table/thead/tr/th"));

	        int networkColIndex = -1;

	        // Find column index for "Network"
	        for (int i = 0; i < headers.size(); i++) {
	            if (headers.get(i).getText().equalsIgnoreCase("Network")) {
	                networkColIndex = i;
	                break;
	            }
	        }

	        // Get all rows
	        List<WebElement> rows = driver.findElements(By.xpath("//table/tbody/tr"));

	        for (WebElement row : rows) {

	            List<WebElement> cells = row.findElements(By.tagName("td"));

	            if (cells.get(0).getText().equalsIgnoreCase("Chrome")) {

	                String networkData = cells.get(networkColIndex).getText();
	                System.out.println("Network usage: " + networkData);
	                break; // stop once found
	            }
	        }

	        driver.quit();
	    }
	
	}


