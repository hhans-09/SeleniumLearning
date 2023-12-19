package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webTest {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://formy-project.herokuapp.com/keypress");
		
		
		
		
		
	}

}
