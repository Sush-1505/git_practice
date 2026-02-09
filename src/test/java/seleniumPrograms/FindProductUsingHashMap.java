package seleniumPrograms;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

 public class FindProductUsingHashMap {
	
	
	@Test
	public static void testcases() throws InterruptedException {
		
	RemoteWebDriver driver = new ChromeDriver();
	
	driver.get("https://www.amazon.in");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	WebElement search = driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]"));
	search.sendKeys("iphone 16",Keys.ENTER);
	
	Thread.sleep(2000);
	WebElement firstProduct = driver.findElement(By.xpath("(//span[contains(text(),'iPhone 16 Pro')])[1]"));
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].scrollIntoView(true);", firstProduct);
	js.executeScript("arguments[0].style.backgroundColor='yellow'; arguments[0].style.border='3px solid red'", firstProduct);
	
	HashMap<String, String> product = new HashMap<>();
	product.put("ProductName", firstProduct.getText());

    System.out.println("Product Name: " + product.get("ProductName"));
    Thread.sleep(4000);
    driver.close();
	}
} 
