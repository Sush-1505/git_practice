package tryyyy;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Decathlon {

	public void jaketTest() throws InterruptedException {
		
		RemoteWebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.decathlon.in/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@href=\"https://www.decathlon.in/shop/Winter-Collection\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@href=\"https://www.decathlon.in/c/jackets-26192\"]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[contains(text(),'Men')")).click();
	}
}
