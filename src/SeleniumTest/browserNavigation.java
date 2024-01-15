package SeleniumTest;



import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Assert;

import org.apache.commons.io.FileUtils;


public class browserNavigation {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		//driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		driver.get("https://www.google.com/");
		
		takeScreenshot(driver, "/Users/heenahans/Documents/TestPrac/JavaProjects/SeleniumTest/src/screenshots/google.jpg");
		
		driver.navigate().to("https://www.amazon.com/");
		
		
		
		String pageTitle = driver.getTitle();
		
		Assert.assertEquals(pageTitle, "Amazon.com. Spend less. Smile more.");
		
		if (pageTitle.contains("Amazon.com")) {
			System.out.println(pageTitle);
		}
		
		
		takeScreenshot(driver, "/Users/heenahans/Documents/TestPrac/JavaProjects/SeleniumTest/src/screenshots/amazon.jpg");
		
		driver.navigate().back();
		Thread.sleep(300);
		
		String pageTitle1 = driver.getTitle();
		Assert.assertEquals(pageTitle1, "Google");
		
		if (pageTitle1.contains("Google")) {
			System.out.println(pageTitle1);
		}
		
		
		driver.navigate().forward();
		Thread.sleep(300);
		
		String pageTitle2 = driver.getTitle();
		Assert.assertEquals(pageTitle2, "Amazon.com. Spend less. Smile more.");
		
		if (pageTitle.contains("Amazon.com")) {
			System.out.println(pageTitle2);
		}
		
		
		driver.navigate().refresh();
		Thread.sleep(300);
		String pageTitle3 = driver.getTitle();
		Assert.assertEquals(pageTitle3, "Amazon.com. Spend less. Smile more.");
		
		
		driver.quit();
		
		
	}

	
	public static void takeScreenshot(WebDriver driver, String filePath) throws IOException {
		
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
		File DestFile = new File(filePath);
		
		FileUtils.copyFile(src, DestFile);
	}
	
}
