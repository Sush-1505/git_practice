package seleniumPrograms;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class BrokenLinks {

	@SuppressWarnings("deprecation")
	
	public static void main(String[] args) {

		RemoteWebDriver driver=new ChromeDriver();
        driver.get("https://www.homecentre.in/in/en/");

        List<WebElement> links = driver.findElements(By.tagName("a"));

        for (WebElement link : links) {
            String url = link.getAttribute("href");

            if (url == null || url.isEmpty()) {
                System.out.println("Empty or missing URL → " + url);
                continue;
            }

            try {
                HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
                conn.setRequestMethod("HEAD");
                conn.connect();
                int code = conn.getResponseCode();

                if (code >= 400) {
                    System.out.println("Broken Link → " + url + " | Status: " + code);
                } else {
                    System.out.println("Valid Link → " + url + " | Status: " + code);
                }
            } catch (Exception e) {
                System.out.println("Error checking link → " + url);
            }

        }
}}