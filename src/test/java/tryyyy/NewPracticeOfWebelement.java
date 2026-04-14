package tryyyy;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NewPracticeOfWebelement {

	public static void main(String[] args) throws InterruptedException {

		RemoteWebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://accounts.practo.com/edit_profile");
		Thread.sleep(2000);
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		
		By element=By.xpath("(//div[@class=\"selectize-input items full has-options has-items\"])[1]");
		
	    WebElement	Welement=wait.until(ExpectedConditions.visibilityOfElementLocated(element));
	    Welement.click();
	    
	    Thread.sleep(2000);
	}

}
