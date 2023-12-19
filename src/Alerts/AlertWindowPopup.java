package Alerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertWindowPopup {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://html.com/input-type-file/");
		
		WebElement chooseButton = driver.findElement(By.id("fileupload"));
		chooseButton.sendKeys("path of file  to uploa");
		

	}

}
