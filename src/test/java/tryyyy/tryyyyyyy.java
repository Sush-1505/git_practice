package tryyyy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class tryyyyyyy {

	@Test
	public static void wood() {
		RemoteWebDriver driver=new ChromeDriver();
		driver.get("https://www.woodenstreet.com/");
		driver.manage().window().maximize();
		Actions act=new Actions(driver);
		WebElement elemnt=driver.findElement(By.cssSelector("ul.style_headerMenu__YKf8q>li:nth-child(6)"));
		act.moveToElement(elemnt).perform();
	}
}
