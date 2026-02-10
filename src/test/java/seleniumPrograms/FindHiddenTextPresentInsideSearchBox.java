package seleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class FindHiddenTextPresentInsideSearchBox {

	@Test
	public static void testcases() throws InterruptedException {

		RemoteWebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		// Locate search box
		WebElement searchBox = driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]"));

		// Get text from search box
		String searchText = searchBox.getAttribute("placeholder");

        // System.out.println("Text entered in search box: " + searchText);
		System.out.println("\u001B[32mText entered in search box: " + searchText + "\u001B[0m");

		Thread.sleep(2000);
		driver.quit();

	}
}
