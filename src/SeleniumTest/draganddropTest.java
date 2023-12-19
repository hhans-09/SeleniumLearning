package SeleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class draganddropTest {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
		WebDriver driver = new ChromeDriver();

		driver.get("https://formy-project.herokuapp.com/dragdrop");
		
		WebElement dragImage = driver.findElement(By.id("image"));
		
		WebElement box = driver.findElement(By.id("box"));
		
		Actions action = new Actions(driver);
		
		action.dragAndDrop(dragImage, box).build().perform();
		
		Thread.sleep(1000);
		
		
		driver.quit();
		
		
	}

}
