package seleniumPrograms;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class multiple_window {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
//		String id=driver.getWindowHandle();
//		System.out.println(id);
		driver.findElement(By.xpath("//a[@href=\"https://www.linkedin.com/company/orangehrm/mycompany/\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@href=\"https://www.facebook.com/OrangeHRM/\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@href=\"https://twitter.com/orangehrm?lang=en\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@href=\"https://www.youtube.com/c/OrangeHRMInc\"]")).click();
		
		Thread.sleep(3000);
		Set<String>ids=driver.getWindowHandles();
		System.out.println(ids);
		ArrayList<String>ids1=new ArrayList<>(ids);
		String parent=ids1.get(0);            // this 0,1,2,3 are the index number
		String linkedIN =ids1.get(1);   
		String fb=ids1.get(2);
		String x=ids1.get(3);
		String yt=ids1.get(4);
		
		
		driver.switchTo().window(parent);
		Thread.sleep(3000);
		String parenturl=driver.getCurrentUrl();
		System.out.println(parenturl);
		driver.switchTo().window(linkedIN);
		Thread.sleep(3000);
		String linkedInurl=driver.getCurrentUrl();
		System.out.println(linkedInurl);
		driver.switchTo().window(fb);
		Thread.sleep(3000);
		String fburl=driver.getCurrentUrl();
		System.out.println(fburl);
		driver.switchTo().window(x);
		Thread.sleep(3000);
		String xurl=driver.getCurrentUrl();
		System.out.println(xurl);
		driver.switchTo().window(yt);
		Thread.sleep(3000);
		String yturl=driver.getCurrentUrl();
		System.out.println(yturl);
		Thread.sleep(2000);
		
		driver.quit();
	
	}

}
