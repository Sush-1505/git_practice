package seleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicTable {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://practice.expandtesting.com/dynamic-table");
		Thread.sleep(2000);
		
		int row=driver.findElements(By.xpath("//table/tbody/tr")).size();
		
		int col=driver.findElements(By.xpath("//table/tbody/tr[1]/td")).size();
				
		for(int i=1;i<=row;i++) {
			
			String rowText=driver.findElement(By.xpath("//table/tbody/tr[" + i + "]/td[1]")).getText();
			
			for(int j=1;j<=col;j++) {
				
				if(rowText.equalsIgnoreCase("System")) {
					
					String colText=driver.findElement(By.xpath("//table/thead/tr[1]/th["+j+"]")).getText();
					
					if(colText.equalsIgnoreCase("CPU")) {
						
						WebElement element=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td["+j+"]"));
						System.out.println(element.getText());
						break;
					}
				}
			}
					}
		driver.quit();
	}
}
