package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchPageObject {
	
	ChromeDriver driver;

	By textbox_search = By.id("APjFqb");
	
	By searchbutton_search = By.name("btnK");
	
	public  GoogleSearchPageObject(ChromeDriver driver) {
		this.driver = driver;
		
	}
	
	public void setTextInTextBox(String text) {
		driver.findElement(textbox_search).sendKeys(text);
	}
	
	public void clickSearchButton() {
		driver.findElement(searchbutton_search).sendKeys(Keys.RETURN);
	}
	
}
