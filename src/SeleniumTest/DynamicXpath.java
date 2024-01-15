package SeleniumTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DynamicXpath {
	
	/* Dynamic Xpath Examples :
	 * 
	 * Xpath starts with '//' and the <html tag>
	 * 
	 * Contains ( @id or @class or text())
	 * //input[contains(@class,'gh-tb')]
	 * 
	 * Starts-with or ends-with ( @id, @class ....)
	 * //input[starts-with(@class,'btn')]
	 * 
	 * by @id or @class 
	 * //select[@class='gh-sb ']
	 * 
	 */
	

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		//driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		driver.get("https://www.ebay.com/");
		
		driver.findElement(By.xpath("//input[contains(@class,'gh-tb')]"))
		.sendKeys("Iron Flame");
		
		Thread.sleep(2000);

		WebElement dropDown = driver.findElement(By.xpath("//select[@class='gh-sb ']"));
		dropDown.click();
		
		Select select = new Select(dropDown);
		
		select.selectByVisibleText("Books");
		
		driver.findElement(By.xpath("//input[starts-with(@class,'btn')]")).click();
		
		Thread.sleep(2000);
		
		driver.quit();
	}

}
