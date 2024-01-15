package SeleniumTest;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		//driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		driver.findElement(By.id("input-email")).sendKeys("test_qa@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Cypress@123");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Total links on the page : "+links.size());
		
		for (WebElement link : links) {
			String url = link.getAttribute("href");
			if(url != null && !url.isEmpty()) {
				verifyLinkActive(url);
			}
		}
		
		
		driver.quit();
		
		
		
		
	}
	
	public static void verifyLinkActive(String linkUrl) {
		
		try {
			URL url = new URL(linkUrl);
			
			HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
			httpURLConnection.setConnectTimeout(3000);
			httpURLConnection.connect();
			
			if(httpURLConnection.getResponseCode() == 200) {
				System.out.println(linkUrl + ":" + httpURLConnection.getResponseMessage());
			} else {
				System.out.println(linkUrl + ":" + httpURLConnection.getResponseMessage() + "- "+ httpURLConnection.HTTP_NOT_FOUND );
			}
			httpURLConnection.disconnect();
		} catch (Exception e) {
			System.out.println(linkUrl + ":" + e.getMessage());
			e.printStackTrace();
		}
		
	}

}
