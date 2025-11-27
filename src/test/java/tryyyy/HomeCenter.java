package tryyyy;

import java.awt.Dimension;
import java.awt.Point;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomeCenter {

	@Test
	public static void homeCentre() throws InterruptedException {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		RemoteWebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.homecentre.in/in/en/");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[id=\"moe-dontallow_button\"]")).click();
		WebElement bedroom=driver.findElement(By.cssSelector("div[id=\"dept-bedroom\"]"));
		Actions act=new Actions(driver);
		act.moveToElement(bedroom).perform();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("a[href=\"/in/en/c/bedroom-beds-kingbeds\"]")).click();
		Thread.sleep(2000);
		WebElement min=driver.findElement(By.cssSelector("input[aria-label=\"minimum-input\"]"));
		min.clear();
		Thread.sleep(1000);
		min.sendKeys("20000");
		Thread.sleep(1000);
		WebElement max=driver.findElement(By.cssSelector("input[aria-label=\"maximum-input\"]"));
		max.clear();
		Thread.sleep(1000);
		max.sendKeys("50000");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("button[aria-label=\"right-arrow-icon\"]")).click();
		Thread.sleep(2000);
		List<WebElement>list=driver.findElements(By.cssSelector("div[class=\"MuiGrid-root MuiGrid-container MuiGrid-spacing-xs-2\"]>div"));
		for (WebElement elements : list) {
			
			System.out.println(elements.getText()+"   ");
		}
		
		int totalItems=list.size();
		System.out.println();
		System.out.println(totalItems+"  Size of list");
		
	    WebElement listItemText=	driver.findElement(By.cssSelector("div[id=\"list-sec\"]>div>div:nth-child(4) div div div p"));
		System.out.println(listItemText.getText());
		
		String listCount=listItemText.getText();
		String count=listCount.substring(2,5).trim();
		System.out.println(count);
		
		int countList=Integer.parseInt(count);
		
		System.out.println();
		System.out.println(countList);
		
		Assert.assertEquals(totalItems, countList);
		
		driver.quit();
			
	}
	@Test
	public static void searchBox() throws InterruptedException {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		RemoteWebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.homecentre.in/in/en/");
		Thread.sleep(3000);
		WebElement searchBox=driver.findElement(By.cssSelector("input[type=\"search\"]"));
		searchBox.sendKeys("King size Bed");
		Thread.sleep(2000);
		searchBox.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[type=\"button\"]>span[class=\"MuiButton-label\"]>div:nth-child(1)")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("ul[class=\"MuiList-root MuiList-padding\"]>div:nth-child(1)")).click();
		Thread.sleep(2000);
		//driver.findElement(By.cssSelector("button[id=\"moe-dontallow_button\"]")).click();
		//Thread.sleep(2000);
		WebElement listItemText=driver.findElement(By.cssSelector("div[id=\"list-sec\"]>div>div>div>div>div>div>p"));
		System.out.println(listItemText.getText());
		
		String listCount=listItemText.getText();
		String count=listCount.substring(2,5).trim();
		System.out.println(count);
		
		int countList=Integer.parseInt(count);
		
		Thread.sleep(2000);

		List<WebElement>firstPage=driver.findElements(By.cssSelector("div[id=\"plp-list\"]>div>div"));
		Thread.sleep(2000);
		int firstPageSize=firstPage.size();
		//driver.findElement(By.cssSelector("div[id=\"plp-list\"]>div+div>button+p+button")).click();
		//Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight);");

		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='NEXT PAGE']")).click();
		Thread.sleep(2000);
		List<WebElement>secondPage=driver.findElements(By.cssSelector("div[id=\"plp-list\"]>div>div"));
		int secondPageSize=secondPage.size();
		Thread.sleep(2000);
		int totalSize=firstPageSize+secondPageSize;
		
		Assert.assertEquals(totalSize, countList);
		driver.quit();
		 			
	}
	
	@Test
	public static void temp() throws InterruptedException {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		RemoteWebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.homecentre.in/in/en/");
		Thread.sleep(3000);
		WebElement searchBox=driver.findElement(By.cssSelector("input[type=\"search\"]"));
		searchBox.sendKeys("King size Bed");
		Thread.sleep(2000);
		searchBox.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[type=\"button\"]>span[class=\"MuiButton-label\"]>div:nth-child(1)")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("ul[class=\"MuiList-root MuiList-padding\"]>div:nth-child(1)")).click();
		Thread.sleep(2000);
		//driver.findElement(By.cssSelector("button[id=\"moe-dontallow_button\"]")).click();
		//Thread.sleep(2000);
		WebElement listItemText=driver.findElement(By.cssSelector("div[id=\"list-sec\"]>div>div>div>div>div>div>p"));
		System.out.println(listItemText.getText());
		
		WebElement nextPage=driver.findElement(By.xpath("//span[text()='NEXT PAGE']"));
		Dimension d=new Dimension();
		System.out.println(d.getSize());
		
		Point p=new Point();
		System.out.println(p.getLocation());
		
		driver.quit();

	}
}
