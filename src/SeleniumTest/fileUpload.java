package SeleniumTest;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class fileUpload {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
		WebDriver driver = new ChromeDriver();

		driver.get("https://formy-project.herokuapp.com/fileupload");
		
		WebElement fileuploadfield = driver.findElement(By.id("file-upload-field"));
		fileuploadfield.sendKeys("pathtofile");
	
		Thread.sleep(1000);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		
		driver.quit();
	}

}
