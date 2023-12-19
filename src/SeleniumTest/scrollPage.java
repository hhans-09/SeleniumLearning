package SeleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class scrollPage {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
		WebDriver driver = new ChromeDriver();

		driver.get("https://formy-project.herokuapp.com/scroll");

		WebElement name = driver.findElement(By.id("name"));

		Actions action = new Actions(driver);

		action.moveToElement(name);

		name.sendKeys("Heena Hans");

		WebElement date = driver.findElement(By.id("date"));
		date.sendKeys("12/05/2023");

		System.out.println("End of test");

		driver.quit();

	}

}
