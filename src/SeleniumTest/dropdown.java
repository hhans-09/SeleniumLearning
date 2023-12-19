package SeleniumTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class dropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
		WebDriver driver = new ChromeDriver();

		driver.get("https://formy-project.herokuapp.com/dropdown");
		
		WebElement dropdownMenu = driver.findElement(By.id("dropdownMenuButton"));
		
		dropdownMenu.click();
		
		Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		WebElement autocomplete = driver.findElement(By.id("autocomplete"));
		wait.until(d -> autocomplete.isDisplayed());
		
		autocomplete.click();
		
//		Select drpValue = new Select(driver.findElement(By.className("div.dropdown-menu.show")));
//		
//		drpValue.selectByVisibleText("Datepicker");
//		
		Thread.sleep(1000);
		
		
		
		
		driver.quit();
	}

}
