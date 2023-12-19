package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Googleseachpage {
	
	private static WebElement element = null;
	
	public static WebElement textbox_search(ChromeDriver driver) {
		
		element = driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
		return element;
	}

	public static WebElement search_button(ChromeDriver driver) {
		
		element = driver.findElement(By.name("btnK"));
		return element;
		
	}
}
