package Alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
		WebDriver driver = new ChromeDriver();

		driver.get("https://formy-project.herokuapp.com/switch-window");

		WebElement alertButton = driver.findElement(By.id("alert-button"));

		alertButton.click();

		Alert alert = driver.switchTo().alert();

		Thread.sleep(1000);
		
		String alertMessage = alert.getText();
		
		System.out.println(alertMessage);
		
		alert.accept();

		driver.quit();

	}

}
