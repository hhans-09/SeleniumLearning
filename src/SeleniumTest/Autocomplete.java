package SeleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autocomplete {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://formy-project.herokuapp.com/autocomplete");
		
		WebElement address = driver.findElement(By.id("autocomplete"));
		
		
		address.sendKeys("11230 Broadstone Way, Apex, NC");
		
		
		driver.quit();

	}

}
