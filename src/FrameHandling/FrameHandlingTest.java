package FrameHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandlingTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.globalsqa.com/demo-site/frames-and-windows/#iFrame");
		
		WebElement frame_element = driver.findElement(By.id("globalSqa"));
		
		driver.switchTo().frame(frame_element);
		
		driver.findElement(By.xpath(""));
		
		
		
	}

}
