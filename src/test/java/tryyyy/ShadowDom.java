package tryyyy;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ShadowDom {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://dev.automationtesting.in/shadow-dom");
		Thread.sleep(2000);
		
		SearchContext shadow=driver.findElement(By.xpath("//div[@id=\"shadow-root\"]")).getShadowRoot();
		
		Thread.sleep(2000);
		
		SearchContext innershadow=shadow.findElement(By.cssSelector("#inner-shadow-dom")).getShadowRoot();
		
		String text=innershadow.findElement(By.cssSelector("#nested-shadow-element")).getText();
		
		System.out.println(text);
		
		driver.quit();
		
		
	}

}
