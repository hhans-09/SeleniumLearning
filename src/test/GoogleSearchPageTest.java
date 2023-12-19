package test;

import org.openqa.selenium.chrome.ChromeDriver;
import pages.GoogleSearchPageObject;

public class GoogleSearchPageTest {
	private static ChromeDriver driver = null;
	
	public static void main(String[] args) throws InterruptedException {
		
		GoogleSearchTest();
		
	}
	
	public static void GoogleSearchTest() throws InterruptedException {
		
		driver = new ChromeDriver();
		
		GoogleSearchPageObject searchPageObj = new GoogleSearchPageObject(driver);
		
		driver.get("https://google.com");
		
		searchPageObj.setTextInTextBox("Selenium Test Practice");
		searchPageObj.clickSearchButton();
		
		Thread.sleep(3000);
		
		driver.close();
		
	}

}
