package SeleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;

public class javascriptTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
		WebDriver driver = new ChromeDriver();

		driver.get("https://formy-project.herokuapp.com/modal");
		
		WebElement modalButton = driver.findElement(By.id("modal-button"));
		modalButton.click();
		
		
		WebElement closeButton = driver.findElement(By.id("close-button"));
		
		Thread.sleep(1000);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", closeButton);
		
		Thread.sleep(1000);
		driver.quit();


	}

}
