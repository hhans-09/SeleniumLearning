package SeleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkboxTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
		WebDriver driver = new ChromeDriver();

		driver.get("https://formy-project.herokuapp.com/checkbox");
		
		WebElement checkbox1 = driver.findElement(By.id("checkbox-1"));
		checkbox1.click();
		checkbox1.click();
		
		Thread.sleep(1000);
		
		WebElement checkbox2 = driver.findElement(By.cssSelector("input[value='checkbox-2']"));
		checkbox2.click();
		Thread.sleep(1000);
		
		WebElement checkbox3 = driver.findElement(By.xpath("//*[@id=\"checkbox-3\"]"));
		checkbox3.click();
		Thread.sleep(1000);
		
		driver.quit();
	}

}
