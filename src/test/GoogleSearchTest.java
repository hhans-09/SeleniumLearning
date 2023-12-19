package test;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.Googleseachpage;

public class GoogleSearchTest {
	
	public static void main(String[] args) throws InterruptedException {
		GoogleSeach();
		
	}
	
	private static ChromeDriver driver = null;
	
	public static void GoogleSeach() throws InterruptedException {
		
		System.out.println("Test started");
		
		driver = new ChromeDriver();
		
		driver.get("https://google.com");

		Googleseachpage.textbox_search(driver).sendKeys("selenium test");
		Googleseachpage.textbox_search(driver).sendKeys(Keys.RETURN);
		//Googleseachpage.search_button(driver).click();
		
		Thread.sleep(3000);
		
		driver.close();
		
		System.out.println("Test Completed");
	}
	
	
	
	
	
	
	

}
