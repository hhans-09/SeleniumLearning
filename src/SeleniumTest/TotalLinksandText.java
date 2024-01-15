package SeleniumTest;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalLinksandText {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		//driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		driver.get("https://www.ebay.com/");
		
		List <WebElement> linkList = driver.findElements(By.tagName("a"));
		
		
		System.out.println("Total links of the page: "+ linkList.size());
		
		
		// 1. Iterate through each element using this loop
		for(WebElement e : linkList) {
			
			String linkText = e.getText();
			if(!linkText.isBlank()) {
				System.out.println(linkText);
			}
			
		}
		
		// 2. or this type of for loop
//		for (int i = 0; i < linkList.size(); i++) {
//			
//			String linkText = linkList.get(i).getText();
//			
//			if(!linkText.isBlank()) {
//				System.out.println(linkText);
//			}
//			
//		}
		
		driver.quit();

	}

}
