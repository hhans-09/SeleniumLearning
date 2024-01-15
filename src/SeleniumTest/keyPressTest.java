package SeleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class keyPressTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://formy-project.herokuapp.com/keypress");
		
		WebElement name = driver.findElement(By.id("name"));
		name.click();
		
		name.sendKeys("Heena Hans");
		
		WebElement button = driver.findElement(By.id("button"));
		
		button.click();
		
		driver.wait(200);
		
		
		driver.quit();

	}

}
 